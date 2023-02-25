package seleniumpractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {

	public static void main(String[] args)
	{
		String key = "webdriver.gecko.driver";
		String value = "./drivers/geckodriver.exe";
		
	System.setProperty(key, value);
	FirefoxDriver driver = new FirefoxDriver();
	}

}
