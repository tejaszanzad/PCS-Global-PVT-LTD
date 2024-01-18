package exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=45, b=0, rs=0;
		
		try {
			rs=a/b;
		}
		catch(ArithmeticException ex) {
			System.out.println("\n\tError "+ ex.getMessage());
		}
		finally{
			System.out.println("\n\tResult is "+rs);
		}      
	}

}
 








    