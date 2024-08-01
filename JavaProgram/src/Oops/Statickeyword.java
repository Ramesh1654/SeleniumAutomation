package Oops;

public class Statickeyword {
	//Static Keyword can be applied to variables & Methods
    static int x=10; // This is static varibale bcz we written static keyword
    int y=20;
    
    static void m1() {
    	System.out.println("This is static method m1");
    }
    void m2() {
    	System.out.println("This is nonstatic method m2");   	
    }
    void m() { // This is non static method
    	System.out.println(x);
    	System.out.println(y);
    	m1();
    	m2();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Static methods can access static stuff directly(witout object)
		 System.out.println(10);
	      m1();
		// Static methods can access non static stuff through object
	    // non static methods can access everything directly ------ line 30
		Statickeyword key = new Statickeyword();  
		 System.out.println(key.y);
         key.m2();
         key.m();
      
	}

}
