package Page_Utility;

import Base_Utility.Base_library;

public class loginPage extends Base_library{
//	public static loginPage ob= new loginPage();
	/*
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	*/
   /*@FindBy(xpath="//*[text()='×']")
	 private static WebElement closebutton; 
	@FindBy(xpath="(//*[text()='Practice'])[1] ")
	private static WebElement clickbutton;*/
	
	
	
public void getVerifyTitel() {
        String titel=driver.getTitle();
	   System.out.println("titel of your page:"+titel);
	   driver.manage().window().maximize();
	//  driver.quit();
	  }
}

















/*public void clickonclosebutton() {
	closebutton.click();
}

public void clickonbutton() {
	clickbutton.click();
}

*/


	
	
		
