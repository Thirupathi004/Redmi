package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions bct = new Actions(driver);
		bct.clickAndHold(src).pause(5000).moveToElement(dest).build().perform();
		String title = driver.getTitle();
		System.out.println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		

	}

}
