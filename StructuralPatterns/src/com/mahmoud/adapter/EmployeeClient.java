package com.mahmoud.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		employees.add(employeeFromDB);
		
		// will not work! This is where the adapter comes into play!
		// Employee employeeFromLdap = new EmployeeLdap("7oda", "Mahmoud", "Abdelrahman", "mahmoud@abdelrahman.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("7oda", "Mahmoud", "Abdelrahman", "mahmoud@abdelrahman.com");
		employees.add(new EmployeeLdapAdapter(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("123,Mahmoud,Abdelrahman,mahmoud@abdelrahman.com");
		
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
	}
}
