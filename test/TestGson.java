import org.junit.Test;
import org.rostlab.snapdb.dom.Prediction;
import org.rostlab.snapdb.dom.PredictionType;
import org.rostlab.snapdb.dom.ProteinFunctionalEffectPrediction;

import com.google.gson.Gson;


public class TestGson {

	@Test
	public void test() {
		ProteinFunctionalEffectPrediction pfep = new ProteinFunctionalEffectPrediction();
		pfep.setRefId("LALA");
		pfep.setSequence("MKAQNLLKLTSPGPAPASCQHLQAQPLPHGGFSRPSSSSGLSLQAQLLLHNSLFWPSSCP");
		Prediction p1=new Prediction();
		p1.setConservation("01231051228590123850923185092135701239751293875120938571200");
		p1.setType(PredictionType.SNAP);
		p1.setReliability("01231051228590123850923185092135701239751293875120938571200");
		pfep.addPrediction(p1);
		String json = new Gson().toJson(pfep);
		System.out.println(json);
	}

}
