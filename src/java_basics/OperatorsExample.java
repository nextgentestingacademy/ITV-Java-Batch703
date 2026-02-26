package java_basics;

public class OperatorsExample {

	public static void main(String[] args) {
		// Arithmetic Operators: + - * / %
		// Assignment Operators: = += -= *= /= %=
		// Comparison Operators: == != > < >= <=
		// Logical Operators: && || !
		// Precedence of Operators: () > * / % > + - >
		
		
		byte num1 = 10;
		byte num2 = 20;
		
		System.out.println("Arithmetic Operators:");
		System.out.println("num1 + num2 = " + (num1 + num2)); // 30
		System.out.println("num1 - num2 = " + (num1 - num2)); // -10
		System.out.println("num1 * num2 = " + (num1 * num2)); // 200
		System.out.println("num1 / num2 = " + (num1 / num2)); // 0 (integer division)
		System.out.println("num1 % num2 = " + (num1 % num2)); // 10
		
		num1 += 5; // num1 = num1 + 5
		num2 -= 3; // num2 = num2 - 3
		System.out.println("After Assignment Operators:");
		System.out.println("num1 = " + num1); // 15
		System.out.println("num2 = " + num2); // 17
		
		
		System.out.println("Comparison Operators:");
		System.out.println("num1 == num2: " + (num1 == num2)); // false
		System.out.println("num1 != num2: " + (num1 != num2)); // true
		System.out.println("num1 > num2: " + (num1 > num2)); // false

		// Logical Operators
		boolean condition1 = true;
		boolean condition2 = false;
		System.out.println("Logical Operators:");
		System.out.println("condition1: " + condition1); // true
		System.out.println("condition2: " + condition2); // false
		System.out.println("condition1 && condition2: " + (condition1 && condition2)); // false
		System.out.println("condition1 || condition2: " + (condition1 || condition2)); // true
		System.out.println("!condition1: " + (!condition1)); // false
		
		
		//Precedence of Operators - BODMAS (Brackets, Orders, Division/Multiplication, Addition/Subtraction)
		System.out.println("Precedence of Operators:");
		int result = (10 + 20) * 5; // Multiplication has higher precedence than addition
		System.out.println("10 + 20 * 5 = " + result); // 110
	}

}
