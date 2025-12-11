package com.selenium.assignmentExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class FrameAssign {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		WebElement FirstFrame= driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(FirstFrame);
		WebElement MiddleFrame= driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(MiddleFrame);
		System.out.println(driver.findElement(By.id("content")).getText());
		

	}

}
