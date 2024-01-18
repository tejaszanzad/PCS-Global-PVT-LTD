package methods;

class Student {
	
	public void method1() {
		System.out.println("Method with no parameters and no return type");
	}
	
	public void method2(int a, int b) {
		System.out.println("Method with 2 parameters and no return type");
		System.out.println(a+b);
	}
	
	public int method3() {
	    System.out.println("Method with no parameters and return type");
	    return 10;
	}
	
	public int method4(int a,int b) {
		System.out.println("Method with 2 parameters and return type");
		return a+b;
		
	}
	
}

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
	   
		s.method1();
	    s.method2(10,20);
	    System.out.println(s.method3());
	    int res = s.method4(20,30);
	    System.out.println(res);	
	}

}
