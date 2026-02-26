package java_oops;

public class ConstructorExample {
	String name;
	int age;
	
	//constructor - special method used to initialize the state of an object //constructor name should be same as class name //constructor does not have return type, not even void
	ConstructorExample(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println(name + " " + age);
	}
	
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample("Parth",22);
	}

}
