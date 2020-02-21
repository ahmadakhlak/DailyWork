package ahmad;

import java.util.Comparator;

public class SortByAddress implements Comparator<EmployeeDAOimpl> {
	@Override
	public int compare(EmployeeDAOimpl emp1,EmployeeDAOimpl emp2) {
		return emp1.getAddress().compareTo(emp2.getAddress());
	}

}
