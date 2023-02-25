package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/women/c/6557?utm_content=ads&utm_source=GooglePaid&utm_medium=Search&utm_campaign=Sok_Brand_Generic_Fashion_womens_Fashion&gclid=CjwKCAjw7eSZBhB8EiwA60kCW0-1ZZciU0O7cdTc9ht1-mKOdZ9Kqcxz6HlH9eJrwUlmX637xKXW_RoC2ycQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("lipstik");
		driver.findElement(By.xpath("//span[text()='lipstik']")).click();
		driver.findElement(By.xpath("(//span[@class='btn-text'])[2]")).click();
		
		
		
		


	}

}
