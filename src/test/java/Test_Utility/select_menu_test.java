package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.select_menu_page;

public class select_menu_test extends Base_library {

	select_menu_page ob;
	
	@BeforeTest
	public void geturl() {
		getLauncher(getreaddata("staginurl"));
		ob=new select_menu_page();
	}
	
	
	
	
	
	
	
	
	@Test(priority=1)
	public void selectwidhet() {
		
		ob.selectmenu();
		
		
	}
	
	@Test (priority=2)
	public void selectmenu() {
		
		
	}
	
	

	@Test(priority=3)
	public void select() {
		
		ob.select();
		
		
	}
	
	
	
	
}
