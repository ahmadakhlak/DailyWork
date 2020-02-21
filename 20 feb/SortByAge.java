package ahmad;
import java.util.Comparator;


	

	public class SortByAge implements Comparator<EmployeeDAOimpl>{
		
		public int compare(EmployeeDAOimpl emp1,EmployeeDAOimpl emp2) {
			if(emp1.getAge()>emp2.getAge()) {
				return 1;
			}
			else if(emp1.getAge()==emp2.getAge()) {
				return 0;
				
			}
			else {
				return -1;
			}
		}

	}

