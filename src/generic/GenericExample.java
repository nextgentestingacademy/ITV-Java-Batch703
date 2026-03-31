package generic;


//class BoxInt{
//	int val;
//	
//	void set(int value) {
//		val = value;
//	}
//	
//	int get() {
//		return val;
//	}
//}
//
//class BoxStr{
//	String val;
//	
//	void set(String value) {
//		val = value;
//	}
//	
//	String get() {
//		return val;
//	}
//}


class Box<T>{
	T val;
	
	//generic set method
	void set(T value) {
		val = value;
	}
	
	
	//generic get method
	T get() {
		return val;
	}
	
	//generic method to print array elements
	void printArray(T[] arr){
		for(T elm: arr) {
			System.out.print(" " + elm);
		}
		System.out.println();
	}
}


public class GenericExample {

	public static void main(String[] args) {
		Box<Integer> boxInt = new Box<>();
		boxInt.set(123);
		System.out.println(boxInt.get());
		Integer[] arrInt = {1,2,3,4,5};
		boxInt.printArray(arrInt);
		
		Box<Boolean> boxBool = new Box<>();
		boxBool.set(true);
		System.out.println(boxBool.get());
		
		Box<String> boxStr = new Box<>();
		boxStr.set("India");
		System.out.println(boxStr.get());
		String[] arrStr = {"A","B","C","D"};
		boxStr.printArray(arrStr);
		
	}

}
