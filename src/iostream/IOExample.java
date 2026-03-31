package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExample {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("config.txt");
			
			int data; //to read the data from the file and store it in this variable
			while((data=fis.read())!=-1){
				System.out.print((char)data);
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
	}

}
