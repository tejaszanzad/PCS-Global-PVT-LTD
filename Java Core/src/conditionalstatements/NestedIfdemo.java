package conditionalstatements;

public class NestedIfdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		int weight = 80;
		
		//applying conditions to both age and weight
		if(age>18) {
			if(weight>50) {
				System.out.println("You are eligible to donate blood");
			}
		}
		else {
			System.out.println("You are not eligible to donate blood");
		}
	}

}
