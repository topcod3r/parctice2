package com.techno.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IssueService;
import com.techno.beans.Employee;

@RestController
public class ViewEmployeeService {

	@Autowired
	IssueService IssueService;
	
	@GetMapping("/getEmployee")
	public List<Employee> viewAllEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>(); 
		Employee e = new Employee();
		e.setId(1);
		e.setEmployeeName("Ramesh");
		e.setAddress("Mumbai");
		employeeList.add(e);
		IssueService.saveIssue(null);
		IssueService.udpdateIssue(null);
		return employeeList;
	}
	
	@PostMapping("/setEmployee")
	public List<Employee> setEmployee(@RequestBody Employee emp) {
		List<Employee> employeeList = new ArrayList<Employee>(); 
		Employee e = new Employee();
		e.setId(1);
		e.setEmployeeName("Ramesh");
		e.setAddress("Mumbai");
		employeeList.add(e);
		return employeeList;
	}
	
}
