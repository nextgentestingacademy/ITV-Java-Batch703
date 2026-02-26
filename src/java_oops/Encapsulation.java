package java_oops;

public class Encapsulation {

	public static void main(String[] args) {
		
		//declare an object of the User class
		User obj = new User();
		obj.setPassword("pass@123");
		
		System.out.println(obj.getPassword());
		
	}

}
