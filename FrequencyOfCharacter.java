package javaAssignment;

import java.util.Arrays;

//Java Program to Find the Frequency of Character in a String

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str = "Hello Emrin";
		char ch = 'e';
		int frequency = 0;
		String str1= str.toLowerCase();
		for(int i = 0; i < str1.length(); i++) {
			if(ch == str1.charAt(i)) {
				++frequency;
			}
		}

		System.out.println("Frequency of " + ch + " = " + frequency);
	}
}


