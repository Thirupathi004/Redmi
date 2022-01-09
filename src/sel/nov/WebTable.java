package sel.nov;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://cosmocode.io/automation%20practice%20webtable/");
	driver.manage().window().maximize();
	
	List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for(WebElement data : alldata) {
		String text = data.getText();
		System.out.println(text);
		
	}
	System.out.println("****Row Data****");
	List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[6]/td"));
	for(WebElement rowdata : rows) {
		String text = rowdata.getText();
		System.out.println(text);
	}
	System.out. println("***Column Data***");
	List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
	for(WebElement columndata : columns) {
		String text = columndata.getText();
		System.out.println(text);
	}
	System.out.println("***Particular data***");
	List<WebElement> particular = driver.findElements(By.xpath(""));
	for(WebElement particulardata : particular) {
		String text = particulardata.getText();
		System.out.println(text);
	}
	
}
	
		
	}


