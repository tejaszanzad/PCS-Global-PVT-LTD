package constructors;

class Employee {
	
	int empno;
	String empname;
   
	Employee() {
    	System.out.println("Default Constructor");
    	empno = 101;
    	empname = "Jay";
    }
    
	Employee(int empno, String empname) {
    	System.out.println("Parameterized Constructor");
    	this.empno = empno;
    	this.empname = empname;	
    }
		
}

public class ConstructorsDemo {

	public static void main(String[] args) {
		
		Employee eobj = new Employee();
		System.out.println("Employee 1 Details");
		System.out.println("Empno:"+ eobj.empno);
		System.out.println("Empname:"+eobj.empname);
		
		Employee eobj2 = new Employee(102,"Tejas");
		System.out.println("Employee 2 Details");
		System.out.println("Empno:"+ eobj2.empno);
		System.out.println("Empname:"+eobj2.empname);
		
	}
}
