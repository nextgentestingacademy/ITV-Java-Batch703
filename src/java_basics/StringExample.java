package java_basics;

public class StringExample {

	public static void main(String[] args) {
		String statement = " This is Java programming. ";
		System.out.println(statement.contains("Python"));
		
		System.out.println("Length of statement is : " + statement.length());
		statement.trim();
		System.out.println(statement.toLowerCase());
		statement = statement.replace("Java", "Python");
		System.out.println(statement);
		
		
	}

}
