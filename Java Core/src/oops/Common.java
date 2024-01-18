package oops;
//all objects sharing same method
class MyClass{
	//method to calculate square value
	void square(double x){
		System.out.println("Square "+(x*x));	
	}
		
}

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create three objects
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass();
		
		//calling square method
		obj1.square(3);
		obj2.square(4);
		obj3.square(5);
		
	}

}
