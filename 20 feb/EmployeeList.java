package ahmad;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<EmployeeDAOimpl> list=new ArrayList<>();
		addEmployees(list);
		//Collections.sort(list,new SortByAge());
		//Collections.sort(list,new SortByName());
		//Collections.sort(list,new SortByAddress());
		Collections.sort(list,new SortByDesignation());
		for(EmployeeDAOimpl emp:list){
			System.out.println(emp);
			
		}
		
	}
	private static void addEmployees(ArrayList<EmployeeDAOimpl> list){
		EmployeeDAOimpl emp1=new EmployeeDAOimpl(424,"vijay","pune","Developer",20,41000.00,7581823510L);
		EmployeeDAOimpl emp2=new EmployeeDAOimpl(43,"yogesh","mumbai","Tester",11,41000.00,75813510);
		EmployeeDAOimpl emp3=new EmployeeDAOimpl(494,"nikhil","Bhopal","softwaree engg",30,4100.00,75823510);
		EmployeeDAOimpl emp4=new EmployeeDAOimpl(4535,"mayuresh","Indore","Networking",25,41000.00,75823510);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
	}
}

