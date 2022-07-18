package Pooja;

public class StringBbiulderEg {

	public static void main(String[] args) {
		// String S = new String("Pooja");
		StringBuilder S = new StringBuilder("Pooja"); // creating object of StringBuilder class
	//	S.append(" Anudip Foundation "); //changes string s
	//	System.out.println(S); // Pooja Anudip Foundation
		
	//	S.insert(0, "Pooja"); //inserting string at given position
		System.out.println(S);
		S.replace(0, 3, "Prem");
		System.out.println(S); //replace string from start to end position
		S.delete(0, 3); //delete string from start to end position
		S.reverse();
		System.out.println(S);
		
		
		
		
		

	}

}
