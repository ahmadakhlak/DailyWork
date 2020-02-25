package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAO empObj = new EmployeeDAOImpl();
		// List<Employee> list=empObj.getAllEmployees();
		// list.forEach(System.out::println);
		
		//Employee employee = new Employee(111, "shreyas", "bhopal", 23, 135444);
		//empObj.saveEmployee(employee);
		
		Employee emp=empObj.getEmployeeById(3);
		System.out.println(emp);

	}

}
