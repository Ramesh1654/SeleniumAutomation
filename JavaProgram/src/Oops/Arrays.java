package Oops;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Finding duplicate numbers in an array
		
		int a[] = {100, 200, 300,100,200,100,100,200,100};
		int num = 100;
		int count = 0;
		for(int value:a) {
			if(value==num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
