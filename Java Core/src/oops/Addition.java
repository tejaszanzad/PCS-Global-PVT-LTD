package oops;

public class Addition {

	public int add(int x, int y) {

		return (x + y);

		}

	public float add(float a, float b) {

		return (a+b);

		}

	public double add(double c, double d) {

		return (c + d);

		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a = new Addition();

		System.out.println(a.add(25, 30));

		System.out.println(a.add(10.0, 15.0));

		System.out.println(a.add(127.5, 123.5));
	}

}
