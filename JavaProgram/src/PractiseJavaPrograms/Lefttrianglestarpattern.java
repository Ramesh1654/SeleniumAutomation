package PractiseJavaPrograms;

public class Lefttrianglestarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		for(i=0;i<5;i++){
		    for(j=2*(5-i);j>=0;j--){
		        System.out.print(" ");
		    }
		        for(j=0;j<=i;j++){
		    System.out.print("* ");
		}
		System.out.println();
		    }

	}

}
