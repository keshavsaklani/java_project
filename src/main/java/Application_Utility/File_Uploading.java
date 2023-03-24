package Application_Utility;

import org.openqa.selenium.WebElement;

public interface File_Uploading {
	public void windowhandle(int   tabno);
	public void fileuploading(String path);
	public void selectbytext(WebElement ele , String value );
	public void mouseover(WebElement ele);
	public void mouseoverandclick(WebElement ele,String linktext);
}
