package PractiseJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no=sc.nextInt();
		int org_no=no;
		int Rev=0;
		while(no!=0) {
				Rev=Rev*10+no%10;
				no=no/10;			
		}
		if(org_no==Rev) {
			System.out.println("Given number is Palindrome number");
		}else
			System.out.println("Not a Palindrome Number");
		
		
	}

}
