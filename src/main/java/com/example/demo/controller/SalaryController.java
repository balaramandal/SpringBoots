package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Salary;
import com.example.demo.service.SalaryService;

@RestController
@RequestMapping("/salary")
public class SalaryController {
	
	@Autowired SalaryService salaryService;
	
	@RequestMapping("/save")
	public String save(@RequestBody Salary salary) {
		salaryService.generateSalary(salary);
		return "success";
	}
	
	@RequestMapping("/getAll")
	public @ResponseBody List<Salary> getAllSalaryInfo(){
		return salaryService.getAllSalaryInfo();
	}
}
