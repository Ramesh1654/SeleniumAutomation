package PractiseJavaPrograms;

public class DwnwrdTrianglestarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Downword means  * * * * *
		               // * * * *
		
		int i,j,rows=7;
		for(i=rows-1;i>=0;i--) {
			for(j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
