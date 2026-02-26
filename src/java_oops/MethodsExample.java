package java_oops;

public class MethodsExample {

	void login() {
		System.out.println("Enter username: admin");
		System.out.println("Enter password: admin@123");
		System.out.println("Click on login button");
		System.out.println("Login successful");
	}
	
	void login(String gmailID) {
		System.out.println("Enter gmailID: " + gmailID);
		System.out.println("Click on login button");
		System.out.println("Login successful");
	}

	void login(long mobileNumber) {
		System.out.println("Enter mobile number: " + mobileNumber);
		System.out.println("Click on login button");
		System.out.println("Login successful");
	}
	
	void login(String uid, String pwd, String captcha) {
		System.out.println("Enter username: " + uid);
		System.out.println("Enter password: " + pwd);
		System.out.println("Enter captcha: " + captcha);
		System.out.println("Click on login button");
		System.out.println("Login successful");
	}
	
	void search() {
		System.out.println("Enter product name: iPhone 14");
		System.out.println("Click on search button");
		System.out.println("Search results displayed");
	}
	
	void addToCart() {
		System.out.println("Select product: iPhone 14");
		System.out.println("Click on add to cart button");
		System.out.println("Product added to cart");
	}
	
	void logout() {
		System.out.println("Click on logout button");
		System.out.println("Logout successful");
	}
	
	public static void main(String[] args) {
		//syntax to create object of class
//		<className> objectName = new <className>();
		MethodsExample obj = new MethodsExample();
		obj.login("viraj", "viraj@123","AD1RE");
		obj.login();
		obj.login(1234567890L);
		obj.login("rahulabhaykamat@gmail.com");
//		obj.search();
//		obj.addToCart();
//		obj.logout();
	}
	
}
