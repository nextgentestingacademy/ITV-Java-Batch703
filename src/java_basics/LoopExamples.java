package java_basics;

public class LoopExamples {

	public static void main(String[] args) {
		//Do while loop - condition is checked after the execution of the loop body
//		int retryAttempt = 4;
		
//		do {
//			retryAttempt++; //incremented by 1 (retryAttempt = retryAttempt + 1)
//			System.out.println("Retrying test case execution. Attempt: " + (retryAttempt));
//		}while(retryAttempt < 3);
		
		//While loop - condition is checked before the execution of the loop body
//		while(retryAttempt < 3) {
//			retryAttempt++; //incremented by 1 (retryAttempt = retryAttempt + 1)
//			System.out.println("Retrying test case execution. Attempt: " + (retryAttempt));
//		}
		
		//For loop - used when the number of iterations is known beforehand
//		for(int retryAttempt = 0; retryAttempt < 3; retryAttempt++) {
//			System.out.println("Retrying test case execution. Attempt: " + (retryAttempt + 1));
//		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println("Iteration: " + i);
		}
		
//		for(int i=0; i<5; i++) {
//			System.out.println("Outer loop iteration: " + i);
//			for(int j=0; j<3; j++) {
//				System.out.println("Inner loop iteration: " + j);
//			}
//			System.out.println("-----------------------------");
//		}
		
		System.out.println("Test case execution completed.");
	}

}
