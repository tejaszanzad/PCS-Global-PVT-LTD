package exceptions;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		
		try {
			a[10] = 500;
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound!");
		}
		finally {
			System.out.println("Size of array is "+a.length);
		}
		
	}
	}


