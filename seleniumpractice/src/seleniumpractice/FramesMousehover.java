package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FramesMousehover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pushDenied")).click();
		WebElement ele = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-user']"));
		Actions a= new Actions(driver);
		a.moveToElement(ele);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("8970399748");
		
		
	}

}
