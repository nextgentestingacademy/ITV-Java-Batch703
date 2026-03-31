package enums;

enum Employee{
	FULL_TIME,
	PART_TIME,
	CONTRACTOR
}

public class SampleEnum {
	public static void main(String[] args) {
		printEmployeeType(Employee.CONTRACTOR);
		printEmployeeType(Employee.FULL_TIME);
		printEmployeeType(Employee.PART_TIME);
	}

	public static void printEmployeeType(Employee emp) {
		switch(emp) {
		case FULL_TIME:
			System.out.println("This is a Full Time employee");
			break;
		case PART_TIME:
			System.out.println("This is a Part Time employee");
			break;
		case CONTRACTOR:
			System.out.println("This is a Contractor employee");
			break;
		}
	}
	
	
}
