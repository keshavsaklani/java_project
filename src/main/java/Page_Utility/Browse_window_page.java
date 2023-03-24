package Page_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class Browse_window_page extends Base_library {
	public Browse_window_page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"headingOne\"]/h2/button")
	private WebElement clickonalert;
	@FindBy(xpath="	//*[text()='browser windows']")
	private WebElement browsewindow;

	@FindBy(xpath="//*[@id=\"tab_11\"]/div[2]/a")
	private WebElement parenttab;
	
	@FindBy(xpath="//*[@name=\"q\"]")
	private WebElement newtab;

	
	
	
public void windowhandle() throws InterruptedException {
	clickonalert.click();
	browsewindow.click();
	parenttab.click();
	windowhandle(1);
	newtab.sendKeys("tom holend");
	Thread.sleep(500);
	
	//windowhandle(0);
	
}





}






