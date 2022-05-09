package javaAssignment;

public class ReverseUsingRecursion {
//Java Program to Reverse a Sentence Using Recursion
	 public static void main(String[] args) {
	      String original, reverse;
	      original = "It is a peaceful sunday";
	      System.out.println("The string is defined as :" +original);
	      reverse = reverseString(original);
	      System.out.println("The reversed input is: " + reverse);
	   }
	   public static String reverseString(String original ) {
	      if (original.isEmpty())
	         return original;
	      return reverseString(original.substring(1)) + original.charAt(0);
	   }

}
