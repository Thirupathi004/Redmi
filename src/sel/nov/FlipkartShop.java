package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement log = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions ac = new Actions(driver);
		ac.click(log).build().perform();
		WebElement help = driver.findElement(By.xpath("//div[@class='_2Brcj4']"));
		JavascriptExecutor df = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		df.executeScript("arguments[0].scrollIntoView;", help);
		WebElement day = driver.findElement(By.xpath("//div[@class='_2Xfa2_']"));
		Thread.sleep(2000);
		df.executeScript("arguments[0].scrollIntoView;", day);
		String title =  driver.getTitle();
		System.out.println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		
		
		
		
		
		
		

	}

}
