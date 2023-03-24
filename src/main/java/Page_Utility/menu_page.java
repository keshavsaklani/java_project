package Page_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class menu_page extends Base_library {

	public menu_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[2]")
	private WebElement clickon_widget;
	
	
	@FindBy(xpath="//*[text()='menu']")
	private WebElement clickon_menu;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul/li[3]")
	private WebElement service;
	
	
	
	
	
	public void selectwidget() {
		
		clickon_widget.click();
		
	}
	
	public void select_menu() {
		
		clickon_menu.click();
	}
	
	public void mouseover() {
		mouseover(service);
	
	
}
	public void mouseoverandclic() {
		mouseoverandclick(service, "Website Design");
		
	
}	
	
}