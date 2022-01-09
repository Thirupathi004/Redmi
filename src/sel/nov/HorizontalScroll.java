package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/");
		driver.manage().window().maximize();
		WebElement hj = driver.findElement(By.id("a20"));
		JavascriptExecutor jl = (JavascriptExecutor) driver;
		jl.executeScript("arguments[0].scrollIntoView();", hj);
		Thread.sleep(2000);
		WebElement hj1 = driver.findElement(By.id("a2"));
		jl.executeScript("arguments[0].scrollIntoView();", hj1);
		String title =  driver.getTitle();
		System.out.println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
