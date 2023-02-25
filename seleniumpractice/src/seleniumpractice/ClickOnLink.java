package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLink {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get( "file:///C:/Users/nagar/OneDrive/Desktop/selenium/GoogleLink.html");
//WebElement ele = driver.findElement(By.tagName("a"));
//ele.clear();
driver.findElement(By.tagName("a")).click();
driver.close(); 
	}

}
