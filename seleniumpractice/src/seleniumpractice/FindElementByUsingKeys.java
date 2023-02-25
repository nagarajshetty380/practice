package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByUsingKeys {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium%20assignment/webelement1.html");
		WebElement ele = driver.findElement(By.xpath("//a"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
WebElement ele1 = driver.findElement(By.xpath("//input [@type='text' and @ value='world']"));
Thread.sleep(2000);
ele1.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
ele1.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='https://google.com']"));
driver.close();

	}

}
