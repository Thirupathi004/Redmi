package sel.nov;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProjectSel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("thirupathivenkat50@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("danida9");
		WebElement log = driver.findElement(By.id("SubmitLogin"));
		log.click();
		Thread.sleep(2000);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).build().perform();
		WebElement dress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		ac.click(dress).build().perform();
		WebElement cotton = driver.findElement(By.id("layered_id_feature_5"));
		ac.click(cotton).build().perform();
		Thread.sleep(2000);
		WebElement rod = driver.findElement(By.id("selectProductSort"));
		Select b = new Select(rod);
		b.selectByIndex(2);
		WebElement img = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
		img.click();
		Thread.sleep(4000);
		WebElement chart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		chart.click();
		Thread.sleep(4000);
		WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		check.click();
		Thread.sleep(4000);
		WebElement out = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		out.click();
		Thread.sleep(4000);
		WebElement sale = driver.findElement(By.xpath("@id=\\\"center_column\\\"]/form/p/button/span"));
	    sale.click();
		Thread.sleep(5000);
		WebElement agree = driver.findElement(By.id("cgv"));
	    agree.click();
		Thread.sleep(5000);
		WebElement cash = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	    cash.click();
		Thread.sleep(5000);
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
	    bank.click();
		Thread.sleep(5000);
		WebElement pay = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	    pay.click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out. println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		
		
		
		
		
		

	}

}
