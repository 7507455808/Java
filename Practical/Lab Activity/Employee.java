package Lab;

public class Employee {
	// instance variable
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80; // default value
	double hra = 1000.50; // default value
	
	// parameterized constructor
			
	public Employee(long Id, String Name, String Address, long Phone) {
		super();
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
	}
	// calculate basic salary
	
	public void calculateSalary() {
		double salary; // local variable
		salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("Employee salary is : " +salary);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
