package java_oops;

public class AccessModExamples {
	protected static String name;
	
	//access + non access modifiers together
	protected static final void printName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
//		AccessModExamples obj = new AccessModExamples();
		name = "Rahul";
		printName();

	}

}
