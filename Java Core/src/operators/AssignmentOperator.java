package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Assignment Operator");
        int a = 5;
        int b = a + 10;
        int c = a + b - 2;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        a+=20;
        System.out.println(a);
	}

}
