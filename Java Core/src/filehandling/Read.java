package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			File myObj = new File("C:/PCS Global/Tejas Zanzad.txt");

			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {

			String data = myReader.nextLine();

			System.out.println(data);

			}

			myReader.close();

			} catch (FileNotFoundException e) {

			System.out.println("An error occurred.");

			e.printStackTrace();

			}


	}

}
