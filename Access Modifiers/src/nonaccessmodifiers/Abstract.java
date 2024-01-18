package nonaccessmodifiers;

//abstract class
abstract class Main {
	
	public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method

}


class Student extends Main {
	
     public int graduationYear = 2018;
     public void study() { 
       
     System.out.println("Studying all day long"); //the body of the abstract method is provided here
}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Obj = new Student();

	    System.out.println("Name: " + Obj.fname);
	    System.out.println("Age: " +  Obj.age);
	    System.out.println("Graduation Year: " + Obj.graduationYear);
	    Obj.study(); // calls abstract method
	}

}
