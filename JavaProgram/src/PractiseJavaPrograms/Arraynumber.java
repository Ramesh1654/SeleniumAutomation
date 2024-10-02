package PractiseJavaPrograms;

public class Arraynumber {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 1, 0, 0, 1, 0 }; // Array length = 8
		int j = 0;
		for (int i = 0; i <=arr.length-1; i++) {
			if (arr[i] == 0) {
				arr[j++]=arr[i];	
				System.out.println(arr[i]); //0's
			}
		}
		while (j < arr.length) {
			arr[j++] = 1;
			//System.out.println(arr[j++]);
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " "); 
		}
	}
}
