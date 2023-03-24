package Base_Utility;







import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import Property_Utility.property_utility_practise;


public class Base_library_practise  {
public static WebDriver driver;
	
String path= "C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\WebDriver\\chromedriver.exe ";
String propertypath="C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\TestData\\config.properties";
String excelpath= "C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\TestData\\testdata_excel.xlsx";


public void getlauchurl() {
	System.setProperty("webdriver.chrome.driver", path);
	
	driver= new ChromeDriver();
	driver.get("https://testingbaba.com/old/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
	
}
public String  getreddata1 (int sheetno, int row, int col) {
	String  path= " ";
	
	try {
	FileInputStream fis = new FileInputStream(path);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet= wb.getSheetAt(sheetno);
	 path=  sheet.getRow(row).getCell(col).getStringCellValue();
	
	}
	
	
	catch(Exception e) {
		
	}
	return path;
}

public void screenshot (String foldername, String filename) {
	String loc= System.getProperty("user.dir");
	String path= loc+"\\screenshot\\"+foldername+"\\"+filename+".png";
	try {
		EventFiringWebDriver efd= new EventFiringWebDriver(driver);
		
		
		      File src  =efd.getScreenshotAs(OutputType.FILE);
		      
		      FileUtils.copyFile(src, new File (path));
		
		
		
		
	} catch (Exception e) {
		
	}
	
}
	
	
	public void getresultanalysis(ITestResult r)	{
		     String methodname= r.getMethod().getMethodName();
		
	if(r.getStatus()==ITestResult.SUCCESS)	    {
		screenshot("passed",methodname);
		
	}
		
	else if (r.getStatus()==ITestResult.FAILURE) {
		
		screenshot("faild",methodname);
		
		
	}
	}
	public String getdatetime () {
		String datetime=" ";
		try {
			Date db= new Date();
			SimpleDateFormat df= new SimpleDateFormat("dd_MM_yyyy_hhmmss");
			datetime=  	df.format(db);
			
		} catch (Exception e) {
			
		}
		return datetime;
		
		
	}
	
		
		
		
	}
	
	





	
	





	

