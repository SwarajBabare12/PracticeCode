package practiceWeb;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFromFill {

	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("webdriver.chrome.driver", "S:\\Eclipse Path\\Chromedriver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).click();
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Swaraj");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("swaraj@mail.com");
		driver.findElement(By.cssSelector("input#exampleInputPassword1")).sendKeys("swaraj");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.cssSelector("select#exampleFormControlSelect1")).click();
		WebElement option= driver.findElement(By.cssSelector("select#exampleFormControlSelect1"));
		Select dropDown = new Select(option);
		dropDown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("19-02-1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
		}
		
		}

