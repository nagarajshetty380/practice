package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInsideTextfield {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium/CssExpression.html");
Thread.sleep(2000);
//driver.findElement(By.tagName("input")).sendKeys("nagarj shetty");
//driver.findElement(By.id("a1")).sendKeys("shetty");
driver.findElement(By.className("c1")).sendKeys("shetty nagraj");

Thread.sleep(2000);
driver.close();

 
	}

}
