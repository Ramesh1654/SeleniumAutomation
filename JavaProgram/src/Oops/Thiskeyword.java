package Oops;

public class Thiskeyword {
		
	int x;  // Both are Class variables / instance variables
	int y;
	
	 /*Thiskeyword(int a,int b) { // Here a b are the local variables
		x = a;
		y = b;			
	}*/
	Thiskeyword(int x,int y) { //Here class name and method name comes under costructor
		// To differetiate the class variables and local variables we have to use 
		this.x = x; // this keyword here 
		this.y = y;  
		
	}
	 void display()
	 {
		 System.out.println(x);
		 System.out.println(y);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword value = new Thiskeyword(10,20);
		value.display();
	}

}
