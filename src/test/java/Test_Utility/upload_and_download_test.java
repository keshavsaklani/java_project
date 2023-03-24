package Test_Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base_Utility.Base_library;
import Page_Utility.Upload_And_Download_page;

public class upload_and_download_test extends Base_library {
	Upload_And_Download_page ob;
	
@BeforeTest
	public void getUrl() {
	getLauncher(getreaddata("staginurl"));
	ob= new Upload_And_Download_page();
	
	}


	@Test(priority=1)
public void clickonuploadfile()  {
		
		ob.clickonuploadAnddownloadfile ();
	}


	@Test(priority=2)
	public void clickonuploadfile1() throws InterruptedException {
		ob.clickonuploadfile();
		
	}

	
}
