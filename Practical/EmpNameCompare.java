package CollectionEg;

import java.util.Comparator;

public class EmpNameCompare implements Comparator<Employee> {
	
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
		

	}

}
