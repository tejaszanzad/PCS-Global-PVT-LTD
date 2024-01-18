package regex;

import java.util.regex.*; 

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//There are three ways to write the regex in Java.
		
		//1st way  
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		  
		//3rd way  
		boolean b3 = Pattern.matches(".s", "as");  
		  
		System.out.println(b+" "+b2+" "+b3);
	}
}
