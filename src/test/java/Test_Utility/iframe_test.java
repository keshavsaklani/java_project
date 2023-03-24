package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.iframe_page;

public class iframe_test extends Base_library {
	iframe_page  ob;
	
	@BeforeTest
	public void geturl() {
		getLauncher(getreaddata("staginurl"));
		ob= new iframe_page();
		
	}

	@Test(priority=0)
	public void changefrmae1() {
		
		ob.changefrmae1();
		
	}
	
	@Test
	public void changefrmae2() throws InterruptedException {
		
		ob.changefrmae2();
		
	}
	
	
}
