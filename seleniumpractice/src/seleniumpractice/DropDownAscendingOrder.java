package seleniumpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

import net.bytebuddy.asm.Advice.AllArguments;

public class DropDownAscendingOrder {

	private static String text;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nagar/OneDrive/Desktop/DROPDOWNSELECTMULTIPLE.HTML");
		WebElement ele = driver.findElement(By.xpath("//select [@id='taj']"));
		Select sel= new Select(ele);
		List<WebElement> option= sel.getOptions();
		 ArrayList<String> list = new ArrayList<String>();
	int count = option.size();
	System.out.println(count);	
	
	for (WebElement text:option)
	{
		String allText = text.getText();
		list.add(allText);
		
	}
		Collections.sort(list);
		for (String sortedText : list) {
			System.out.println(sortedText);
		}
		driver.close();
		
	}

}
