package com.java.conceptPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        ArrayList<String> stringList = new ArrayList<>();

	        System.out.println("Enter strings (type 'stop' to finish):");
	        while (true) {
	            String input = sc.nextLine();
	            if (input.equalsIgnoreCase("stop")) {
	                break;
	            }
	            stringList.add(input);
	        }

	        // Convert to array if needed
	        String[] strings = stringList.toArray(new String[0]);

	        System.out.println("You entered:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	}

}
