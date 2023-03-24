package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.checkboxPage;

public class checkboxText extends Base_library{
	checkboxPage ob;
@BeforeTest
public void openurl() {
	getLauncher(getreaddata("staginurl"));
	ob= new checkboxPage();
}
	@Test
	public void clickCheckbox() {
		ob.clickCheckboxbutton();
	}
}
