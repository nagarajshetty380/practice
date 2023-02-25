package seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebookAndClose {

	public static void main(String[] args) throws Throwable {
	String key = "webdriver.chrome.driver";
	String value = "./drivers/chromedriver.exe";
	System.setProperty(key, value);
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
Thread.sleep(2000);
String title = driver.getTitle();
 System.out.println(title);
 String url = driver.getCurrentUrl();
 System.out.println(url);
 String src = driver.getPageSource();
 System.out.println(src);
 
 driver.close();
	

	}

}
