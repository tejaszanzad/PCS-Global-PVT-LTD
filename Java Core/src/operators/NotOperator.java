package operators;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Not Operators");
		
        int x=5 ,y=10, z=15;
		
		if(!(x<y && x>z)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

		System.out.println(!(x<y && x>z));
	}

}
