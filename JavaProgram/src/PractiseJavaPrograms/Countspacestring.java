package Practiseprograms;

public class Countspacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ramesh Software";
		int count = 0;
		int no = s.length();
		for (int i = 0; i < no; i++) {
		if (s.charAt(i) == ' ') {
		count++;
		    }
		}
		System.out.println("spacecount:"+count);
	}

}
