package algorithms;

public class Even_Odd {

	public static void main(String[] args) {
		evenOrdOdd(29);
		evenOrdOdd(30);
	}
	
	public static void evenOrdOdd(int num) {
		if(num%2 == 0) {
			System.out.println(num + " is an even number");
			return;
		}
		System.out.println(num + " is an odd number");
	}
}
