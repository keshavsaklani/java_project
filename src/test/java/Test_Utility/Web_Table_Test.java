package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.Web_Table_Page;

public class Web_Table_Test extends Base_library{
	Web_Table_Page ob;
	@BeforeTest
	public void geturl() {
		getLauncher(getreaddata("staginurl"));
		ob= new Web_Table_Page();
		
	}
	
	@Test(priority = 1)
	public void clickonWebTable() {
		ob.clickonWebTable();
	}
		@Test(priority = 2)
		public void getWebTable() {
			
		ob.getWebTable();
		
		
	}
	
	
	
	
}
