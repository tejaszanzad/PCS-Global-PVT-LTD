package array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter No. of subjects ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] marks = new int[n];
	
		for(int i=0; i<n ;i++) {
			System.out.println("Enter Subject "+(i+1)+" Marks");
			marks[i] = sc.nextInt();
		}
		
		System.out.println("Displaying Student Marks");
		for(int i=0; i<n; i++) {
			System.out.print(marks[i]+" ");
		}
	}

}
