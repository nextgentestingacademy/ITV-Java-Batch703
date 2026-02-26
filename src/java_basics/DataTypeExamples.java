package java_basics;

public class DataTypeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 30;
		
		//Primitive Data Types
		//Numerical Data Types - Primitives
		byte smallNumber = 127; // Range: -128 to 127
		short mediumNumber = 32767; // Range: -32,768 to 32,767
		int largeNumber = 5; // Range: -2,147,483,648 to 2,147,483,647
		long biggerNumber = 10000000000L; // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		float price = 19.99f; // Range: 1.4E-45 to 3.4028235E38
		double precisePrice = 19.9999999999; // Range: 4.9E-324 to 1.7976931348623157E308
		
		//Non Numerical Data Types - Primitives
		char grade = 'A';
		boolean execPass = false;
		
		//Non-Primitive Data Types
		String name = "John Doe";
		
		
		//Wide Casting - Automatic Type Conversion
		
		int num1 = 100; //declared as int
		System.out.println(num1); // Output: 100
		
		double num2 = num1; // int is automatically converted to double
		System.out.println(num2); // Output: 100.0
		
		System.out.println(smallNumber); // Output: 127
		float num3 = smallNumber; // byte is automatically converted to float
		System.out.println(num3); // Output: 127.0
		
		//Narrow Casting - Manual Type Conversion
		System.out.println("Narrow Casting Example:");
		System.out.println(precisePrice);
		byte num4 = (byte) precisePrice;
		System.out.println(num4);
		
		
		var num5 = true; // Using var for type inference (Java 10+)
		
		//Arrays and Classes are also non-primitive data types but we will cover them in later sessions

	}

}
