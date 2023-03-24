package Test_Utility;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.menu_page;
import Page_Utility.select_menu_page;

public class menu_test extends Base_library {
	//menu_page ob;
	select_menu_page ob;
	@BeforeTest
	public void get_url() {
		getLauncher(getreaddata("flipkart"));
		ob= new select_menu_page();
	}
	
	/*
	@ Test(priority=1)
	public void selectwidget() {
		 
		ob.selectwidget();
	}
	
	@ Test(priority=2)
	
	public void select_menu() {
		ob.select_menu();
	}
	
	@ Test(priority=3)
	public void mouseover() {
		
		ob.mouseover();
	}
	
	@ Test(priority=4)
	public void mouseoverandclic() {
		
		ob.mouseoverandclic();
	}
	
	*/
	
	@Test
public void mouseoverandclic() {
		
		ob.buty();
	}
	@Test
public void mouseoverandclic1() {
		
		ob.butyclick();
	}
	
	
}
