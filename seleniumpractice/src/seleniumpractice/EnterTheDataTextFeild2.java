package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataTextFeild2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/EnterTheDataInsideTestFeild.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).clear();
		//driver.findElement(By.id("a1")).clear();
		//driver.findElement(By.className("c1")).clear();
		//driver.findElement(By.cssSelector("input[type='text']")).clear();
		//driver.findElement(By.cssSelector("input[id='a1']")).clear();
		//driver.findElement(By.cssSelector("input[name='n1']")).clear();
		driver.findElement(By.cssSelector("input[class='c1']")).clear();
		Thread.sleep(2000);
		driver.close();
	}

}
