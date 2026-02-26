package java_oops;

public class VariableScopeExample {
	//class level variables/attributes - global scope - across the entire class
	String name;
	
	void empDetails() {
		int age = 24;
		System.out.println("Employee name: " + name); 
		System.out.println("Employee age: " + age); //local variable - scope is limited to the method where it is declared
	}
	
	void QATeamDetails() {
		System.out.println("QA team member:" + name);
	}
	
	public static void main(String[] args) {

		VariableScopeExample obj = new VariableScopeExample();
		obj.name = "Sehwag";
		obj.empDetails();
		obj.QATeamDetails();
		
	}

}
