package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfLogInButtonInFbLoginPage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php");
	WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
	Point locn = ele.getLocation();
	System.out.println(locn);
	int x = locn.getX();
	System.out.println(x);
	int y = locn.getY();
	System.out.println(y);
			
	driver.close();
	


	}

}
