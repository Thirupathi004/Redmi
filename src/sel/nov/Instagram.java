package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/?hl=en");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	email.sendKeys("thiruji56@gmail.com");
	Thread.sleep(2000);
	WebElement paswad = driver.findElement(By.xpath("//input[@ aria-label='Password']"));
	paswad.sendKeys("34589");
	Thread.sleep(2000);
	
	paswad.clear();
	paswad.sendKeys("Walter45");
	Thread.sleep(2000);
	WebElement msc = driver.findElement(By.xpath("//div[contains(@ class, ' Igw0E')]"));
	msc.click();
	String title = driver.getTitle();
	System.out.println(title);
	String Currenturl = driver.getCurrentUrl();
	System.out.println(Currenturl);
	Thread.sleep(2000);
	
	
	
	}
}
