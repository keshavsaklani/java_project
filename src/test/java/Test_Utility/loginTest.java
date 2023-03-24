package Test_Utility;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
//import Base_Utility.Base_library;
import Page_Utility.loginPage;

public class loginTest extends Base_library {
	
	
	
 loginPage ob;
@BeforeTest
public void launchurl() {
	
	getLauncher(getreaddata("preprodurl"));
//	ob.loginPagee() ;
	ob= new loginPage();
}
@Test(priority=1)
public void getTitel() {

      ob.getVerifyTitel();
}







}





/*
@Test(priority=1)
public void clickonbutton() {
	//ob.clickonclosebutton();
	ob.clickonclosebutton();
}

@Test(priority=3)
public void clickbutton() {
	ob.clickonbutton();
}
}
*/