package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nagar/OneDrive/Desktop/selenium%20assignment/dropdown.html");
WebElement ele = driver.findElement(By.xpath("//select[@id='taj']"));
Select sel=new Select(ele);
sel.selectByIndex(2);
Thread.sleep(2000);
sel.selectByValue("A");
Thread.sleep(2000);
sel.selectByVisibleText("biriyani");
Thread.sleep(2000);
driver.close();

	}

}
