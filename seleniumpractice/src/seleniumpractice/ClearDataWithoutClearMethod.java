package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataWithoutClearMethod {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium%20assignment/cleardatawithoutclearmethod.html");
		WebElement ele = driver.findElement(By.xpath("//input"));
		ele.sendKeys(Keys.CONTROL+"a");//select all the value
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);// delete all selected value
		Thread.sleep(2000);
		driver.close();
	}

}
