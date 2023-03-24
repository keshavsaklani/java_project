package Page_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Utility.Base_library;

public class Upload_And_Download_page extends Base_library{

	public Upload_And_Download_page() {
		PageFactory.initElements(driver, this);
	}
	String filepath="C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\TestData\\testdata_excel.xlsx";

	@FindBy(xpath="//*[text()='upload and download'] ")
	private WebElement  clickuploadfile;
	
	
	
	
	
	@FindBy(xpath="//*[text()='Select a file']")
	private WebElement selectfile;
	
	
	
	
	

	
	//*[text()='Select a file']

public void clickonuploadAnddownloadfile ()  {
	//elementToBeClickable(clickuploadfile,5);
	clickuploadfile.click();
}

public void clickonuploadfile()  {
	
	//fluent_elementToBeClickable(selectfile,10,2);
	selectfile.click();
	
	fileuploading(filepath);
}


}




