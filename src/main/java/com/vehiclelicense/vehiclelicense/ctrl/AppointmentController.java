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

import com.vehiclelicense.vehiclelicense.entity.Appointment;
import com.vehiclelicense.vehiclelicense.service.AppointmentService;


@RestController
public class AppointmentController {
	@Autowired
    AppointmentService appointmentService;
    @PostMapping("/appointments")
    public Appointment createAppointment(@Valid @RequestBody Appointment appointment) {
    	return appointmentService.createAppointment(appointment);
    }
    @GetMapping("/appointments")
    public List<Appointment> getAppointments() {
    	return appointmentService.getAppointments();
    }
    @DeleteMapping("/appointments")
    public boolean deleteAllAppointment() {
		return appointmentService.deleteAllAppointment();
    }
    @PutMapping("/appointments/{appointmentId}")
    public Appointment updateAppointment(@PathVariable int appointmentId, @RequestBody Appointment obj) {
    	return appointmentService.updateAppointment(appointmentId, obj);
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
