package com.employee.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.web.entity.Employee;
import com.employee.web.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/home")
	public String getHome(Model model) {
		
		model.addAttribute("username","Peter");
		
		return "home";
	}
	
	@GetMapping("/empdetails")
	public String getEmployees(Model model) {
		
		List<Employee> empList = empService.getAllEmployees();
		
		model.addAttribute("empList",empList);
		
		return "all-emp";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		
		return "add-emp-form";
	}
	
	@PostMapping("/addemp")
	public String addEmp(Employee employee,Model model) {
		
		System.out.println(employee);
		empService.saveEmployee(employee);
		
		model.addAttribute("message","Data added Successfully");
		
		return "add-emp-form";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable("id") Integer id, Model model) {
		
		String message = empService.deleteEmployeeById(id);
		
		model.addAttribute("message",message);
		
		return "redirect:empdetails";
	}
}