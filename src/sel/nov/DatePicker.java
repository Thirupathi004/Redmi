package sel.nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		
		WebElement calender = driver.findElement(By.id("datepicker"));
		calender.click();
		Thread.sleep(2000);
		
		WebElement title = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String text = title.getText();
		System.out.println(text);
		
		String[] arr = text.split(" ");
		String month = arr[0];
		String year = arr[1];
		System.out.println(month);
		System.out.println(year);
		
		while(!(month.equals("January")&&year.equals("2024"))) {
		 WebElement jk = driver.findElement(By.xpath("//span[text()='Next']"));
		 jk.click();
		 title = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		  text = title.getText();
	 System.out.println(text);
		 arr = text.split(" ");
		 month = arr[0];
		 year = arr[1];
		}
		 WebElement date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a"));
		 date.click();
		 
		 
		


	}

}
