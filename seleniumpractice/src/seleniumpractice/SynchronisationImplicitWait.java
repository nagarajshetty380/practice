package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class SynchronisationImplicitWait {


	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.com/");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement ele = driver.findElement(By.xpath("//a"));
System.out.println(ele);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait= new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.titleContains("enter"));
driver.close();
	}

}
