package exceptionHandle;

public class ExceptionTypes {
	
	//divide a number 10 with the value I get as an input parameter
	void division(int value) throws ArithmeticException{
		System.out.println(10/value);
	}
	

	public static void main(String[] args) {
		ExceptionTypes obj = new ExceptionTypes();
		try {
			//calling the method
			obj.division(0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
			
		//		// Compile time error - Syntax error
//		int a = 10;
//		int balance = -1;
//		
//		try {
//			if (balance<0) {
//				throw new RuntimeException("Invalid Balance");
//			}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			balance = 1000;
//		}
//		System.out.println("Valid balance updated: " + balance);
//		
//		
//		
//		
//		System.out.println(a);
//		
//		try {
//			//Runtime error
//			int[] participantID = {1,2,3,4};
//			
//			for(int i=0;i<participantID.length;i++) {
//				System.out.println(participantID[i]);
//			}
//			
//			System.out.println(a/0);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("This code will always get executed");
//		}
//		
//		//Logical error - Infinite loop
//		for(int i=0;i<=5;i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("End of the code");
	}
}
