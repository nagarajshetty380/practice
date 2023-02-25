package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLink3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium/GoogleLink.html");
		driver.findElement(By.linkText("https://www.google.com/")).click();
		//driver.findElement(By.partialLinkText("goo")).click();
	}

}
