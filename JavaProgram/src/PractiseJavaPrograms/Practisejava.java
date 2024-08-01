package PractiseJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practisejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct =0, n=0,i=1,j=1;
		while(n<25) {
			j=1;
			ct=0;
			while(j<=i) {
				if(i%j==0) 
					j++;
					ct++;
				}
			if(ct == 2) {
				System.out.printf("%d ", j);
				n++;
			}
			i++;
		}	
		
	}
}
