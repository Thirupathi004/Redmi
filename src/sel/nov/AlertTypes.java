package sel.nov;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTypes {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\com\\\\SeleniumMrngBatch\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement msk = driver.findElement(By.id("alertButton"));
		msk.click();
		Thread.sleep(2000);
		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();
		Thread.sleep(2000);
		
		WebElement msk1 = driver.findElement(By.id("confirmButton"));
		msk1.click();
		Thread.sleep(2000);
		Alert confirmalert= driver.switchTo().alert();
		confirmalert.dismiss();
		Thread.sleep(2000);
		
		WebElement msk2 = driver.findElement(By.id("promtButton"));
		msk2.click();
		Thread.sleep(2000);
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Prompt alert class");
		Thread.sleep(2000);
		String text = promptalert.getText();
		System.out.println(text);
		promptalert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		TakesScreenshot vc = (TakesScreenshot)driver;
		File css = vc.getScreenshotAs(OutputType.FILE);
		File bnm = new File("D:\\com\\SeleniumMrngBatch\\Screenshot\\picture1.png");
		FileUtils.copyFile(css, bnm);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
