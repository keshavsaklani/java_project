package Page_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class iframe_page  extends Base_library{

	public iframe_page() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy (xpath="//a[normalize-space()='frames']")
	private WebElement frame;
	@FindBy (xpath="//div[@id='tab_13']//iframe[1]")
	private WebElement moveto_iframe1;
	
	@FindBy (xpath="//div[@id='tab_13']//iframe[2]")
	private WebElement moveto_iframe2;
	@FindBy (xpath="(//h1[normalize-space()='This is a sample page'])  [1]")
	private WebElement data1;
	
	@FindBy (xpath="//body/h1[text()='This is a sample page']")
	private WebElement data2;
	
	//body/h1[text()='This is a sample page']

	
	public void changefrmae1() {
		
		frame.click();
		driver.switchTo().frame(moveto_iframe1);
		
	
	String expated1=	data1.getText();
	System.out.println(expated1);
	driver.switchTo().defaultContent();
	}
	
	
	public void changefrmae2() throws InterruptedException {
	Thread.sleep(200);
	//driver.switchTo().defaultContent();
	driver.switchTo().frame(moveto_iframe2);
	Thread.sleep(200);
	String expated2=	data2.getText();
System.out.println(expated2);
	

}

	
}
