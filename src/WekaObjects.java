/**
 * 
 */
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

/**
 * @author David
 *
 */
public class WekaObjects {

	 Attribute Attribute1 = new Attribute("firstNumeric");
     Attribute Attribute2 = new Attribute("secondNumeric");
	/**
	 * @param args
	 */
     //Testing to check if it updates
     //Changes still upcoming 
     //Tell me 
     FastVector fvNominalVal = new FastVector(3);
     //fvNominalVal.addElement("red");
     ///fvNominalVal.addElement("gray");
     //fvNominalVal.addElement("black");
     Attribute Attribute3 = new Attribute("aNominal", fvNominalVal);
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public WekaObjects()
	{
		
		
	}

}
