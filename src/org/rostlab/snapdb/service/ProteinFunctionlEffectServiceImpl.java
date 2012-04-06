package org.rostlab.snapdb.service;

import java.util.List;

import org.rostlab.snapdb.dao.MutationDao;
import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.dom.Prediction;
import org.rostlab.snapdb.dom.PredictionType;
import org.rostlab.snapdb.dom.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.dom.Sequence;

public class ProteinFunctionlEffectServiceImpl implements
		ProteinFunctionalEffectService {
	private MutationDao mutationDao;
	private SequenceDao sequenceDao;

	@Override
	public ProteinFunctionalEffectPrediction getFunctionlEffectPrediction(
			String refId) {

		// catch sequence
		final ProteinFunctionalEffectPrediction pfep = new ProteinFunctionalEffectPrediction();
		Sequence sequence = sequenceDao.selectByRefId(refId);
		if (sequence != null) {
			pfep.setRefId(refId);
			pfep.setSequence(sequence.getSequence());
			for (PredictionType pt : PredictionType.values()) {
				final Prediction prediction = new Prediction();
				// select by id and type
				final List<Mutation> mutation = mutationDao.selectById(sequence
						.getId());
				prediction.setType(pt);
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
}
