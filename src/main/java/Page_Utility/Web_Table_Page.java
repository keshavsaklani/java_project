package Page_Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class Web_Table_Page extends Base_library {
public Web_Table_Page() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[text()='web tables']")
	WebElement clickWebtable;
	
	
	
	@FindBy(xpath="/html/body/div/form/div[1]/input")
	WebElement clickOnName;
	
	@FindBy(xpath="/html/body/div/form/div[2]/input")
	WebElement clickOnEmail;
	@FindBy(xpath="/html/body/div/form/button")
	WebElement clickOnSave;
	
	@FindBy(xpath="//*[text()='Edit']")
	private List <WebElement> clickOnEdit;
	
	@FindBy(xpath="//*[@name='edit_name']")
	WebElement clickOnEditName;
	@FindBy(xpath="//*[@name='edit_email']")
	WebElement clickOnEditEmail;
	
	@FindBy(xpath="//*[text()='Update']")
	WebElement clickOnUpdate;
	
	@FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
	WebElement Iframe;
	
	public void clickonWebTable() {
		clickWebtable.click();
		driver.switchTo().frame(Iframe);
	}
	
	public void getWebTable() {
		for (int i=1;i<=9;i++) {
		clickOnName.sendKeys(WebTableData(2, 0, i));
		clickOnEmail.sendKeys(WebTableData(2, 1, i));
		clickOnSave.click();
		
		}
		
		
		int i=1;
	for(WebElement dd:clickOnEdit) {
		
		
		
			
			dd.click();
			
		clickOnEditName.clear();
		clickOnEditName.sendKeys(WebTableData(2, 2, i));
		clickOnEditEmail.clear();
		clickOnEditEmail.sendKeys(WebTableData(2, 3, i));
		clickOnUpdate.click();
	         i++;
		
		
		}
		
		
		
		
		}
	
	
	
	
}
