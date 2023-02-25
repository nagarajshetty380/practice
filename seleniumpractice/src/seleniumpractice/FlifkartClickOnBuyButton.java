package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlifkartClickOnBuyButton {

	public static void main(String[] args) {
   System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.flipkart.com/poco-c31-royal-blue-64-gb/p/itm19effae969b86?pid=MOBG73E7GKQK4KZP&lid=LSTMOBG73E7GKQK4KZPR5ICMK&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=hp_banner_2_7.bannerX3.BANNER_MWR8HGW3Z6FC&fm=neo%2Fmerchandising&iid=1db79728-0655-42f3-8f8d-dc42f11557e8.MOBG73E7GKQK4KZP.SEARCH&ppt=hp&ppn=homepage&ssid=kzcjk8tydc0000001659576530766");
   driver.findElement(By.className("_2KpZ6l _2U9uOA ihZ75k _3AWRsL"));
   driver.close();

	}

}
