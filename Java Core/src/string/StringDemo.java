package string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Methods Of Strings");
		String s1 = new String("Hello World");
		
		//Length
		System.out.println(s1.length());
		
		//Substring
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		//String Comparison
		String s2 = new String("Hello");
		String s3 = new String("Heldo");
		System.out.println(s2.compareTo(s3));
		
		//isEmpty
		String s4 ="";
		System.out.println(s4.isEmpty());
	    
		//to Lower Case
		String s5 = "Hello";
		System.out.println(s5.toLowerCase());
		
		//to Upper Case
		String s6 = "hello";
		System.out.println(s6.toUpperCase());
		
		//replace
		String s7 = "Heldo";
		String replace = s7.replace('d','l');
		System.out.println(replace);
		
		//Equals
		String x = "Welcome To Java";
		String y = "Welcome To java";
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));
		
	}

}
