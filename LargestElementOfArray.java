package javaAssignment;

import java.util.Arrays;

public class LargestElementOfArray {
public static void main(String[] args) {
	 int array[]= {7,63,39,98,8,27,45,54};
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	System.out.println("Largest number of list is: "+array[array.length-1]);
}
}
