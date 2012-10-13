import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.rostlab.predictprotein.PredictproteinDocument;



public class TestPredictProtein {
	@Test
	public void testCasePredictProtein(){
		final String xmlFilePath = "predictprotein_xml_source.xml";
		System.out.println("test");
		try {
			File xmlFile=new File(xmlFilePath);
			System.out.println("alsdfkjasdlf");
			System.out.println(xmlFile.exists());
			if(xmlFile.exists())
				PredictproteinDocument.Factory.parse(xmlFile);
		} catch (XmlException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		System.out.println("test2");
	}
}
