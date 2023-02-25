package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlifkart {

	public static void main(String[] args) throws Throwable {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String title = driver.getTitle();
	System.out.println(title);
	String src = driver.getPageSource();
	System.out.println(src);
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
