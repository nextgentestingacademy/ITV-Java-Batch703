package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Find out if there are any occurrences of the word "java" in a sentence.

public class RegexExample {

	public static void main(String[] args) {
		String sentence = "rahul.kamat";
		Pattern pat = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher(sentence);
		boolean found = mat.find();
		
		if(found) {
			System.out.println("The value is in a valid email format");
		} else {
			System.out.println("The value is not in a valid email format");
		}
	}

}
