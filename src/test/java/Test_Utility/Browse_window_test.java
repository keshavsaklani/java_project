package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.Browse_window_page;

public class Browse_window_test extends Base_library  {
	Browse_window_page ob;
	@BeforeTest
	public void getlaunchurl() {
		getLauncher(getreaddata("staginurl"));
		
	
		ob= new Browse_window_page();
	}
	
	@Test
	public void windowhandle() throws InterruptedException {
		ob.windowhandle();
	}
	
	
	
}
