package array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println("Printing Array Elements In Matrix Style");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
