package Page_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class select_menu_page extends Base_library {
	public select_menu_page() {
	
		PageFactory.initElements(driver, this);
		}
	/*
	@FindBy(xpath="(//*[@id=\"headingOne\"]/h2/button)[2]")
	private WebElement  wideget;
	
	@FindBy(xpath="//*[text()='select menu']")
	private WebElement  select_menu;
	@FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement  selectoption;
	


public void selectwidhet() {
	//elementToBeClickable(wideget, 5);
	wideget.click();
	
}
	
public void selectmenu() {
//	elementToBeClickable(select_menu, 5);
	select_menu.click();
}




public void select() {
	
//	elementToBeClickable(selectoption, 5);
	selectbytext(selectoption,"Group 1, Option 1");
	
	
}


}
*/

	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div/div[9]/a/div[2]/div/div")
	private WebElement  beutytoy;
	
	//Bath & Oral Care
	public void buty() {
		mouseover(beutytoy);
		
	}
	
	public void butyclick() {
		
		mouseoverandclick(beutytoy, "Bath & Oral Care");
		beutytoy.click();
	}
	
}	