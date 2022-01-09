package sel.nov;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumTask {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("thirupathivenkat50@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("ajithnod7");
		
		pass.clear();
		pass.sendKeys("Donar67");
		WebElement vn = driver.findElement(By.name("login"));
		vn.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		TakesScreenshot se = (TakesScreenshot) driver;
		File src = se.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\com\\SeleniumMrngBatch\\Screenshot\\pictures1.png");
		FileUtils.copyFile(src, dest);
		
		
				
				
				
				
				
		
		
	
		
		

	}

}
