package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightAndWidthWithoutUsingCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		int h = ele.getSize().getHeight();
		System.out.println(h);
		int w = ele.getSize().getWidth();
		System.out.println(w);
		driver.close();
		
	}

}
