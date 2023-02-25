package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckElementDisplayedOrNot {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/nagar/OneDrive/Desktop/webelement.html");
	WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	boolean b = ele.isDisplayed();
	Thread.sleep(2000);
	driver.close();
	
	if(b) {
		System.out.println("it is displayed");
	}
	else
	{
		System.out.println("it is not displayed");
	}
	


	}

}
