package oops;

class Student{
	
	private String name;
	private int rollno;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.setName("Tejas Zanzad");
		obj.setRollno(176);
		obj.setAge(22);
		
		System.out.println("My name is "+obj.getName());
		System.out.println("My roll no is "+obj.getRollno());
		System.out.println("My age is "+obj.getAge());
	}

}
