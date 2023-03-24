package Page_Utility;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Base_Utility.Base_library_practise;

public class page_utility_practise extends Base_library_practise {
	public page_utility_practise() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//how to create x path with the help of indexing?
	
	
	
	@FindBy(xpath="(//*[@id='headingOne']/h2/button)[1]")
	private WebElement elert;
	
	@FindBy(xpath="(//*[@id='v-pills-tab']/a[2])[2]")
	private WebElement elertsbutton;
	
	@FindBy(xpath="//*[@id=\"tab_12\"]/div[1]/div[2]/button")
	private WebElement clickme1;
	
	@FindBy(xpath="//*[@id=\"tab_12\"]/div[2]/div[2]/button")
	private WebElement clickme2;
	
	
	@FindBy(xpath="//*[@id=\"tab_12\"]/div[3]/div[2]/button")
	private WebElement clickme3;
	@FindBy(xpath="//*[@id=\"tab_12\"]/div[4]/div[2]/button")
	private WebElement clickme4;
	

	
	
public void changewindow() throws Exception   {

	elert.click();
	Thread.sleep(1000);
	elertsbutton.click();
	
}
	
	public void clickme1() {
		SoftAssert soft= new SoftAssert();
		clickme1.click();
		String expacted= driver.switchTo().alert().getText();
		System.out.println(expacted);
		String acual= propertyutility("actual");
		System.out.println(acual);
		soft.assertEquals(acual, expacted);
		driver.switchTo().alert().accept();
		soft.assertAll();
	}
	public void clickme2() throws Exception {
		
		clickme2.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
	public void clickme3() throws Exception {
		
		clickme3.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}
	
	public void clickme4() throws Exception {
		clickme4.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("my name is keshav");
		
		driver.switchTo().alert().accept();
		
	}
	
	
	
}


