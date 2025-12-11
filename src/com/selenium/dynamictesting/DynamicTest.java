package com.selenium.dynamictesting;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTest {

	public static void main(String[] args) {
		
		DynamicMethod operation = new DynamicMethod();
		String[]inputs=operation.input();
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		operation.AddItem(driver, inputs);
		
	}

}
