package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library_practise;
import Page_Utility.page_utility_practise;

public class test_utiliy_practise extends Base_library_practise {
	page_utility_practise ob;
	@BeforeTest
	public void getlaunchrl() {
		
		getlauchurl();
		ob= new page_utility_practise();
	}
	
	
	
	@Test(priority=1)
	public void changwindow() throws Exception  {
	ob.changewindow(); 
	}

	@Test(priority=2)
	public void clickme1() {
	ob.clickme1();
	}
	
	@Test(priority=3)
	public void clickme2() throws Exception {
	ob.clickme2();
	}
	
	@Test(priority=4)
	public void clickme3() throws Exception {
	ob.clickme3();
	}
	@Test(priority=5)
	public void  clickme4() throws Exception {
		ob.clickme4();
		
	}
	
}
