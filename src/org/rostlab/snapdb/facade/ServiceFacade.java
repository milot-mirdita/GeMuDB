package org.rostlab.snapdb.facade;

import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;






public interface ServiceFacade  {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(String id);
	public ProteinId searchProtein(String searchString);
}
