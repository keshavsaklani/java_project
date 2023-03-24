package wait_utility;

import org.openqa.selenium.WebElement;

public interface waitutility {
public void elementToBeClickable(WebElement ele, int time);
public void fluent_elementToBeClickable(WebElement ele, int time,int poolingtime);
}
