package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement rdy =  driver.findElement(By.xpath("//a[contains(@class,'_6lti ')]"));
	rdy.click();
	Thread.sleep(2000);
	WebElement name =  driver.findElement(By.name("firstname"));
	name.sendKeys("Thiru");
	Thread.sleep(2000);
	WebElement surname =  driver.findElement(By.name("lastname"));
	surname.sendKeys("venkat");
	Thread.sleep(2000);
	WebElement mob =  driver.findElement(By.name("reg_email__"));
	mob.sendKeys("8807506703");
	Thread.sleep(2000);
	WebElement pas =  driver.findElement(By.name("reg_passwd__"));
	pas.sendKeys("ghani67");
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByValue("30");
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	//s.selectByVisibleText("Aug");
	s1.selectByIndex(7);
	Thread.sleep(2000);
	WebElement yr = driver.findElement(By.id("year"));
	Select s2 = new Select(yr);
	s2.selectByValue("1966");
	Thread.sleep(2000);
	WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
	gender.click();
	Thread.sleep(2000);
	WebElement cust = driver.findElement(By.xpath("//label[text()='Custom']"));
	cust.click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	String Currenturl = driver.getCurrentUrl();
	System.out.println(Currenturl);
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	

	}

}
