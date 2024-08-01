package PractiseJavaPrograms;

public class Rightdownmirrorstarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k,rows=6;
		for(i=rows;i>=0;i--) {
			for(j=rows;j>i;j--) {
	//If you delete spaces in below string u will get downward traingle star pattern
				System.out.print("");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
