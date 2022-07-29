package Pooja;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		try {
			String s = null; //initialize s with null value
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		

	}

}
