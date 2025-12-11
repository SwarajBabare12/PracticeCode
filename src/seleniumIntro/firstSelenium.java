package seleniumIntro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		//Chrome Driver
		System.setProperty("webdriver.Chrome.driver", "S:\\Eclipse Path\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// FireFox Driver
		// System.setProperty("webdriver.firefox.driver", "S:\\Eclipse Path\\FirefoxDriver\\geckodriver.exe");
	  //  WebDriver driver = new FirefoxDriver();
		
		// MS edge Driver
		//System.setProperty("webdriver.edge.driver", "S:\\Eclipse Path\\MSEdgeDriver\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=17265800321953447554&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062143&hvtargid=kwd-298741529014&hydadcr=5903_2362026&mcid=d1a83ba0cb4d35369c396cac55ec4ae4");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.className("a-input-text")).sendKeys("646645894789");
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[id='invalid-phone-alert'] div[class='a-alert-content']")).getText());
		driver.navigate().back();
		driver.navigate().back();//div[id='invalid-phone-alert'] div[class='a-alert-content']
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		
		// Suggestive Dropdown
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("watch organizer")) {
				System.out.println(option.getText());
				option.click();
				break;
				
			}	
		}
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=17265800321953447554&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062143&hvtargid=kwd-298741529014&hydadcr=5903_2362026&mcid=d1a83ba0cb4d35369c396cac55ec4ae4");
		
		Thread.sleep(2000);
		
		// Select Dropkdown
		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
		WebElement Category = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select CategoryOption = new Select(Category);
		List<WebElement> SelectOne = CategoryOption.getOptions();
		for(WebElement SelectAnyOne : SelectOne) {
			
			if(SelectAnyOne.getText().equalsIgnoreCase("Books")) {
			System.out.println(SelectAnyOne.getText());
			SelectAnyOne.click();
			break;
			
			}
		}
		
		driver.findElement(By.xpath("//div[@id='icp-nav-flyout']/button[@class='nav-flyout-button nav-icon nav-arrow']")).click();
		
	}

}
