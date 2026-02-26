package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {

	public static void main(String[] args) {
		
		//create this reference of the file name and the path mentioned below
		File objFile = new File("ExecutionLog.log");
	
		try {
			if(objFile.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
		//Create an object to write content in the file which was created
		try {
			FileWriter objWrite = new FileWriter("ExecutionLog.log",true);
			
			//write the content in append mode and close the file
			objWrite.write("\nTest execution started");
			objWrite.write("\nExecuting test case number 1");
			objWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
		//Read the content from the file
		try {
			Scanner objRead = new Scanner(objFile);
			
			while(objRead.hasNextLine()) {
				System.out.println(objRead.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
		System.out.println("File content read completely");
		
		//delete the file
		if(objFile.delete()) {
			System.out.println(objFile.getName() + " file has been successfully deleted");
		}else {
			System.out.println(objFile.getName() + " file has not been deleted");
		}
	}
}
