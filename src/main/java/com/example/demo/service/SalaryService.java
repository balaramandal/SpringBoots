package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Salary;

public interface SalaryService {
	public void generateSalary(Salary salary);
	public List<Salary> getAllSalaryInfo();
}
