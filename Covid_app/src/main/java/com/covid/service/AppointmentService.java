package com.covid.service;

import java.util.List;

import com.covid.exception.AppointmentExcepation;
import com.covid.exception.AppointmentNotFoundExecpation;
import com.covid.model.Appointment;



public interface AppointmentService {

	public List<Appointment> getAllAppointment(String key)throws AppointmentExcepation;

	public Appointment getAppointmentByBookingId(Long bookingId,String key)throws AppointmentNotFoundExecpation;

	public Appointment addAppointment(Appointment app, Integer memId,String key)throws AppointmentExcepation;

	public Appointment updateAppointment(Appointment app,String key)throws AppointmentExcepation;

	public boolean deleteAppointment(Long bookingId,String key)throws AppointmentExcepation;

}
