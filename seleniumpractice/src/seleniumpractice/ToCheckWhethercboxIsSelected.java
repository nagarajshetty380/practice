package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckWhethercboxIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium%20assignment/CheckWheterCbocIsSelected.html");
		WebElement ele = driver.findElement(By.xpath("//input"));
		boolean b = ele.isSelected();
		Thread.sleep(2000);
		driver.close();
		if(b)
		{
			System.out.println("checkbox is selected");
		} 
		else
		{
			System.out.println("checkbox not selected");
		}
	}

}
