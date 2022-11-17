package com.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covid.model.Appointment;
import com.covid.model.Member;
import com.covid.model.VaccinationCenter;
import com.covid.model.Vaccine;
import com.covid.model.VaccineRegistration;
import com.covid.service.AppointmentService;
import com.covid.service.MemberService;
import com.covid.service.VaccinationCenterService;
import com.covid.service.VaccineRegistrationService;
import com.covid.service.VaccineService;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private MemberService memberService;

	@Autowired
	private VaccineRegistrationService vaccineRegistrationService;

	@Autowired
	private VaccinationCenterService vaccinationCenterService;

	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private VaccineService vaccineService;

	

	@PostMapping("/vaccine_registration/{mobNo}")
	public ResponseEntity<VaccineRegistration> saveVaccineRegistrationHandler(@PathVariable("mobNo") String mobNo,@RequestParam String key) {

		return new ResponseEntity<VaccineRegistration>(vaccineRegistrationService.addVaccineRegistration(mobNo,key),
				HttpStatus.CREATED);

	}

	@GetMapping("/vaccine_registration/{mobNo}")
	public ResponseEntity<VaccineRegistration> getVaccineRegistration(@PathVariable("mobNo") String mobNo,@RequestParam String key) {
		return new ResponseEntity<VaccineRegistration>(vaccineRegistrationService.getVaccineRegistration(mobNo,key),
				HttpStatus.FOUND);
	}

	@PutMapping("/vaccine_registration/{mobNo}")
	public ResponseEntity<VaccineRegistration> updateVaccineRegistration(@PathVariable("mobNo") String mobNo,
			@RequestBody VaccineRegistration reg,@RequestParam String key) {
		return new ResponseEntity<VaccineRegistration>(
				vaccineRegistrationService.updateVaccineRegistration(mobNo, reg.getMobileno(),key), HttpStatus.OK);
	}

	@DeleteMapping("/vaccine_registration/{mobNo}")
	public ResponseEntity<Boolean> deleteVaccineRegistration(@PathVariable("mobNo") String mobNo,@RequestParam String key) {
		return new ResponseEntity<Boolean>(vaccineRegistrationService.deleteVaccineRegistration(mobNo,key), HttpStatus.OK);
	}

	@GetMapping("/members/{mobNo}")
	public ResponseEntity<List<Member>> getAllMembers(@PathVariable("mobNo") String mobNo,@RequestParam String key) {
		return new ResponseEntity<List<Member>>(vaccineRegistrationService.getAllMember(mobNo,key), HttpStatus.FOUND);
	}

	@PostMapping("/member/{mobNo}")
	public ResponseEntity<Member> saveMember(@RequestBody Member member, @PathVariable("mobNo") String mobNo,@RequestParam String key) {
		return new ResponseEntity<>(memberService.addMemberbyMobileNo(member, mobNo,key), HttpStatus.CREATED);
	}

	@GetMapping("/member/{id}")
	public ResponseEntity<Member> getMember(@PathVariable("id") Integer idCardId,@RequestParam String key) {
		return new ResponseEntity<Member>(memberService.getMemberById(idCardId,key), HttpStatus.FOUND);
	}

	@PutMapping("/member")
	public ResponseEntity<Member> updateMember(@RequestBody Member member,@RequestParam String key) {
		return new ResponseEntity<Member>(memberService.updateMember(member, member.getMemberId(),key), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{mid}")
	public ResponseEntity<Boolean> deleteMember(@PathVariable("mid") Integer mid,@RequestParam String key) {
		return new ResponseEntity<Boolean>(memberService.deleteMember(mid,key), HttpStatus.OK);
	}

	@GetMapping("/vaccine")
	public ResponseEntity<List<Vaccine>> getAllVaccines(@RequestParam String key) {
		return new ResponseEntity<List<Vaccine>>(vaccineService.allVaccine(key), HttpStatus.FOUND);
	}

	@GetMapping("/vaccination_centers")
	public ResponseEntity<List<VaccinationCenter>> getVaccineCenters(@RequestParam String key) {
		return new ResponseEntity<List<VaccinationCenter>>(vaccinationCenterService.allVaccineCenters(key), HttpStatus.OK);
	}

	@PostMapping("/appointment/{memId}")
	public ResponseEntity<Appointment> bookAppointment(@PathVariable("memId") Integer memId,
			@RequestBody Appointment appointment,@RequestParam String key) {
		Appointment a = appointmentService.addAppointment(appointment, memId,key);
		return new ResponseEntity<Appointment>(a, HttpStatus.CREATED);
	}

	@GetMapping("/appointment/{id}")
	public ResponseEntity<Appointment> getAppointment(@PathVariable("id") Long bookingId,@RequestParam String key) {
		return new ResponseEntity<Appointment>(appointmentService.getAppointmentByBookingId(bookingId,key),
				HttpStatus.FOUND);
	}

	@PutMapping("/appointment")
	public ResponseEntity<Appointment> updateVaccineAppointment(@RequestBody Appointment app,@RequestParam String key) {
		return new ResponseEntity<Appointment>(appointmentService.updateAppointment(app,key), HttpStatus.OK);
	}

	@DeleteMapping("/appointment/{id}")
	public ResponseEntity<Boolean> deleteVaccineAppointment(@PathVariable("id") Long bookingId,@RequestParam String key) {
		return new ResponseEntity<Boolean>(appointmentService.deleteAppointment(bookingId,key), HttpStatus.OK);
	}

}
