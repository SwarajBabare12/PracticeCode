package com.selenium.assignmentExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(0,550)");
		WebElement Table = driver.findElement(By.id("product"));
		int RowCount = Table.findElements(By.tagName("tr")).size();
		System.out.println(RowCount);
		int NumCol = Table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println(NumCol);

		List<WebElement> SecondRow = Table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for (int i = 0; i < NumCol; i++) {

			System.out.println(SecondRow.get(i).getText());

		}
	}

}
