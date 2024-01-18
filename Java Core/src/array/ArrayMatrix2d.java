package array;

import java.util.Scanner;

public class ArrayMatrix2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row, col, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		row = sc.nextInt();
		System.out.println("Enter number of coloumns :");
		col = sc.nextInt();
		
		int[][] a = new int[row][col];
		
	    System.out.println("Enter "+(row*col)+" Array Elements");
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	    System.out.println("The Array is");
	    for(i=0; i<row; i++) {
	    	for(j=0; j<col; j++) {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }	

	}

}
