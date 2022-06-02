package Pooja;

public class StaticExample1 {
	
	int number= 101;
	// creating static method
	static void display() {
		String name = "Mamta";
		System.out.println("Name is : " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExample1 s = new StaticExample1(); // creating object
		
		System.out.println("Number is : " +s.number); // calling variable to display value
		
		StaticExample1.display(); // calling static method

	}

}
