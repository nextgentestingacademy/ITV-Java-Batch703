package iostream;

import java.io.*;

public class IOTextExample {

	public static void main(String[] args) throws IOException {

		String str = "\nThis line is appended to the existing content.";
		try {
			FileOutputStream fos = new FileOutputStream("log.txt",true);
			fos.write(str.getBytes());
			System.out.println("Content appended successfully.");
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
