package private1;

class Print {

private int x = 5;

void Display() {

System.out.println("Hello World");

}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

}

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print A = new Print();

		System.out.println(A.getX());

		A.Display();
	}

}
