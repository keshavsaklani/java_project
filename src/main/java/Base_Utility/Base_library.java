package Base_Utility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import Application_Utility.File_Uploading;
import Excel_Utility.Excelutility;
import Property_Utility.propertyutility;
import Screenshot_Utility.Screenshot_utility;
import wait_utility.waitutility;



public class Base_library implements propertyutility,Excelutility,Screenshot_utility,File_Uploading,waitutility {
static String path="C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\TestData\\testdata_excel.xlsx";
	String propertyfilePath="C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\TestData\\config.properties";
	String filepath="C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\TestData\\testdata_excel.xlsx";
	public static WebDriver driver; 
	
public void getLauncher() {
	
String path= "C:\\Users\\kesha\\eclipse-workspace\\2nov_test_automation\\WebDriver\\chromedriver.exe";
 System.setProperty("webdriver.chrome.driver", path);

           driver= new ChromeDriver();
	//driver.get(url);
           driver.navigate().to("https://www.orangehrm.com/hris-hr-software-demo/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[text()='×']")).click();
driver.findElement(By.xpath("//*[text()='Practice']")).click();

	driver.manage().window().maximize();

	
	

	}

@Override
public String getreaddata(String key) {
	String data = "";
	try {
		FileInputStream fis= new FileInputStream(propertyfilePath);
		Properties prop=new Properties();
		prop.load(fis);
		data = prop.getProperty(key);
	}
	
	catch(Exception e) {
		System.out.println("e");
	}
	return data;
}

@Override
public String  Getreaddeta(int sheetno, int colamno, int rowno) {
	String value=" ";
	try {
		FileInputStream fis= new FileInputStream(path);
	
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(sheetno);
		value=sheet.getRow(rowno).getCell(colamno).getStringCellValue();
	} catch (Exception e) {
		
	}
	return value;
	
}

@Override
public String checkboxdeta(int sheetno, int colamno, int rowno) {
	String value= "";
	
	try {
		
		FileInputStream fis= new FileInputStream(path);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(sheetno);
		value=sheet.getRow(rowno).getCell(colamno).getStringCellValue();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	return value;
	
}

@Override
public void getScreenshot(String folderName, String fileName) {
	String loc=System.getProperty("user.dir");
	String path= loc+"\\screenshots\\"+folderName+"\\"+fileName+".png";
	
	try {
		EventFiringWebDriver efw= new 	EventFiringWebDriver(driver);
		File src =efw.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		
	} catch (Exception e) {
		System.out.println("issue in getscreenshot"+e);
	}
	
	
	
	}
	
//@AfterMethod
public void  getresultanalysis (ITestResult r) {
	String methodname= r.getMethod().getMethodName();
	
	try {
		if(r.getStatus()==ITestResult.SUCCESS) {
			getScreenshot("passed", methodname);
		}
		else if(r.getStatus()==ITestResult.FAILURE) {
			getScreenshot("failed", methodname);
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	
	}

@Override
public String WebTableData(int sheetno, int colamno, int rowno) {
	String value= "";
	
	try {
		
		FileInputStream fis= new FileInputStream(path);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(sheetno);
		value=sheet.getRow(rowno).getCell(colamno).getStringCellValue();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	return value;
	
}

@Override
public void fileuploading(String path) {
	
	try {
		StringSelection sel= new StringSelection(path);
	Clipboard cb	=Toolkit.getDefaultToolkit().getSystemClipboard();
	cb.setContents(sel, null);
		
	Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(200);
	robot.keyRelease(KeyEvent.VK_ENTER);
	} catch (Exception e) {
		System.out.println(e);
	}
	
}

@Override
public void elementToBeClickable(WebElement ele, int time) {
	WebDriverWait wait= new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}

@Override
public void fluent_elementToBeClickable(WebElement ele, int time, int poolingtime) {
	Wait<WebDriver> wait= new FluentWait<>(driver)
	.withTimeout(Duration.ofSeconds(time))
	.pollingEvery(Duration.ofSeconds(poolingtime))
	.withMessage("customize massage keshav")
	.ignoring(Exception.class);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}

@Override
public void selectbytext(WebElement ele, String value) {
	Select sel= new Select(ele);
	sel.selectByVisibleText(value);
}

@Override
public void mouseover(WebElement ele) {
	Actions act= new  Actions(driver);
	act.moveToElement(ele).perform();
}

@Override
public void mouseoverandclick(WebElement ele, String linktext) {
	
	Actions act= new  Actions(driver);
	act.moveToElement(ele).build().perform();
	driver.findElement(By.linkText(linktext));
	
}

@Override
public void windowhandle(int  tabno) {
	Set<String> set = driver.getWindowHandles();
	ArrayList<String> handle  = new ArrayList<String>(set);
	driver.switchTo().window(handle.get(tabno));
}

public  void doubleclick(WebElement ele ){

Actions act = new Actions (driver);
act.doubleClick(ele).perform();
}

public  void rightclick (WebElement ele ){

Actions act = new Actions (driver);
act.contextClick(ele).perform();
}

@DataProvider(name = "excel")

public static Object[][] excelreaddata() throws IOException{
	
	Object[][] data= readdata(path, "sheet1");
	
			return data;
}

public static Object[][] readdata(String path, String SheetName) throws IOException{
	FileInputStream fis = new FileInputStream (path);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet(SheetName);
	
	int noOfRows= sheet.getPhysicalNumberOfRows();
	int noOfCell  =sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object[][] data= new Object[noOfRows-1][noOfCell];
	for (int i = 1; i <noOfRows ; i++) {
		
		for (int j = 0; j < noOfCell; j++) {
			
		String exceldata= sheet.getRow(i)	.getCell(j).getStringCellValue();
		
	data[i-1][j]= exceldata;
	
	
		
			
		}
		
	}
	return data;
	
	
}

 
 
 


}










	






