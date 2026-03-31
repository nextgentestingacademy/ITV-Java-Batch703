package scanner;

import java.util.Scanner;

public class UserIPExample {
	public static void main(String[] args) {
		Scanner objIP = new Scanner(System.in);
		System.out.println("Please enter your preferred browser");
		String browser= objIP.nextLine();
		launchBrowser(browser);
		
		System.out.print("Please enter your age:");
		System.out.println("Users age is " + objIP.nextInt());
		objIP.close();
	}
	
	public static void launchBrowser(String browserName) {
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launching Chrome browser");
			break;
		case "firefox":
			System.out.println("Launching Firefox browser");
			break;
		case "edge":
			System.out.println("Launching Edge browser");
			break;
		default:
			System.out.println("Invalid browser name");
		}
	}

}
