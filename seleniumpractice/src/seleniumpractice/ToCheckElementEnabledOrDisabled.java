package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckElementEnabledOrDisabled {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium%20assignment/elementdisabled.html");
WebElement ele = driver.findElement(By.xpath("//input"));
boolean b = ele.isEnabled();
//driver.close();
if(b)
{
	System.out.println("textbox enabled");
}
else
{
	System.out.println("textbox disbled");
}
ele.sendKeys("hello");
driver.close();
	}

}
