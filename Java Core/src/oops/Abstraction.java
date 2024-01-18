package oops;

//abstract class
abstract class MyClass1{
	//abstract method
	abstract void calculate (double x);
}
class Sub1 extends MyClass1{

	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square:"+(x*x));
	}
}
class Sub2 extends MyClass1{

	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square Root:"+Math.sqrt(x));
	}
}
class Sub3 extends MyClass1{

	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Cube:"+(x*x*x));
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating sub class objects
				Sub1 obj1 = new Sub1();
				Sub2 obj2 = new Sub2();
				Sub3 obj3 = new Sub3();
				
				//calling abstract method calculate using sub class objects
				obj1.calculate(2);
				obj2.calculate(4);
				obj3.calculate(3);
	}

}
