package Pooja;

public class StringExample {

	public static void main(String[] args) {
		String S = "Pooja"; //creating string using literal
		String S1 = "Pooja";
		System.out.println(S);
		System.out.println(S1);
		//or
		char[] arr = {'p','o','o','j','a'};
		String S11 = new String(arr); //converting char array to string
		System.out.println(S11);
		
		//or
		String S3 = new String("Anudip"); //converting string using new keyword
		String s4 = new String("Anudip");
		System.out.println(S3);
		System.out.println(s4);
		
		

	}

}
