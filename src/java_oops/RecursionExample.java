package java_oops;

public class RecursionExample {

	
//	void countdown(int num) {
//
//		while(num > 0) {
//			System.out.println(num);
//			num--;
//		}
//		System.out.println("Countdown completed");
//	}
	
	void countdown(int num) {
		if(num == 0) {
			System.out.println("Countdown completed");
			return;
		}
		System.out.println(num);
		num--;
		countdown(num);
	}
	
	public static void main(String[] args) {
		RecursionExample obj = new RecursionExample();
		obj.countdown(5);
	}

}
