package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.Radio_Button_page;

public class Radio_Button_Test extends Base_library {
	Radio_Button_page ob;
	@BeforeTest
	public void geturl() {
		
		getLauncher(getreaddata("preprodurl"));
		ob=new Radio_Button_page();
	}
	
	
	@Test
	public void clickonRadiobutton() {
		ob.clikonRadiobutton();
		
	}
	
	
	
	
}
