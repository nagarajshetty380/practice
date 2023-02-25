package seleniumpractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.skillrary.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
driver.findElement(By.xpath("(//a[@class='ignorelink'])[16]")).click();
Set<String> child = driver.getWindowHandles();
for(String b:child)
{
	driver.switchTo().window(b);
}
driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
	}

}
