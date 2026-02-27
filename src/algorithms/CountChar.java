package algorithms;

public class CountChar {

	public static void main(String[] args) {
		String val = "www";
		String search = "w";
		
		int origLen = val.length();
		
		val = val.replace(search, "");
		int newLen = val.length();

		int numbOcc = origLen - newLen;
		System.out.println("Number of occurrences of " + search + " is " +numbOcc);
	}
}
