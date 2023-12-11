package Practiseprograms;

import java.util.Scanner;

public class Primenumber {
//In Java scanner is a class java.utils package used for obtaining the input of the primitive 
//data types as like int, double etc. and strings. Using the Scanner class in java is easiest way
// to read input in a java program.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, i;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		if (no == 1) {
			System.out.println("Prime Number is 2");
		}
//why i cannot be defined below
		for (i = 2; i < no; i++) {
			if (no % i == 0) {
				System.out.println("Not Prime Number");
				break;
			}
		}
		if (no == i) {

			System.out.println("Prime Number");
		}
	}
}