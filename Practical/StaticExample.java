package Pooja;

public class StaticExample {
	// instance variable 
	int empId;
	String empName;
	// static variable 
	static String empOfLocation = "Mumbai" ;
	//constructor
	public StaticExample(int i, String n) {
		this.empId = i;
		this.empName = n;
	}
	// method to display the values
	void display() {
		System.out.println(empId + " " + empName + " " + empOfLocation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample s = new StaticExample(101, "Mamta"); //creating object
		StaticExample s1 = new StaticExample(102, "Ram");
		
		s.display();
		s1.display();

	}

}
