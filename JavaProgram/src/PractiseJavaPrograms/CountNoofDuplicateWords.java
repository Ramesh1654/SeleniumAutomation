package Practiseprograms;

import java.util.Scanner;

public class CountNoofDuplicateWords {

	public static void main(String[] args) {

		// In Java scanner is a class java.utils package used for obtaining the input of
		// the primitive data types as like int, double etc. and strings. Using the 
	    // Scanner class in java is easiest way to read input in a java program.

		// Counting no of duplicate words in a string
		
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();
		int count = 1;
		for (int i = 0; i < no.length() - 1; i++) { // This is Condition to count no of Duplicate Words
			if ((no.charAt(i) == ' ') && (no.charAt(i + 1) != ' '))
				count++;
		}
		System.out.println("No of Words in a String:" + count);
	}

}
