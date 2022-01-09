package sel.nov;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement log = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions vc = new Actions(driver);
		vc.click(log).build().perform();
		WebElement grocery = driver.findElement(By.linkText("Grocery"));
		vc.contextClick(grocery).build().perform();
		
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		vc.contextClick(mobiles).build().perform();
		
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		
		WebElement topoffer = driver.findElement(By.partialLinkText("Offers"));
		vc.contextClick(topoffer).build().perform();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> k1 = new ArrayList<String>();
		k1.addAll(windowHandles);
		driver.switchTo().window(k1.get(2));
		
		String title = driver.getTitle();
		System.out.println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		
		
		
		
		
		
		
		
	
	}

}
