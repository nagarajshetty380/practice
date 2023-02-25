package seleniumpractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireDriverAndClose {

	public static void main(String[] args) throws Throwable {
		String key = "webdriver.gecko.driver";
		String value = "./drivers/geckodriver.exe";
		
	System.setProperty(key, value);
	FirefoxDriver driver = new FirefoxDriver();
	Thread.sleep(10000); 
	driver.close(); // to close the tab only

	}

}
