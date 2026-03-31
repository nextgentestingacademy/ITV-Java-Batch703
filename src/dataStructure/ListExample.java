package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) {
		
		//creating an object of ArrayList class
		ArrayList<String> empNameAL = new ArrayList<String>();
		empNameAL.add("Vivek");
		empNameAL.add("Parth");
		empNameAL.add("Sarita");
//
//		System.out.println("The original list is as follows:");
//		//traversing through the list
//		for(String i : empNameAL) {
//			System.out.println(i);
//		}
//		
//		//added few more to the list
//		empNameAL.add("Virendra");
//		empNameAL.add("Vanita");
//		
//		
//		System.out.println("The updated list is as follows:");
//		//traversing through the list
//		for(String i : empNameAL) {
//			System.out.println(i);
//		}
//		
//		System.out.println("Removing value at index 2:");
//		empNameAL.remove(2);
//		
//		System.out.println("The updated list after removing value at index 2");
//		//traversing through the list
//		for(String i : empNameAL) {
//			System.out.println(i);
//		}
//		
//		//Retrieve the value
//		System.out.println("Value at index 0 is: " + empNameAL.get(0));
//		
//		//Update the value
//		empNameAL.set(0,"Sachin");
//		System.out.println("The updated Value at index 0 is: " + empNameAL.get(0));
//		
//		System.out.println("Values in list before sorting");
//		System.out.println(empNameAL);
//
//		//Sort the list in ascending order
//		Collections.sort(empNameAL);
//		System.out.println("Values in list after sorting");
//		System.out.println(empNameAL);
//		
//		//Sort the list in reverse order (desc)
//		Collections.sort(empNameAL,Collections.reverseOrder());
//		System.out.println("Values in list in descending order");
//		System.out.println(empNameAL);
		
		LinkedList<String> execStepsLL = new LinkedList<String>();
		execStepsLL.add("Login");
		execStepsLL.add("Navigate to Fund Transfer");
		execStepsLL.addFirst("Open Browser");
		execStepsLL.addLast("Logout");
		execStepsLL.addLast("Logout");
		System.out.println(execStepsLL);
		
		System.out.println(execStepsLL.contains("Select From account"));
		
		System.out.println("Removing the elements from the list");
		execStepsLL.clear();
		System.out.println(execStepsLL);
	}
}