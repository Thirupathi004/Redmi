package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement log = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions se = new Actions(driver);
		se.click(log).build().perform();
		WebElement home = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		se.moveToElement(home).perform();
		WebElement kitchen = driver.findElement(By.xpath(""));
		se.moveToElement(kitchen).perform();
		

	}

}
