package Page_Utility;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Base_Utility.Base_library;

public class checkboxPage extends Base_library {

	public checkboxPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='check box']")
	private WebElement checkbox;
	@FindBy(xpath = "//*[@id='tab_2']/div/iframe")
	private WebElement iframe;
	@FindBy(xpath = "//*[@id=\"myCheck\"]")
	private WebElement clickmobilebutton;
	@FindBy(xpath = "//*[@id='mylaptop']")
	private WebElement clickLaptop;
	@FindBy(xpath="//*[@id=\"mydesktop\"]")
	private WebElement desktop;
	
	SoftAssert softAssertVerify= new SoftAssert();
	
	
	/*
	public void clickCheckboxbutton() {
		
		
		
		
		
		checkbox.click();
		driver.switchTo().frame(iframe);
		String data = "yes";
		checkboxdeta(1, 0, 1);
		 checkboxdeta(1, 1, 1);
		 checkboxdeta(1, 0, 2);
		 checkboxdeta(1, 1, 2);
		 checkboxdeta(1, 0, 3);
		 checkboxdeta(1, 1, 3);
		 if ( checkboxdeta(1, 1, 1).equalsIgnoreCase(data)) {
			 clickmobilebutton.click();
			 String textmobileinformation =textmobilebutton.getText();
			 System.out.println(textmobileinformation);
			//Assert.assertEquals("mobile", textmobileinformation);
			 softAssertVerify.assertEquals("mobile", textmobileinformation);
			// softAssertVerify.assertAll();
		//	 getScreenshot("passed", "clickonlaptop");
		 }
		 else {
					System.out.println("no data");
				}
		
		 if(checkboxdeta(1, 1, 2).equalsIgnoreCase(data)) {
			 clickLaptop.click();
			 getScreenshot("passed", "clickonlaptop");
			 
				
		 }
		 else {
				System.out.println("no data");
			}
	
		
		
	}

	*/
	
	
	
	public void clickCheckboxbutton() {
		checkbox.click();
		
		driver.switchTo().frame(iframe);
		
		LinkedHashMap<String, String> map= new LinkedHashMap<String, String>();
		for(int i=1;i<=3;i++) {
			map.put(checkboxdeta(1, 0, i), checkboxdeta(1, 1, i));
		}
		
		
		Set<Entry<String, String>> set= map.entrySet();
		for(Entry<String, String> dd: set ) {
			String action= dd.getKey();
			String status=dd.getValue();
			if(action.equalsIgnoreCase("mobile")) {
				if(status.equalsIgnoreCase("yes")) {
					clickmobilebutton.click();
				}
				 else  if (action.equalsIgnoreCase("laptop")) {
					if(status.equalsIgnoreCase("yes")) {
						clickLaptop.click();
				}
					else if(action.equalsIgnoreCase("desktop")) {
						if(status.equalsIgnoreCase("yes")) {
							desktop.click();
						}
					}
			}
		}
	}
	
		
		
		
}}
