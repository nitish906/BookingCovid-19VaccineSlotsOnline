package com.covid.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SigninException.class)
	public ResponseEntity<ErrorDetails> signinExceptionHandler(SigninException e, WebRequest req) {

		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));

		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);

	}
	
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<ErrorDetails> loginExceptionHandler(LoginException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(LogoutException.class)
	public ResponseEntity<ErrorDetails> logoutExceptionHandler(LogoutException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(AppointmentExcepation.class)
	public ResponseEntity<ErrorDetails> appointmentExceptionHandler(AppointmentExcepation e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(AppointmentNotFoundExecpation.class)
	public ResponseEntity<ErrorDetails> appointmentNotFoundExceptionHandler(AppointmentNotFoundExecpation e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(IdCardNotFoundException.class)
	public ResponseEntity<ErrorDetails> idCardNotFoundExceptionHandler(IdCardNotFoundException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(MemberNotFoundException.class)
	public ResponseEntity<ErrorDetails> memeberNotFoundExceptionHandler(MemberNotFoundException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	
		
	}
	
	
	@ExceptionHandler(VaccineCenterException.class)
	public ResponseEntity<ErrorDetails> vaccineCenterExceptionHandler(VaccineCenterException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(VaccineCenterNotFoundException.class)
	public ResponseEntity<ErrorDetails> vaccineCenterNotFoundExceptionHandler(VaccineCenterNotFoundException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(VaccineInventoryNotFoundException.class)
	public ResponseEntity<ErrorDetails> vaccineInventoryNotFoundExceptionHandler(VaccineInventoryNotFoundException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(VaccineNotFoundException.class)
	public ResponseEntity<ErrorDetails> vaccineNotFoundExceptionHandler(VaccineNotFoundException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(VaccineRegistrationException.class)
	public ResponseEntity<ErrorDetails> vaccineREgistrationExceptionHandler(VaccineRegistrationException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(VaccineRepositoryException.class)
	public ResponseEntity<ErrorDetails> vaccineRepositoryExceptionHandler(VaccineRepositoryException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(IdCardException.class)
	public ResponseEntity<ErrorDetails> idCardExceptionHandler(IdCardException e, WebRequest req) {
		
		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> ExceptionHandler(Exception e, WebRequest req) {

		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), e.getMessage(), req.getDescription(false));

		return new ResponseEntity<ErrorDetails>(err,HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
