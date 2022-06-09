package com.employee.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.web.entity.Employee;
import com.employee.web.entity.User;
import com.employee.web.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	
	
	public Employee saveEmployee(Employee employee) {
		
		Employee savedEmp = empRepo.save(employee);
		
		return savedEmp;
	}
	
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> empList = empRepo.findAll();
		
		return empList;
	}
	
	
	public Employee getEmployeeById(Integer id) {
		
		Optional<Employee> empOpt = empRepo.findById(id);
		
		if(empOpt.isEmpty()) {
			throw new RuntimeException("Employee is not found");
		}
		
		return empOpt.get();
		
	}
	
	public String deleteEmployeeById(Integer id) {
		
		empRepo.deleteById(id);
		
		return "Employee data deleted Successfully";
	}
	
	
}
