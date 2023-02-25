package seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) throws Throwable {
	String key ="webdriver.chrome.driver";
	String value ="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);

	}

}
