package Pooja;

public class ConstructorExample1 {
	
	int id;
	String name;
	double fees;
	
	// creating parameterized constructor
	public ConstructorExample1(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
		
	}
	// method to display the values
	void display() {
		System.out.println(id + " " + name + " " + fees);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object and passing values
		
		ConstructorExample1 c = new ConstructorExample1(101,"Chiu",678.90);
		c.display();
				
	}

}
