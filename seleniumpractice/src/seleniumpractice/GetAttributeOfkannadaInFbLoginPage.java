package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeOfkannadaInFbLoginPage {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login.php");
WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
String AttributeValue = ele.getAttribute("href");
System.out.println(AttributeValue);
driver.close();

	}

}
