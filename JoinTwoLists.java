package javaAssignment;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1= new ArrayList<>();
		list1.add(15);
		list1.add(20);
		list1.add(35);
		list1.add(40);

		List<Integer> list2= new ArrayList<>();
		list2.add(10);
		list2.add(5);
		list2.add(25);
		list2.add(30);
		
		list1.addAll(list2);
		System.out.println(list1);

	}

}
