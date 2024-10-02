package PractiseJavaPrograms;

public class CountCharacterOccurence {
	
	//Count charactereroccurence

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "Java Programming";
		int Totalcount = s.length();
		int Removecount = s.replace("a", "").length();// if you specify the alphabet/space(" ")
		//you can find the count
		int count = Totalcount-Removecount;
		System.out.println("CountCharacterOccurence:" +count);
	}

}
