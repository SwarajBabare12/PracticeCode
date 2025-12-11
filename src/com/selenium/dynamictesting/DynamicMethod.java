package com.selenium.dynamictesting;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicMethod {

	public String[] input() {
		System.out.println("Select Vegetables: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputUser = input.split("[,\s]+");
		return (inputUser);
	}

	public void AddItem(WebDriver driver, String inputUser[]) {
		int size = inputUser.length;
		int j = 0;
		List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < options.size(); i++) {

			String[] optionsGet = options.get(i).getText().split("-");
			String optionName = optionsGet[0].trim();

			for (String inputList : inputUser) {

				if (inputList.equalsIgnoreCase(optionName)) {

					driver.findElements(By.xpath("//div[@class='product-action'] /button")).get(i).click();

					j++;
					if (j == size) {
						break;
					}

				}
			}
		}
		if (j == size) {
			System.out.println("Items Added Successfully - Passed");
		} else {
			System.out.println("Check Inputs");
		}
	}
}
