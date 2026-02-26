package java_basics;

public class ArrayExample {

	public static void main(String[] args) {
		
//		int empID = 12345;
//		String empName = "John Doe";
//		double empSalary = 50000.00;
//		
//		
//		int empID1 = 12345;
//		int empID2 = 67890;
//		int empID3 = 54321;
		
//		System.out.println("Employee ID 1: " + empID3);
		
		//syntax to declare an array
		//<datatype>[] arrayName = new <datatype>[size];
		
		//declaring an array to store employee IDs
		int[] empIDs = new int[3];
		empIDs[0] = 12345;
		empIDs[1] = 67890;
		empIDs[2] = 54321;
	
		//for-each loop to iterate through the array and print employee IDs
		for(int i: empIDs) {
			System.out.println("Employee ID: " + i);
		}
		
//		for(int i=0; i<empIDs.length; i++) {
//			System.out.println("Employee ID at index " + i + ": " + empIDs[i]);
//		}
		
		//declaring and initializing an array in one line
//		String[] empNames = {"John Doe", "Jane Smith", "Alice Johnson"};
//		
//		//declaring and initializing an array of employee salaries
//		double[] empSalaries = {50050.09,7839.40, 45000.00};
		
		
	}

}
