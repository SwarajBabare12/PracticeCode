package com.selenium.assignmentExplicitWait;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> getIt = windows.iterator();
		String parent = getIt.next();
		String child = getIt.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
