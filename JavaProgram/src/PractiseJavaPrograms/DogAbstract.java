package PractiseJavaPrograms;

//Abstract class
abstract class Animal {
	// Abstract method declared as a abstract keyword
	public abstract void animalsound();
}

public class DogAbstract extends Animal {
	public void animalsound() {
		System.out.println("Woof");
	}

	public static void main(String[] args) {
		Animal da = new DogAbstract();
		da.animalsound();

	}

}
