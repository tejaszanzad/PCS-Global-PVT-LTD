package scannerclass;

import java.util.Scanner;

class Employee {
	
	int eId;
	String ename, location;
	
	public void getDetails() {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Employee Id :");
	    eId = sc.nextInt();
	    
	    sc.nextLine();
	    
	    System.out.println("Enter Employee Name :");
	    ename = sc.nextLine();
	    
	    System.out.println("Enter Employee Location :");
	    location = sc.nextLine();
	    
	    sc.close();
	};
	
	public void setDetails() {
		
		System.out.println("Printing Employee Details");
		System.out.println("Employee Id :"+eId);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Location :"+location);
	}		
}

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee eobj = new Employee();
		
		eobj.getDetails();
		eobj.setDetails();	
	}

}
