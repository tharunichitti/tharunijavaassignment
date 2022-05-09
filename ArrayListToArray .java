package javaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public void convertArrayList() {
		List<Integer> list1= new ArrayList<>();
		list1.add(7);
		list1.add(14);
		list1.add(21);
		list1.add(35);
	//	System.out.println(list1);
		System.out.println("ArrayList to array "+Arrays.toString(list1.toArray()));
	}
	
	
	public void convertArray() {
		String name[]= {"Rahi","om","Lokesh"};
		List<String> list= new ArrayList<String>(Arrays.asList(name));
		System.out.println("Array to Arraylist "+list);
	}
	
	
	public static void main(String[] args) {
		ArrayListToArray obj= new ArrayListToArray();
		obj.convertArray();
		obj.convertArrayList();
	}	
}
