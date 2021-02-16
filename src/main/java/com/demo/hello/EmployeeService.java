package com.demo.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
		
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees=new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Optional<Employee> getEmployee(Integer id)
	{
		return employeeRepository.findById(id);
	}
	
	public void addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	public void updateEmployee(Integer id, Employee employee) {
		employeeRepository.save(employee);
	}
	public void removeEmployee(Integer Id)
	{
		employeeRepository.deleteById(Id);
	}
}
