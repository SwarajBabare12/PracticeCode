package practiceWeb;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class CheckBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"S:\\\\Eclipse Path\\\\Chromedriver\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {

			String Url = link.getAttribute("href");
			HttpURLConnection con = (HttpURLConnection) new URL(Url).openConnection();
			con.setRequestMethod("HEAD");
			int code = con.getResponseCode();
			
			a.assertTrue(code < 400, "This URL " + Url + " with respose code " + code);
		}

		a.assertAll();
	}

}
