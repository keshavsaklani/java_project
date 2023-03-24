package Page_Utility;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base_Utility.Base_library;

public class TextBoxPage extends Base_library {
	
	public TextBoxPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement element;

@FindBy(xpath="//*[text()='text box']")
private WebElement clicktext;

	
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement fullName;
	
	
	@FindBy(xpath="//*[@id='fullemail1']")
	private WebElement Email;
	
	
	@FindBy(xpath="//*[@id='fulladdresh1']")
	private WebElement cAddress;
	
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement pAddress;
	
	
	@FindBy(xpath="//*[@class='btn btn-success']")
	private WebElement Submit;
	
	
	@FindBy(xpath="//*[text()='check box']")
private WebElement clickoncheckbox;
	
	
	// //*[@id='text'],   //*[@id='myCheck']
	@FindBy(xpath="//*[@id='myCheck']")
	private WebElement clickMobileOption;
	@FindBy(xpath="//*[@id='mylaptop']")
	private WebElement clickLaptop;
	
	@FindBy(xpath="//*[@id='mydesktop']")
	private WebElement clickdesktop;
	
	public void clickcheckbox() {
		clickoncheckbox.click();
	}
	
	
	
	
	
//	@FindBy(xpath="//*[@class='col-md-6 mt-5']/label")
//	private WebElement detailcheck;
	
	
	public void clickonelement() {
		element.click();
		clicktext.click();
	}
//	
//	public void elementDetail() {
//		fullName.sendKeys("keshav saklani");
//		Email.sendKeys("keshavsaklani14@gmail.com");
//		cAddress.sendKeys("srinagar garhwali");
//		pAddress.sendKeys("srinagar,tehri garhwal");
//		Submit.click();
//	}
//	
	
	public void sendDetail() {
		fullName.sendKeys(Getreaddeta(0,0,1));
		Email.sendKeys(Getreaddeta(0,1,1));
		cAddress.sendKeys(Getreaddeta(0, 2, 1));
		pAddress.sendKeys(Getreaddeta(0, 3, 1));
		Submit.click();
		//driver.quit();
		}
	
	
	public void checkboxx() throws InterruptedException {
	//	String data = "yes";
		
	/*
	checkboxdeta(1, 0, 1);
	 checkboxdeta(1, 1, 1);
	 checkboxdeta(1, 0, 2);
	 checkboxdeta(1, 1, 2);
	 checkboxdeta(1, 0, 3);
	 checkboxdeta(1, 1, 3);
	 
	 
	 */
//	if ( checkboxdeta(1, 1, 1).equalsIgnoreCase(data)) {
		clickMobileOption.click();
		Thread.sleep(1000);
	//}
//	else {
	//	System.out.println("no data");
	//}
	
	//	if(checkboxdeta(1, 1, 2).equalsIgnoreCase(data)) {
			clickLaptop.click();
			Thread.sleep(1000);
	//	}
		
	//	else {
	//		System.out.println("no data");
	//	}
		
	//	if(checkboxdeta(1, 1, 3).equalsIgnoreCase(data)) {
		clickdesktop.click();
		Thread.sleep(1000);
	//	}
	
	//	else {
	//		System.out.println("no data");
	//	}
	
}}
