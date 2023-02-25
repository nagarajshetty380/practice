package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksCountUsingFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium%20assignment/MultipleElement.html");
	List<WebElement> links =  driver.findElements(By.tagName("a"));
	int count = links.size();
	System.out.println(count);
	driver.close();
	}

}
