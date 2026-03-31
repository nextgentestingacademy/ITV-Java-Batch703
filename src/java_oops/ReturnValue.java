package java_oops;

public class ReturnValue {

	static int[] myMethod() {
		int[] num = { 5, 10 };
		return num;
	}

	public static void main(String[] args) {
		int retVal[] = myMethod();
		for(int i: retVal) {
			System.out.println(i);
		}
	}

}
