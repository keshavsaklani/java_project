package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.TextBoxPage;

public class TextBoxTest extends Base_library {
	TextBoxPage ob  ;

	@BeforeTest
	public void geturl() {

		// getLauncher( getreaddata("staginurl"));

		getLauncher(getreaddata("preprodurl"));
		
		ob= new TextBoxPage();
	}

	public void propertydetail() {
		getreaddata("staginurl");
	}

	@Test(priority=1)
	public void clickonElements() {
		ob.clickonelement();
}
	
	@Test(priority=2)
	public void filldeta() {
	ob.sendDetail();
	
	}
	@Test(priority=3)
	public void checkbox() {
		ob.clickcheckbox();
	}
	
	
	@Test(priority=4)
	public void checkdata() throws Exception {
		ob.checkboxx() ;
	}
	
//	@Test
//	public void sendDetail() {
//		ob.elementDetail();
//	}
}
