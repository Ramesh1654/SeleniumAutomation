package Practiseprograms;

public class Printalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "Selenium123java456";
//		char[] carry = s.toCharArray();
//		for(char c: carry) {
//			if(Character.isDigit(c)) {
//				System.out.print(c);
//			}
//		}
		String s = "abc123$";
		System.out.println("alphabet: "+s.replaceAll("(?i)[^A-Z]+", ""));
        System.out.println("numeric: "+s.replaceAll("(?i)[^0-9]+", ""));
		System.out.println("Symbol: "+s.replaceAll("(?i)[A-Z0-9]+", ""));


	}

}
