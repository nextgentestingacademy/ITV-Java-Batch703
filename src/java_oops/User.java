package java_oops;

public class User extends MethodsExample{
	private String password;
	
	//give controlled access to this variable - Encapsulation
	
	//setter method
	public void setPassword(String value) {
		password = value;
	}
	
	//getter method
	public String getPassword() {
		return password;
	}
	
	public static void main(String[] args) {
//		MethodsExample obj = new MethodsExample();
		login();
		companyName = "Amazon";
	}

	@Override
	void printName() {
		System.out.println("This is a body for abstract method printName");
		
	}

}
