package Page_Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_datarun {

	public static String  path= System.getProperty("user.dir")+"\\TestData\\testdata_excel.xlsx";
	@DataProvider(name = "excel")
	
	public Object[][] excelreaddata() throws IOException{
		
		Object[][] data= readdata(path, "sheet1");
		
				return data;
	}
	
	public Object[][] readdata(String path, String SheetName) throws IOException{
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
	
	@Test(dataProvider="excel" )
	public void excelreddata(String para1, String Para2, String Pra3,String Pra4) {
		
	}
	
}
