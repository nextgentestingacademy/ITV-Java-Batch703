package lambda;

import java.util.ArrayList;

public class LambdaExpExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
//		System.out.println("Using for loop");
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.print(" " + numbers.get(i));
//		}
//		System.out.println();
		int total=0;
		int total2=0;
		System.out.println("Using for-each loop");
		for(Integer num: numbers) {
			total = total + num;
		}
		System.out.print(total);
		
		System.out.println("Using lambda expression");
		numbers.forEach((num) -> total2 = total2 + num);
		System.out.println(total2);
	}
}