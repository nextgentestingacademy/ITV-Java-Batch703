package java_basics;

public class ChildClassExample extends AbstractExample implements InterfaceExample{

	public static void main(String[] args) {
		ChildClassExample obj = new ChildClassExample();
		obj.addition();
		obj.multiplication();
		
		//parent interface's methods
		obj.openBrowser();
		obj.navigateToApp();
		obj.login();
		obj.logout();
		
		
		ChildClass2 obj2 = new ChildClass2();
		obj2.openBrowser();
		obj2.navigateToApp();
		obj2.login();
		obj2.logout();
	}

	@Override
	void multiplication() {
		System.out.println("Child class multiplication logic");
	}
	
	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Open Browser");
	}

	@Override
	public void navigateToApp() {
		// TODO Auto-generated method stub
		System.out.println("Navigate");
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Login");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout");
	}

	@Override
	void addition() {
		System.out.println("addition");
		
	}

	
	
}
