package javaAssignment;

public class ConvertStringToChar {

	public static void convertString(String str) {
		char []c = null;
		for(int i=0;i<str.length();i++) {
			c= str.toCharArray();
			System.out.print(" " +c[i]);
		}
		System.out.println();
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			System.out.println("Character at "+i+" Position: "+ch);
		}
	}
	public static void convertCharacter(char ch) {
		String str= Character.toString(ch);
		System.out.println("String is: "+ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertString("Tharuni");
		 convertCharacter('P'); 
	}

}
