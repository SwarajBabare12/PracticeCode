package practiceWeb;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homePage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Static DropDown:
		
		WebElement statictDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));;
		Select dropdown = new Select(statictDropdown);
		for(int i=1; i<4 ; i++) {
			
			dropdown.selectByIndex(i);
			System.out.println(dropdown.getFirstSelectedOption().getText());
		}
		
		// Dynamic DropDown

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		int i=1;
		while(i<6) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		String S=driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(S,"6 Adult");
		
		// Suggestive DropDown 
		
		driver.findElement(By.id("autosuggest")).sendKeys("ger");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("Germany")){
				System.out.println("Country Name: " + option.getText());
				option.click();
				
				break;	
			}	
			
		}
		
		//Destination DropDown 
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		System.out.println("Departure:  " + driver.findElement(By.xpath("//a[@value='HYD']")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		System.out.println("Arrival:  " + driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).getText());
	
		driver.quit();
	}
}
