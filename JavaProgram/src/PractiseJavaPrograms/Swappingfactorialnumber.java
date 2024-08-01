package PractiseJavaPrograms;

import java.util.Scanner;

public class Swappingfactorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//In Java, Scanner is a class in java.util package used for obtaining the input of the 
//primitive types like int, double, etc. and strings. Using the Scanner class in Java is 
//the easiest way to read input in a Java program.
		
		// Swapping a two numbers without using third variable
		
		/*int a = 1, b = 2;
		System.out.println("Enter the values of a and b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping:"+a+"+b+");
		a = a + b;
		b = a + b;
		a = a - b;
		System.out.println("After swapping:"+a+"+b+");	*/
		
		//Finding factorial of a number
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int no=sc.nextInt();
		for(int i=1;i<no;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of a given number:"+fact);
		
	}

}
