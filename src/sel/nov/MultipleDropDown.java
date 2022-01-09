package sel.nov;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MultipleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\com\\SeleniumMrngBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		WebElement bh = driver.findElement(By.xpath("//select[@class='spTextField']"));
		Select h = new Select(bh);
		boolean mtp = h.isMultiple();
		
		System.out.println(mtp);
		List<WebElement> options = h.getOptions();
		for (WebElement fvk : options) {
				String text = fvk.getText();
				System.out.println(text);
	}
		h.selectByIndex(1);
		h.selectByValue("msselenium");
		h.selectByVisibleText("Agile Methodology");
		
		h.deselectByIndex(1);
		h.deselectByVisibleText("Agile Methodology");
		System.out.println("****All deselected options****");
		List<WebElement> allSelectedOptions = h.getAllSelectedOptions();
		for (WebElement allsel : allSelectedOptions) {
			String text = allsel.getText();
			System.out.println(text);
		}
		System.out.println("first selected options");
		WebElement fg = h.getFirstSelectedOption();
		String text = fg.getText();
		System.out.println(text);
		
		
		
		
	}	
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


