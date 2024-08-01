package PractiseJavaPrograms;

import java.util.Arrays;

import java.util.Collections;

public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ar = {"Hi", "How", "Are", "You", "String"};
		/*Arrays.sort(ar);
		System.out.printf("Modifierd array in ascending order: %s", Arrays.toString(ar));
		System.out.println();
		
        Arrays.sort(ar,Collections.reverseOrder());*/
        System.out.printf("Modified array in descending order: %s", Arrays.toString(ar));
        System.out.println();
        System.out.println("Before Sorting...."+Arrays.toString(ar));
        Arrays.sort(ar);
        
        System.out.println("After sorting...."+Arrays.toString(ar));
        
        
				

	}

}
