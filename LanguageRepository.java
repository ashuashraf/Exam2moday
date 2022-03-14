package com.org.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.org.employee.controller.Language;

public interface LanguageRepository extends CrudRepository<Language, String>{
	public List<Language>  findByEmployeeId(String employeeId);

}
