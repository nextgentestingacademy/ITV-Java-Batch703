package algorithms;

public class CountVowel {

	public static void main(String[] args) {
		String val = "This is such a wonderful day";
		String[] vowels = {"a","e","i","o","u"};
		
		int origLen = val.length();
		
		
		for(String s: vowels) {
			val = val.replace(s, "");
		}
		
		int newLen = val.length();

		int numbOcc = origLen - newLen;
		System.out.println("Number of vowels in the string are " +numbOcc);
	}

}
