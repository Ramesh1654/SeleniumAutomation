package PractiseJavaPrograms;

import java.util.Scanner;

public class Printprimenumber1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,counter, j;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Required packages have been imported");
	      System.out.println("A reader object has been defined ");
	      System.out.print("Enter the n value : ");
	      n=scanner.nextInt();
	      System.out.print("Prime numbers between 1 to 10 are ");
	      for(j=2;j<=n;j++){
	         counter=0;
	         for(i=1;i<=j;i++){
	            if(j%i==0){
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.print(j+" ");
	      }

	}
}
