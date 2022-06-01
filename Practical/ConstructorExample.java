package Pooja;
// example of default constructor
public class ConstructorExample {
	
	int id; // 0
	String studentName; //null
	double fees; //0.0
	
	// method to display values
	
	void display() {
		System.out.println(id + " " + studentName + " " + fees);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample c = new ConstructorExample(); // creating object
		
		c.display(); // display values with object

	}

}
