package com.kk;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository repo;

	public Employee test() {
		Optional<Employee> chefOpt = repo.findById(1L);
		if(chefOpt.isPresent()) {
			return chefOpt.get();
		}
		return new Employee();
	}
}
