package org.rostlab.gemudb.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.rostlab.gemudb.dao.MutationDao;
import org.rostlab.gemudb.dao.SequenceDao;
import org.rostlab.gemudb.dom.Mutation;
import org.rostlab.gemudb.dom.MutationType;
import org.rostlab.gemudb.dom.Sequence;
import org.rostlab.gemudb.service.model.FunctionalEffectPrediction;
import org.rostlab.gemudb.service.model.MutationData;
import org.rostlab.gemudb.service.model.MutationPos;
import org.rostlab.gemudb.service.model.MutationPosContainer;
import org.rostlab.gemudb.service.model.MutationPredictionData;
import org.rostlab.gemudb.util.AminoLookup;

public class FunctionalEffectServiceImpl implements FunctionalEffectService {
	private static final String ALL_AMINO_ACIDS = "ACDEFGHIKLMNPQRSTVWY";
	private MutationDao mutationDao;
	private SequenceDao sequenceDao;

	@Override
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id, final MutationType type) {
		return getFunctionalEffectPrediction(id, type, ALL_AMINO_ACIDS);
	}

	@Override
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final String refId, final MutationType type, final String alphabet) {

		// catch sequence
		Boolean[] aaToPredict = new Boolean[21];
		Arrays.fill(aaToPredict, Boolean.FALSE);
		for (int i = 0; i < alphabet.length(); i++) {
			aaToPredict[AminoLookup.lookupAAtoIndex(alphabet.charAt(i))] = true;
		}
		Sequence sequence = sequenceDao.selectByRefId(refId);
		if (sequence != null) {
			final FunctionalEffectPrediction prediction = new FunctionalEffectPrediction();
			// select by id and type
			final List<Mutation> mutation = mutationDao.selectByIdAndType(
					sequence.getId(), type.getCode());
			prediction.setType(type);
			final StringBuilder reli = new StringBuilder();
			final StringBuilder cons = new StringBuilder();
			int currPos = 1;

			for (Mutation mut : mutation) {
				if (mut.getPos() != currPos) {
					while (currPos != mut.getPos()) {
						reli.append("-");
						cons.append("--"); // needed because of two digits
						currPos++;
					}
				}
				reli.append(calcReliability(mut.getMutReliability(),
						aaToPredict));

				Long conservation = calcConservation(mut.getMutEffect(),
						aaToPredict);
				String consString = conservation.toString();
				if (conservation < 10) {
					consString = "0" + consString;
				}
				cons.append(consString);
				currPos++;
			}
			prediction.setSequence(sequence.getSequence());
			prediction.setConservation(cons.toString());
			prediction.setReliability(reli.toString());
			return prediction;
		}
		return null;
	}

	private long calcConservation(Boolean[] effects, Boolean[] aaToPredict) {
		long sumEffect = 0;
		for (int i = 0; i < effects.length; i++)
			if (aaToPredict[i] == true) {
				sumEffect += (effects[i]) ? 1 : 0;
			}

		return sumEffect;
	}

	private long calcReliability(Integer[] reliability, Boolean[] aaToPredict) {
		float sumReli = 0;
		int counter = 0;
		for (int i = 0; i < reliability.length; i++)
			if (aaToPredict[i] == true) {
				counter++;
				sumReli += reliability[i];
			}
		return Math.round(sumReli / counter / 10) - 1;
	}

	public MutationDao getMutationDao() {
		return mutationDao;
	}

	public void setMutationDao(MutationDao mutationDao) {
		this.mutationDao = mutationDao;
	}

	public SequenceDao getSequenceDao() {
		return sequenceDao;
	}

	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}

	@Override
	public MutationPosContainer getFunctionalEffect(final String refId,
			final int pos, final MutationType type) {
		return getFunctionalEffect(refId, pos, type, ALL_AMINO_ACIDS);
	}

	private MutationData generateMutationData(Mutation mutationDb, Character aa) {
		final MutationData mutData = new MutationData();
		mutData.setAa(aa.toString());
		mutData.addData(new MutationPredictionData(mutationDb.getType()
				.toString(), mutationDb.getMutReliability()[AminoLookup
				.lookupAAtoIndex(aa)], mutationDb.getMutEffect()[AminoLookup
				.lookupAAtoIndex(aa)]));
		return mutData;
	}

	public boolean indexExists(@SuppressWarnings("rawtypes") final List list,
			final int index) {
		return index >= 0 && index < list.size();
	}

	@Override
	public MutationPosContainer getFunctionalEffect(final String refId,
			final Integer pos, final MutationType type, final String alphabet) {
		final Sequence sequence = sequenceDao.selectByRefId(refId);
		if (sequence == null)
			return null;
		
		final List<Mutation> mutationList;
		if(type.equals(MutationType.ALL)) {
			mutationList = mutationDao.selectByIdAndLimit(
					sequence.getId(), pos, 1);
		}
		else {
			mutationList = mutationDao.selectByIdAndLimit(
					sequence.getId(), pos, 1, type.getCode());
		}
		
		final String sequenceString = sequence.getSequence();
		final MutationPosContainer mutationPosContainer = new MutationPosContainer(
				1); // only one
		final List<MutationPos> retList = mutationPosContainer
				.getMutationsPos();
		MutationPos currentMutationPos = null;
		Map<Character, MutationData> aa_data_map = null;
		for (Mutation mutationDb : mutationList) {
			final int currPos = mutationDb.getPos() - pos;
			if (indexExists(retList, currPos) == false) {

				if (aa_data_map != null) {
					final List<MutationData> mutList = currentMutationPos
							.getMutations();

					for (Character key : aa_data_map.keySet()) {
						mutList.add(aa_data_map.get(key));
					}
				}
				currentMutationPos = new MutationPos();
				currentMutationPos.setPosition(mutationDb.getPos());
				retList.add(currPos, currentMutationPos);
				aa_data_map = new TreeMap<Character, MutationData>();

			}
			currentMutationPos = retList.get(currPos);

			final Character wildTypeAA = sequenceString.charAt(mutationDb
					.getPos() - 1);
			currentMutationPos.setWildType(wildTypeAA.toString());
			for (int aaindex = 0; aaindex < 21; aaindex++) {
				Character currAa = AminoLookup.reversLookup(aaindex);
				if (currAa.charValue() == 'X')
					continue;
				MutationData mutData = null;
				if ((mutData = aa_data_map.get(currAa)) == null) {
					mutData = generateMutationData(mutationDb,
							AminoLookup.reversLookup(aaindex));
					aa_data_map.put(currAa, mutData);
				} else {
					mutData.addData(new MutationPredictionData(mutationDb
							.getType().toString(), mutationDb
							.getMutReliability()[aaindex], mutationDb
							.getMutEffect()[aaindex]));
				}
			}

		}
		if (aa_data_map != null) {
			final List<MutationData> mutDataList = currentMutationPos
					.getMutations();

			for (Character key : aa_data_map.keySet()) {
				if (alphabet.contains(key.toString()) == true)
					mutDataList.add(aa_data_map.get(key));
			}
		}
		return mutationPosContainer;
	}

}
