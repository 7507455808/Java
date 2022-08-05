package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortingExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(1, "mamta", 9876543,101));
		al.add(new Employee(2, "ram", 9876543,102));
		al.add(new Employee(3, "pallavi", 9876543,103));
		al.add(new Employee(4, "pooja", 9876543,104));
		al.add(new Employee(5, "madhavi", 9876543,105));
		al.add(new Employee(6, "shivshakti", 9876543,106));
		al.add(new Employee(7, "priya", 9876543,107));
		
		System.out.println("------------By Name----------");
		Collections.sort(al, new EmpNameCompare());
		for(Employee e : al) {
			System.out.println(e.empId + " " +e.empName+ " " +e.empPhone+ " " +e.deptId);
		}
		
		System.out.println();
		System.out.println("------------By DeptId----------");
		Collections.sort(al, new EmpNameCompare());
		for(Employee e : al) {
			System.out.println(e.empId + " " +e.empName+ " " +e.empPhone+ " " +e.deptId);
		}
		

	}

}
