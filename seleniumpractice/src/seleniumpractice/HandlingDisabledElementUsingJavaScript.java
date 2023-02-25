package seleniumpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElementUsingJavaScript {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nagar/OneDrive/Desktop/DisabledTextFeild.html");
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('id').value='WORLD'");
Thread.sleep(2000);
driver.close();

	}

}
