package com.demo.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class EmployeeController {
	
	
	 public static void main(String[] args) {
		    SpringApplication.run(EmployeeController.class, args);
		    }


	@Autowired 
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id)
	{
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employee/{id}")
	public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee)
	{
		employeeService.updateEmployee(id, employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE ,value="/employee/{id}")
	public void removeEmployee(@PathVariable Integer id)
	{
		employeeService.removeEmployee(id);
	}
}
