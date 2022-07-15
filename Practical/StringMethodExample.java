package Pooja;

public class StringMethodExample {

	public static void main(String[] args) {
		
		String s = "rathod pooja rathod";
		System.out.println(s.toUpperCase()); //POOJA
		//System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("po")); //true
		System.out.println(s.endsWith("a")); //false
		System.out.println(s.length()); //5
		String rs = s.replace("rathod", "aaaaaa"); //replace all occurances in string
		System.out.println(rs);
		String s1 = "Premkumar";
		String s2 = "Kumar";
		String s3 = "premkumar patil is a good boy";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println(s1.compareToIgnoreCase(s3)); //0
		System.out.println(s1.compareTo(s2)); //positive
		System.out.println(s2.compareTo(s1)); // negative
		System.out.println(s2.concat("komal")); 
		System.out.println(s3.contains("good")); //true
		String[] arr = s3.split("||s"); //split on whitespace
		for(String a : arr) {
			System.out.println(a);
		}
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(0,29));
		
		
		
		

		

	}

}
