
package PractiseJavaPrograms;

import java.util.Scanner;

public class LengthoftheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0;
		////This is the Condition to find length of the String
		for(char c:s.toCharArray()) {
			i++;
		}
		System.out.println("The Length of the String is" +i);
	}

}
