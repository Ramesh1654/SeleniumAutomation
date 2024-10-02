package PractiseJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practisejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int org_no =num;
		int rev =0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		//System.out.println("Given number is a palindrome number");
		if(org_no==rev) {
			System.out.println("Given number is a palindrome number");
		}else 
			System.out.println("Not a Palindrome number");						
	}
}
