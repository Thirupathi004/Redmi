package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAlbum {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement gcl = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(gcl);
		WebElement note = driver.findElement(By.xpath("//input[@type='text']"));
		note.sendKeys("Thiru001");
		driver.switchTo().defaultContent();
		WebElement photo = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		photo.click();
		WebElement light = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(light);
		WebElement light2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(light2);
		WebElement light3 = driver.findElement(By.xpath("//input[@type='text']"));
		light3.sendKeys("Vickey50");
		String title = driver.getTitle();
		System.out.println(title);
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		
		
		

	}

}
