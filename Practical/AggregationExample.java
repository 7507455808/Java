package Pooja;

//Employee has a department

class Department{
	// declare variables
	int deptId;
	String deptName;
	String deptHod;
	
	//parameter constructor
	
	public Department(int deptId, String deptName, String deptHod) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptHod = deptHod;
	}
	
}
class Employee2{
	// declare variables
	int id;
	String empName;
	String empAddr;
	Department dept; // Department is class, Employee has entity reference dept
	
	// parameter constructor
public Employee2(int id, String empName, String empAddr, Department dept) {
	this.id = id;
	this.empName = empName;
	this.empAddr = empAddr;
	this.dept = dept;
}
 
// non-static method to display values
void display() {
	System.out.println(id + " " + empName + " " + empAddr ); //employee variable
	System.out.println(dept.deptId + " " + dept.deptName + " " + dept.deptHod); // department variable
}

}

public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Department d = new Department(1,"IT","XYZ"); // creating object of parameter
Department d1 = new Department(2,"Civil","ABC");

Employee2 e = new Employee2(101, "mamta", "mumbai", d); // creating object of employee
Employee2 e1 = new Employee2(102, "ram", "pune", d1);

e.display(); // calling method to print values
e1.display();





	}

}
