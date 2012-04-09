package org.rostlab.snapdb.service;

import java.util.ArrayList;
import java.util.List;

import org.rostlab.snapdb.dao.MutationDao;
import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.dom.MutationType;
import org.rostlab.snapdb.dom.Sequence;
import org.rostlab.snapdb.service.model.MutationData;
import org.rostlab.snapdb.service.model.MutationsPos;
import org.rostlab.snapdb.service.model.Prediction;
import org.rostlab.snapdb.service.model.PredictionType;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.util.AminoLookup;

public class ProteinFunctionalEffectServiceImpl implements
		ProteinFunctionalEffectService {
	private MutationDao mutationDao;
	private SequenceDao sequenceDao;

	@Override
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			Long lid) {

		// catch sequence
		final ProteinFunctionalEffectPrediction pfep = new ProteinFunctionalEffectPrediction();
		Sequence sequence = sequenceDao.selectById(lid);
		if (sequence != null) {
			pfep.setRefId(sequence.getRefId());
			pfep.setSequence(sequence.getSequence());
			for (MutationType mt : MutationType.values()) {
				final Prediction prediction = new Prediction();
				// select by id and type
				final List<Mutation> mutation = mutationDao.selectByIdAndType(sequence
						.getId(),mt.getCode());
				prediction.setType(mt);
				final StringBuilder reli = new StringBuilder();
				final StringBuilder cons = new StringBuilder();
				for (Mutation mut : mutation) {
					reli.append(calcReliability(mut.getMutReliability()));
					cons.append(calcConservation(mut.getMutEffect()));
				}
				prediction.setConservation(cons.toString());
				prediction.setReliability(reli.toString());
				pfep.addPrediction(prediction);
			}
			return pfep;
		}
		return null;
	}

	private long calcConservation(Boolean[] effects) {
		float sumEffect = 0;
		for (int i = 0; i < effects.length; i++)
			sumEffect += (effects[i]) ? 1 : 0;

		return Math.round(sumEffect / 19 * 10);
	}

	private long calcReliability(Integer[] reliability) {
		float sumReli = 0;
		for (int i = 0; i < reliability.length; i++)
			sumReli += reliability[i];
		return Math.round(sumReli / 19 / 10) - 1;
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
	public List<MutationsPos> getMutationList(Long id, int from, int size) {
		List<Mutation> mutationList = mutationDao.selectByIdAndLimit(id, from,
				size);
		List<MutationsPos> retList = new ArrayList<MutationsPos>(size);
		MutationsPos currentMutationPos;
		for (Mutation mutationDb : mutationList) {
			if (indexExists(retList, mutationDb.getPos() - 1) == false) {
				currentMutationPos = new MutationsPos();
				currentMutationPos.setPosition(mutationDb.getPos());
				retList.add(mutationDb.getPos() - 1, currentMutationPos);
			}
			currentMutationPos = retList.get(mutationDb.getPos() - 1);

			List<MutationData> mutDataList = currentMutationPos.getMutations();
			for (int aaindex = 0; aaindex < 20; aaindex++) {
				mutDataList.add(generateMutationData(mutationDb,
						AminoLookup.reversLookup(aaindex)));
			}
		}
		return retList;
	}

	private MutationData generateMutationData(Mutation mutationDb, Character aa) {
		final MutationData mutData = new MutationData();
		mutData.addData(mutationDb.getType().toString(),
				mutationDb.getMutReliability()[AminoLookup.lookupAAtoIndex(aa)]);
		return mutData;
	}

	public boolean indexExists(final List list, final int index) {
		return index >= 0 && index <= list.size();
	}
}
