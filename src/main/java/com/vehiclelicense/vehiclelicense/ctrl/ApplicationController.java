package com.vehiclelicense.vehiclelicense.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclelicense.vehiclelicense.entity.Application;
import com.vehiclelicense.vehiclelicense.service.ApplicationService;

@RestController
public class ApplicationController {
	@Autowired
	ApplicationService applicationService;
    @PostMapping("/applications")
    public Application createApplication(@Valid @RequestBody Application application) {
    	return applicationService.createApplication(application);
    }
    @GetMapping("/applications")
    public List<Application> getApplications() {
    	return applicationService.getApplications();
    }
    @DeleteMapping("/applications")
    public boolean deleteAllApplication() {
		return applicationService.deleteAllApplication();
    }
    @PutMapping("/applications/{applicationId}")
    public Application updateApplication(@PathVariable int applicationId, @RequestBody Application obj) {
    	return applicationService.updateApplication(applicationId, obj);
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
    	Map<String, String> errors = new HashMap<>();
    	ex.getBindingResult().getAllErrors().forEach((error)->{
    		String fieldName = ((FieldError) error).getField();
    		String errorMessage = error.getDefaultMessage();
    		errors.put(fieldName, errorMessage);
    	});
    	return errors;
   }
}
