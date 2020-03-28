package com.example.demo.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Salary;
import com.example.demo.repository.SalaryRepository;
import com.example.demo.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired SalaryRepository repository;
	@Override
	public void generateSalary(Salary salary) {
		repository.save(salary);
	}
	@Override
	public List<Salary> getAllSalaryInfo() {
		return repository.findAll();
	}

}
