package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File obj = new File("D:/Java Core/MyFile.txt");
		
		//create new file
		if(obj.createNewFile()){
			System.out.println("File Created");
		}
		else {
			System.out.println("File Already Exists");
		}
		
		//write content to the file
		FileWriter writer = new FileWriter(obj);
		writer.write("Test Data");
		System.out.println("Data Written To The File");
		writer.close();
	
	
	   //read content of the file
	   Scanner myReader = new Scanner(obj);
	   while (myReader.hasNextLine()) {
	   String data = myReader.nextLine();
	   System.out.println(data);
	   	   
	}
	   myReader.close();
}
}

