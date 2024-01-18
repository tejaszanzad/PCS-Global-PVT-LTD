package exceptions;

public class ThrowsDemo {
	
	void Division() throws ArithmeticException {
      	
		int a=45,b=0,rs;
      	rs=a/b;
      	
      	System.out.println("\n\tThe result is "+rs);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsDemo obj = new ThrowsDemo();
		
        try {
        	obj.Division();
        }
       
        catch(ArithmeticException ex) {
        System.out.println("\n\tError :"+ex.getMessage());
	}
       
        System.out.println("\n\tEnd of Program");
		
	}

}
