package ahmad;

import java.util.Comparator;

public class SortByDesignation implements Comparator<EmployeeDAOimpl>{
	@Override
	public int compare(EmployeeDAOimpl emp1,EmployeeDAOimpl emp2) {
		return emp1.getDesgination().compareTo(emp2.getDesgination());
	}

}
