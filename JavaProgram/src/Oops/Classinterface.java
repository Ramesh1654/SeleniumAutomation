package Oops;

public class Classinterface extends Interfacedemo implements Test,Test11 {
	
	//In above line Class extends another class (Hybrid Inheritance)
	//class (Interfacedemo) implements Interfaces(Test, Test11)
	//This is comes under Multiple Inheritance but c-->c, c-->i, i -->i possible but
	//Interface (i--.c) to class doesn't possible y means In class having default methods,
	//static methods, public methods, implemented methods reason is implemented methods 
	//doesn't allowed by Interface
	
	int x = 100;
	int y = 200;
	public void Test1() {
		System.out.println("Interface Test11");
	}
	
	public static void main(String[] args) {
		Classinterface C = new Classinterface();
		C.Test1();
		
	}
}
