package org.rostlab.snapdb.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.rostlab.snapdb.dao.MutationDao;
import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.dom.MutationType;
import org.rostlab.snapdb.dom.Sequence;
import org.rostlab.snapdb.service.model.MutationData;
import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.MutationPredictionData;
import org.rostlab.snapdb.service.model.MutationsPos;
import org.rostlab.snapdb.service.model.Prediction;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.util.AminoLookup;

public class ProteinFunctionalEffectServiceImpl implements
		ProteinFunctionalEffectService {
	private MutationDao mutationDao;
	private SequenceDao sequenceDao;

	@Override
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id) {
		return getFunctionalEffectPrediction(id, "ACDEFGHIKLMNPQRSTVWY");
		//return getFunctionalEffectPrediction(id, "AY");
	}

	@Override
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			final String refId, final String alphabet) {

		// catch sequence
		Boolean[] aaToPredict = new Boolean[20];
		Arrays.fill(aaToPredict, Boolean.FALSE);
		for (int i = 0; i < alphabet.length(); i++) {
			aaToPredict[AminoLookup.lookupAAtoIndex(alphabet.charAt(i))] = true;
		}
		final ProteinFunctionalEffectPrediction pfep = new ProteinFunctionalEffectPrediction();
		Sequence sequence = sequenceDao.selectByRefId(refId);
		if (sequence != null) {
			pfep.setSequence(sequence.getSequence());
			for (MutationType mt : MutationType.values()) {
				final Prediction prediction = new Prediction();
				// select by id and type
				final List<Mutation> mutation = mutationDao.selectByIdAndType(
						sequence.getId(), mt.getCode());
				prediction.setType(mt);
				final StringBuilder reli = new StringBuilder();
				final StringBuilder cons = new StringBuilder();
				int currPos = 1;
				for (Mutation mut : mutation) {
					if (mut.getPos() != currPos) {
						while (currPos != mut.getPos()) {
							reli.append("-");
							cons.append("-");
							currPos++;
						}
					}
					reli.append(calcReliability(mut.getMutReliability(),
							aaToPredict));
					cons.append(calcConservation(mut.getMutEffect(),
							aaToPredict));
					currPos++;
				}
				prediction.setConservation(cons.toString());
				prediction.setReliability(reli.toString());
				pfep.addPrediction(prediction);
			}
			return pfep;
		}
		return null;
	}

	private long calcConservation(Boolean[] effects, Boolean[] aaToPredict) {
		float sumEffect = 0;
		int counter = 0;
		for (int i = 0; i < effects.length; i++)
			if (aaToPredict[i] == true) {
				counter++;
				sumEffect += (effects[i]) ? 1 : 0;
			}

		return Math.round(sumEffect / counter * 9);
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
	public MutationPosContainer getMutationList(final String refId, final int from,
			final int size) {

		Sequence sequence = sequenceDao.selectByRefId(refId);
		if(sequence==null)
			return null;
		List<Mutation> mutationList = mutationDao.selectByIdAndLimit(sequence.getId(), from,
				size);
		final String sequenceString = sequence.getSequence();
		final MutationPosContainer mutationPosContainer = new MutationPosContainer(
				size);
		List<MutationsPos> retList = mutationPosContainer.getMutationsPos();
		MutationsPos currentMutationPos;
		for (Mutation mutationDb : mutationList) {
			final int currPos = mutationDb.getPos() - from;
			if (indexExists(retList, currPos) == false) {
				currentMutationPos = new MutationsPos();
				currentMutationPos.setPosition(mutationDb.getPos());
				retList.add(currPos, currentMutationPos);
			}
			currentMutationPos = retList.get(currPos);

			final List<MutationData> mutDataList = currentMutationPos
					.getMutations();
			for (int aaindex = 0; aaindex < 20; aaindex++) {
				if (indexExists(mutDataList, aaindex) == true) {
					MutationData mutData = mutDataList.get(aaindex);
					mutData.addData(new MutationPredictionData(mutationDb
							.getType().toString(), mutationDb
							.getMutReliability()[aaindex], mutationDb
							.getMutEffect()[aaindex]));
				} else {
					mutDataList.add(generateMutationData(mutationDb,
							AminoLookup.reversLookup(aaindex)));
				}
			}
			// Reorder put wildtype in front
			char wildTypeAA = sequenceString.charAt(mutationDb.getPos() - 1);
			if (mutDataList.get(0).isWildType() == false) {
				int wildTypeIndex = AminoLookup.lookupAAtoIndex(wildTypeAA);
				MutationData wildTypeData = mutDataList.get(wildTypeIndex);
				wildTypeData.setWildType(true);
				Collections.sort(mutDataList);
			}
		}
		return mutationPosContainer;
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

}
