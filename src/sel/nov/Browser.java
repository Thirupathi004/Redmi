package sel.nov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/?lang=en");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.geeksforgeeks.org/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		

	}

}
