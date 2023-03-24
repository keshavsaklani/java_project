package Page_Utility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exampledataprovider {

	
	@DataProvider ()

     Object[][] data(){

	Object[][] value= {{"keshav", 123},{"ackshay",146}};
	return value;


	}



	@Test (dataProvider= "data")

	public void fun(String parameter1, int parameter  ){



	}
}
