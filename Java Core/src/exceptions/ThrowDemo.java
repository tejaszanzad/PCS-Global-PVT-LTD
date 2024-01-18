package exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=45, b=0, rs;
		
		try {
			if(b==0) {
				throw(new ArithmeticException("Cant Divide By Zero"));
			}
			else {
				rs=a/b;
				System.out.println("Result is "+rs);
			}
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception "+ ex.getMessage());
		}
		System.out.println("\nEnd of program");
	}

}
