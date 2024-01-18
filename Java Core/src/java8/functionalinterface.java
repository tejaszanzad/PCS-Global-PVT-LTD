package java8;

@FunctionalInterface
interface A{
	
	void show();
	
}
//
//class B1 implements A{
//	
//	public void show() {
//		
//		System.out.println("Class B Implements Interface A");
//	}
//}

public class functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		B1 obj = new B1();
//		obj.show();
		
		A obj = new A()
		{
			public void show()
			{
				System.out.println("Anonymous Inner Class");
			}
		};
		obj.show();
	}

}
