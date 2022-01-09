package sel.nov;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("thirupathivenkat50@gmail.com");
		WebElement account = driver.findElement(By.id("SubmitCreate"));
		account.click();
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		radio.click();
		WebElement first = driver.findElement(By.id("customer_firstname"));
		first.sendKeys("Thiru");
		WebElement last = driver.findElement(By.id("customer_lastname"));
		last.sendKeys("Venkatesan");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("danida9");
		WebElement box = driver.findElement(By.id("days"));
		Select n = new Select(box);
		n.selectByValue("30");
		WebElement mon = driver.findElement(By.id("months"));
		Select b = new Select(mon);
		//b.selectByVisibleText("Aug");
		b.selectByIndex(8);
		WebElement yrs = driver.findElement(By.id("years"));
		Select b2 = new Select(yrs);
		b2.selectByValue("1996");
		WebElement box2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		box2.click();
		WebElement com = driver.findElement(By.id("company"));
		com.sendKeys("AshokLeyland");
		WebElement add = driver.findElement(By.id("address1"));
		add.sendKeys("No 18/1 munusamy garden,4th lane");
		WebElement add2 = driver.findElement(By.id("address2"));
		add2.sendKeys("No 7 raman st royapuram");
		WebElement cty = driver.findElement(By.id("city"));
		cty.sendKeys("Chennai");
		WebElement ste = driver.findElement(By.id("id_state"));
		Select b3 = new Select(ste);
		b3.selectByValue("5");
		WebElement cnr = driver.findElement(By.id("postcode"));
		cnr.sendKeys("00001");
		WebElement info = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		info.sendKeys("Before i was working in an automobile industry");
		WebElement home = driver.findElement(By.id("phone"));
		home.sendKeys("25981257");
		WebElement mob = driver.findElement(By.id("phone_mobile"));
		mob.sendKeys("8807505405");
		WebElement alis = driver.findElement(By.id("alias"));
		alis.sendKeys("Chruchpark");
		WebElement reg = driver.findElement(By.id("submitAccount"));
		reg.click();
		
		
		
		
		
		
		
		
		

	}

}
