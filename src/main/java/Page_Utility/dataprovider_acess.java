package Page_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class dataprovider_acess extends Base_library {

	public dataprovider_acess() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="(//*[contains(text(), 'Book a Free Demo')])[2]")
	private WebElement bookdemo;
	
	
	@FindBy(xpath="//*[@name='FullName']")
	private WebElement name;
	
	@FindBy(xpath="//*[@name='Email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='Country']")
	private WebElement country;
	
	
	public void name () {
		bookdemo.click();
		name.sendKeys();
		email.sendKeys();
		
		country.sendKeys();
	}
	
	
	
	
	
	
	
}




