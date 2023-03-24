package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.dataprovider_acess;

public class dataprovider_call extends Base_library {

	dataprovider_acess ob;
	
	@BeforeTest
	public void urllaunch() {
		
		getLauncher();
		
		ob= new dataprovider_acess();
	}
	
	
	@Test(dataProvider= "excel",dataProviderClass= Base_library.class )
	
	public void hrmdata(String name,  String email,String country) {
		
		ob.name();
		
	}
	
	
	
}
