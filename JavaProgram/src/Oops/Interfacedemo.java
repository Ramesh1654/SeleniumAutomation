package Oops;


interface Test {
	//interface contains final & static variables and if you mention static keyword then it will
	//become static variable
	int length = 10;
	int width = 20;
	
	 void method(); // there is no implementation {} that's y it is abstract method
	// interface doesn't allowed implementation {} but allowed default & static method 
	default void Test1() {
		System.out.println("Default method ..........");
	}
	static void test2() {
		System.out.println("Static method.........");
	}
}
interface Test11 {
	int length = 20;
	static int width = 10;
	default void Test() {
		System.out.println("Default method11 ..........");
	}
	static void Test1() {
		System.out.println("Interface Test11");
	}
	
}

public class Interfacedemo  implements Test,Test11{
	
	//class allowed abstract method implementation but we have to use "public" keyword
	public void method() 
	{
		System.out.println("Abstract method contains implementation");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacedemo demo = new Interfacedemo();
		demo.method();
		Test11 demo1 = new Interfacedemo();
		demo1.Test();
		Test11.Test1();// static method doesn't have object creation  & 
		//static method directly access from interface
		System.out.println(Test.length*Test.width);//accessing static variables directly
	}
	
}
