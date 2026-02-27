package algorithms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 87;
		int b = 64;

		a = b-a;
		b = b-a;
		a = a+b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
