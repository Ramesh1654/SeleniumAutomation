package PractiseJavaPrograms;

public class SegregateNumbers {
	public static void main(String[] args) {
		
		int arr[] = { 0, 1, 1, 1, 0, 0, 1, 0, 2, 2, 4, 3, 3, 2, 4, 4, 1 }; // Array length = 8
		int j = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == 0) {
				arr[j++]=arr[i];	
			}
		}
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == 2) {
				arr[j++]=arr[i];	
			}
		}
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == 3) {
				arr[j++]=arr[i];	
			}
		}
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == 4) {
				arr[j++]=arr[i];	
			}
		}
		while (j < arr.length) {
			arr[j++] = 1;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
