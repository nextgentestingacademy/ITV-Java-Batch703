package algorithms;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("Parth Gawli"));
	}
	
	
	
	public static String reverseString(String val) {
		String rev="";
		for(int i = val.length()-1;i>=0;i--) {
			char c = val.charAt(i) ;
			rev = rev + c;
		}
		return rev;
	}
}
