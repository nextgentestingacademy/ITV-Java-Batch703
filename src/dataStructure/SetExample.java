package dataStructure;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		//create an object of HashSet
		HashSet<String> objBrowsersHS = new HashSet<String>();
		objBrowsersHS.add("Edge");
		objBrowsersHS.add("Chrome");
		objBrowsersHS.add("Firefox");
		objBrowsersHS.add("Chrome"); //duplicate value
		
		if(objBrowsersHS.contains("Edge")) {
			System.out.println("Edge is present in the HashSet");
		}else {
			System.out.println("Edge is not present in the HashSet");
		}
		
		System.out.println("======= Displaying values in HashSet =======");
		System.out.println(objBrowsersHS);
		objBrowsersHS.remove("Firefox");
		System.out.println("======= Displaying the updated list of values in HashSet =======");
		System.out.println(objBrowsersHS);

		//create an object of TreeSet
		TreeSet<String> objBrowsersTS = new TreeSet<String>();
		objBrowsersTS.add("Edge");
		objBrowsersTS.add("Chrome");
		objBrowsersTS.add("Firefox");
		
		System.out.println("======= Displaying values in TreeSet =======");
		System.out.println(objBrowsersTS);
		objBrowsersTS.remove("Edge");
		System.out.println(objBrowsersTS);
		
		
		//create an object of LinkedHashSet
		LinkedHashSet<String> objBrowsersLHS = new LinkedHashSet<String>();
		objBrowsersLHS.add("Opera");
		objBrowsersLHS.add("IE");
		objBrowsersLHS.add("Firefox");
		objBrowsersLHS.add("Chrome");
		objBrowsersLHS.add("Edge");
		
		System.out.println("======= Displaying values in LinkedHashSet =======");
		System.out.println(objBrowsersLHS);
		
		objBrowsersLHS.clear();
		
	}

}
