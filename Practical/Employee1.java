package Pooja;

 class Employee1 {
	 int emp_id;
	 String emp_name;
	 double emp_sal;
	 long emp_ph;
	 
	 void show() { // default method with no parameter
		 System.out.println("-------Employee details are : ------");
		 
	 }
	 void display(int i, String n , double s, long p) {  // method with parameter
		 emp_id = i;
		 emp_name = n;
		 emp_sal = s;
		 emp_ph = p;
		 System.out.println(emp_id + " " +emp_name + " " + emp_sal + " " + emp_ph);
		 
	 		 
	  
	 }	 
	 
	 public class MethodExample{
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e = new Employee1();
Employee1 e1 = new Employee1();
Employee1 e2 = new Employee1();
e.show();
e.display(101, "Nakul", 23000.45, 900667788); // invoke display
e.display(102, "Mamta", 12000.3, 976443324);
e.display(103, "Gungun", 18000.25,789035322);

	}
	
	 }
	 
 


	


