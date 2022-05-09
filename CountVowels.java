package javaAssignment;
//Java Program to Count the Number of Vowels and Consonants in a Sentence

public class CountVowels {
	public static void main(String[] args) {
		String str="I am tharuni";
		str.toLowerCase();
		int vowel=0, consonant=0;
		for(int i=0;i<str.length();i++) {

			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
				vowel++;
			}

			else {
				consonant++;	
			}
			
		}
		System.out.println("Vowels are "+vowel);
		System.out.println("Consonants are "+consonant);
	}
}
