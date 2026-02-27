package algorithms;

public class LargestOfThree {
	public static void main(String[] args) {
		System.out.println(largestThree(4,2,35));
		System.out.println(largestThree(-29,-1,-3));
	}

	public static int largestThree(int a, int b, int c) {
		if((a>b) && (a>c)) {
			return a;
		}else if((b>a) && (b>c)) {
			return b;
		}else {
			return c;
		}
	}
}