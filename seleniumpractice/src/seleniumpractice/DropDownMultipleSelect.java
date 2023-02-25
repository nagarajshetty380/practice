package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class DropDownMultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/DROPDOWNSELECTMULTIPLE.HTML");
		WebElement ele = driver.findElement(By.xpath("//select [@id='taj']"));
		Select sel=new Select(ele);
		List<WebElement> option = sel.getOptions();
		int count = option.size();
		for (WebElement text : option)
		{
String value = text.getText();
System.out.println(value);
//driver.close();
			
		}
	}

}
