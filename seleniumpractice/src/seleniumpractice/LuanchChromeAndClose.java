package seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class LuanchChromeAndClose {

	public static void main(String[] args) throws Throwable {
		String key ="webdriver.chrome.driver";
		String value ="./drivers/chromedriver.exe";
			System.setProperty(key, value);
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.close();// to close only one tab
			//driver.quit(); // close complete browser

	}

}
