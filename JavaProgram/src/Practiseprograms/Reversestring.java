package Practiseprograms;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		// Reverse a string using Stringbuffer
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String S=sc.nextLine();
		StringBuffer sb=new StringBuffer(S);
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse a string "+rev);
		
		//Reverse a string without using Stringbuffer
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String S=sc.nextLine();
		for(int i=S.length();i>0;i--) {
			System.out.print(S.charAt(i-1));
		}*/
		
		//Reverse a number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse a number:"+rev);
	}

}
