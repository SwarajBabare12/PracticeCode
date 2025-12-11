package com.selenium.assignmentExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RealTime {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Select and Grab Text
		driver.findElement(By.id("checkBoxOption1")).click();
		String Text = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		System.out.println(Text);
		//From dropdown select checkbox option
		WebElement Option = driver.findElement(By.id("dropdown-class-example"));
		Select DropDown = new Select(Option);
		DropDown.selectByContainsVisibleText(Text);
		//
		driver.findElement(By.id("name")).sendKeys(Text);
		driver.findElement(By.id("alertbtn")).click();
		String Alert = driver.switchTo().alert().getText(); 
		if(Alert.contains(Text)) {
			
			driver.switchTo().alert().accept();
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
		
	}

}
