package java_basics;

public class ConditionalStatements {

	public static void main(String[] args) {
//		int age = 17;
//		boolean citizen = true;
//		
//		if(age >= 18 && citizen) {
//			System.out.println("You are eligible to vote.");
//		}else {
//			System.out.println("You are not eligible to vote.");
//		}
//		
//		float marks = 15.5f;
//		
//		if(marks >=35 && marks < 60) {
//			System.out.println("Grade: Pass Class");
//		}else if(marks >=60 && marks < 75) {
//			System.out.println("Grade: First Class");
//		}else if(marks >=75) {
//			System.out.println("Grade: Distinction");
//		}else {
//			System.out.println("Grade: Fail");
//		}
//		
//		//Nested if-else
//		
//		int num1 = 155;
//		int num2 = 20;
//		int num3 = 30;
//		
//		if(num1 > num2) {
//			System.out.println("num1 is greater than num2");
//			if(num1 > num3) {
//				System.out.println("num1 is the greatest");
//			}
//			 else {
//				System.out.println("num1 is not the greatest");
//			}
//		}else {
//			System.out.println("num1 is not the greatest");
//		}
		
		
		//Switch Case
		String browser = "Firefoxy";
		
//		if(browser.equals("Chrome")) {
//			System.out.println("You are using Chrome browser.");
//		}else if(browser.equals("Firefox")) {
//			System.out.println("You are using Firefox browser.");
//		}else if(browser.equals("Edge")) {
//			System.out.println("You are using Edge browser.");
//		}else {
//			System.out.println("Incorrect Browser.");
//		}
		
		//Switch case is more efficient and cleaner than multiple if-else statements when checking a single variable against multiple values.
		switch(browser) {
		case "Chrome":
			System.out.println("You are using Chrome browser.");
			break;
		case "Firefox":
			System.out.println("You are using Firefox browser.");
			break;
		case "Edge":
			System.out.println("You are using Edge browser.");
			break;
		default:
			System.out.println("Incorrect Browser.");
			break;
		}
	}
}
