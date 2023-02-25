package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://demoapp.skillrary.com/login.php?type=login");
	     driver.findElement(By.id("email")).sendKeys("admin");
	     driver.findElement(By.name("password")).sendKeys("admin");
	     driver.findElement(By.className("login_Btn")).click();
	     driver.close();
		}

	
	}


