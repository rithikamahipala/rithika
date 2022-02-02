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

import com.vehiclelicense.vehiclelicense.entity.DrivingLicense;
import com.vehiclelicense.vehiclelicense.service.DrivingLicenseService;

@RestController
public class DrivingLicenseController {
	@Autowired
	DrivingLicenseService drivingLicenseService;
	@PostMapping("/drivingLicenses")
	public DrivingLicense createDrivingLicense(@Valid @RequestBody DrivingLicense drivingLicense) {
    	return drivingLicenseService.createDrivingLicense(drivingLicense);
    }
    @GetMapping("/drivingLicenses")
    public List<DrivingLicense> getDrivingLicenses() {
    	return drivingLicenseService.getDrivingLicenses();
    }
    @DeleteMapping("/drivingLicenses")
    public boolean deleteAllDrivingLicense() {
		return drivingLicenseService.deleteAllDrivingLicense();
    }
    @PutMapping("/drivingLicenses/{drivingLicenseId}")
    public DrivingLicense updateDrivingLicense(@PathVariable int drivingLicenseId, @RequestBody DrivingLicense obj) {
    	return drivingLicenseService.updateDrivingLicense(drivingLicenseId, obj);
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
