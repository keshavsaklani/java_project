package Page_Utility;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class Radio_Button_page extends Base_library {
	
	public Radio_Button_page() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//*[text()='radio buttons']")
	WebElement clickRadiobutton;
	
	

@FindBy(xpath="//*[@id='yes']")
WebElement clickOnYes;
@FindBy(xpath="//*[@id='impressive']")
WebElement clickOnImpressive;

@FindBy(xpath="//*[@id='no']")
WebElement clickOnNo;
	
	

public void clikonRadiobutton() {
	Scanner sc= new Scanner(System.in);
	clickRadiobutton.click();
	System.out.println("please enter a input");
	String input =sc.next();
	if(input.equals("y")) {
		clickOnYes.click();
	}
	else if (input.equals("i")) {
		clickOnImpressive.click();
		System.out.println(clickOnImpressive.isSelected());
	}
	
	else if (input.equals("n")) {
		clickOnNo.click();
		System.out.println(clickOnNo.isSelected());   
	}
	
	                  
}








}
