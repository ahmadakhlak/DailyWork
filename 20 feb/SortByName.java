package ahmad;

import java.util.Comparator;

public class SortByName implements Comparator<EmployeeDAOimpl> {
	@Override
	public int compare(EmployeeDAOimpl emp1,EmployeeDAOimpl emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}

}
