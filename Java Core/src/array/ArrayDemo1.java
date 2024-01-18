package array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[] a = new int[5];
				a[0] = 10;
				a[1] = 20;
				a[2] = 30;
				a[3] = 40;
				a[4] = 50;
				
			    System.out.println("Length of array: " +a.length);
			    
			    System.out.println("Printing Array using for loop");
			    for(int i=0; i<a.length; i++) {
			    	System.out.print(a[i]+" ");
			    }
		        
			    System.out.println("\nPrinting Array using foreach loop");
		        for(int i : a) {
		        	System.out.print(i+" ");
		        }
	}

}
