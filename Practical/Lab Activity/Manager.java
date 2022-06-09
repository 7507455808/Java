package Lab;

public class Manager extends Employee {
	
	public Manager(long Id, String Name, String Address, long phone, double salary) {
		super(Id, Name, Address, phone);
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
	}
	


