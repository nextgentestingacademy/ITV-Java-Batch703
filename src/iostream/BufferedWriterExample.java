package iostream;

import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt",true));
			bw.write("\nAutomation execution started.\n");
			bw.write("Test case 1 passed.\n");
			bw.write("Test case 2 failed.");
			bw.close();
			System.out.println("Content written to file successfully.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
