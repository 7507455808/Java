package CollectionEg;

import java.util.Comparator;

public class DeptidCompare implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2) {
		
		if(o1.deptId == o2.deptId)
			return 0;
		else if (o1.deptId > o2.deptId)
			return 1;
		else
			return -1;


	}

}
