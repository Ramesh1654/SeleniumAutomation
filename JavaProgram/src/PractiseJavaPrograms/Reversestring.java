package PractiseJavaPrograms;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Str=sc.next();
		//String org_str=Str;
		String rev="";
		int len=Str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+Str.charAt(i);
		}
		System.out.println("Reverse the String: "+rev);
		
		// Reverse a string using Stringbuffer
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String S=sc.nextLine();
		StringBuffer sb=new StringBuffer(S);
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse a string "+rev);*/
		
		//Reverse a number
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse a number:"+rev);*/
	}

}
