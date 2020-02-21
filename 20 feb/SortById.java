package ahmad;

import java.util.Comparator;

public class SortById implements Comparator<EmployeeDAOimpl>{
	
	public int compare(EmployeeDAOimpl emp1,EmployeeDAOimpl emp2) {
		if(emp1.getId()>emp2.getId()) {
			return 1;
		}
		else if(emp1.getId()==emp2.getId()) {
			return 0;
			
		}
		else {
			return -1;
		}
	}
} 


