package Pooja;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


public class RegexEg {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("..m"); // .- single character
		Matcher m = p.matcher("madam");
		boolean b = m.matches();
		System.out.println(b);
		
		//or
		
		boolean b1 = Pattern.compile("S.").matcher("so").matches();
		System.out.println(b1);
		
		//or
		
		System.out.println(Pattern.matches("..c.", "much"));
		System.out.println(Pattern.matches("[a-zA-Z]{5}", "taTAD"));
		System.out.println("Password : " + Pattern.matches("[a-zA-Z0-9]{8,}", "MamtA1234"));
		System.out.println("Mobile Phone : " + Pattern.matches("[6789]{1}[0-9]{9}", "9234567890"));
		
		

	}

}
