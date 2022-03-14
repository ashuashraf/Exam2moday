package com.org.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.employee.service.LanguageService;

@RestController
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping("/employee/{id}/language")
	public List<Language> getAllLanguageDetails(){
		return languageService.getAllLanguage();
		
	}
	@RequestMapping("/employee/{id}/language/{languageIds}")
	public Language getLanguage(@PathVariable("ids") String id) {
		return languageService.getLanguage(id);
	}
		
		@RequestMapping(method = RequestMethod.POST, value = "/employee/{employeeId}/language")
		public void addLanguage(@RequestBody Language language, @PathVariable String  employeeId) { 
			language.setEmployee(new Employee(employeeId,"",""));
			languageService.addLanguage(language);
		}

	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{employeeId}/language/{languageId}")
    public void updateLanguage(@RequestBody Language language,@PathVariable String employeeId,@PathVariable String languageId) {
		language.setEmployee(new Employee(employeeId,"",""));
	languageService.updateLanguage(languageId,language);
    }
	
	 @RequestMapping(method = RequestMethod.DELETE, value = "/employee/{employeeId}/language/{languageId}")
	    public void deleteLanguage(@PathVariable String languageId) {
		 languageService.deleteLanguage(languageId);
	    }
	
	
}
