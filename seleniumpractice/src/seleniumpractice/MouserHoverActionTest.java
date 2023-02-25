package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class MouserHoverActionTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("nagaraj");
		Actions act=new Actions(driver);
		act.moveToElement(null).perform();
		
		Thread.sleep(2000);
		driver.close();
		
		//Thread.sleep(1000000);
	}

}
