package Practiseprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Fibonacci series means 0 1 1 2 3 5 8 13
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int fir=0, sec=1, sum=0;
		System.out.println(fir+""+sec);
		for(int i=2;i<10;i++) {
			sum=fir+sec;
			System.out.print(" "+sum);
		fir=sec;
		sec=sum;
		}
	}

}

