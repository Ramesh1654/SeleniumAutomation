package PractiseJavaPrograms;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Biggestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In Java scanner is a class java.utils package used for obtaining the input 
		//of the primitive data types as like int, double etc. and strings. Using the 
		//Scanner class in java is easiest way to read input in a java program.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(65);
		numbers.add(76);
		numbers.add(5);
		numbers.add(4);
		numbers.add(33);
		numbers.add(4);
		numbers.add(34);
		numbers.add(232);
		numbers.add(3);
		numbers.add(2323);
		int maxnumbers = Collections.max(numbers);
		System.out.println(maxnumbers);

	}

}
