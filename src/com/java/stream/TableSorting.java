package com.java.stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class TableSorting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath(" //tr/th[1]")).click();

		List<WebElement> OgList = driver.findElements(By.xpath(" //tr/td[1]"));

		List<String> NewList = OgList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> SortedList = NewList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(NewList.equals(SortedList));

	}

}
