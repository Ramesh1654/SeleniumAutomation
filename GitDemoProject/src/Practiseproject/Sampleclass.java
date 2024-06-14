package Practiseproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sampleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(34);
		numbers.add(232);
		numbers.add(3);
		numbers.add(2);
		int maxnumbers = Collections.max(numbers);
		System.out.println(maxnumbers);
	}
}
