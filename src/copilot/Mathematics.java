package copilot;

public class Mathematics {
	
	int addition;
	int number1, number2;
	
	// Method to perform addition of two numbers - suggested based on variable names
	public int add(int a, int b) {
		this.number1 = a;
		this.number2 = b;
		this.addition = number1 + number2;
		return addition;
	}
	
	//suggested based on existing code
	public int subtract(int a, int b) {
		this.number1 = a;
		this.number2 = b;
		return number1 - number2;
	}
	
	
	// Method to calculate the factorial of a number - suggested based on Class name
	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must be non-negative.");
		}
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	//method to calculate the square root of a number - suggested based on the comments
	public static double squareRoot(double n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must be non-negative.");
		}
		return Math.sqrt(n);
	}
	
	//method to calculate power of a number - suggested based on the comments
	// Fixed: use java.lang.Math.pow instead of non-existent Maths.powerOf
	public static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	// New method: compute gcd using the Euclidean algorithm. Returns gcd(|a|,|b|).
	public static int gcd(int a, int b) {
		// Handle special case where both are zero: define gcd(0,0) = 0
		if (a == 0 && b == 0) {
			return 0;
		}
		// work with absolute values
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// New method: primality test. Returns true for prime numbers >= 2.
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		if (n % 2 == 0) return n == 2;
		if (n % 3 == 0) return n == 3;
		int limit = (int) Math.sqrt(n);
		for (int i = 5; i <= limit; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of " + number + " is: " + factorial(number));
		double squareRootNumber = 16.0;
		System.out.println("Square root of " + squareRootNumber + " is: " + squareRoot(squareRootNumber));

		System.out.println("Addition of 10 and 20 is: " + new Mathematics().add(10, 20));
		System.out.println("Subtraction of 20 from 10 is: " + new Mathematics().subtract(10, 20));

		// Demonstrate the new methods
		System.out.println("gcd(48, 18) = " + gcd(48, 18));
		System.out.println("gcd(0, 0) = " + gcd(0, 0));
		System.out.println("isPrime(29) = " + isPrime(29));
		System.out.println("isPrime(1) = " + isPrime(1));
	}

}