package filehandling;

import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			File Obj = new File("C:/PCS Global/Tejas Zanzad.txt");

			if (Obj.createNewFile()) {

			System.out.println("File created: " + Obj.getName());

			} else {

			System.out.println("File already exists.");

			}

			} catch (IOException e) {

			System.out.println("An error occurred.");

			e.printStackTrace();

			}

			}

			
	}


