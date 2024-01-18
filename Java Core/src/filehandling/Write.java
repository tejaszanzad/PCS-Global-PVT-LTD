package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			FileWriter myWriter = new FileWriter("C:/PCS Global/Tejas Zanzad.txt");

			myWriter.write("Welcome to PCS Global PVT LTD");

			myWriter.close();

			System.out.println("File written successfully");

			} catch (IOException e) {

			System.out.println("An error occurred.");

			e.printStackTrace();

			}
	}

}
