package java8;

@FunctionalInterface
interface C{
	
	int add(int i, int j);
	
}

public class lambdaexpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        C obj = (int i, int j) -> i+j;
		
        int result = obj.add(5, 4);
        System.out.println("Result is "+ result);
	}

}
