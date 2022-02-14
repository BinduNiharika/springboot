package com.asml.training.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asml.training.exception.BadResourceException;
import com.asml.training.exception.ResourceAlreadyExistsException;
import com.asml.training.exception.ResourceNotFoundException;
import com.asml.training.model.Appointment;
import com.asml.training.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	public Appointment findById(Integer id) throws ResourceNotFoundException {
		Appointment appointment = appointmentRepository.findById(id).orElse(null);

		if (appointment == null) {
			throw new ResourceNotFoundException("Cannot find client with id " + id);
		}
		return appointment;

	}
	 public Appointment save(Appointment appointment) throws BadResourceException, ResourceAlreadyExistsException{
		 if (appointment.getAppointment_id() != null) {
             if (this.existsById(appointment.getAppointment_id())) {
                 throw new ResourceAlreadyExistsException("Client with id " + appointment.getAppointment_id() +
                         " already exists.");
             }
         }
		return appointment;
		 
	 }
}
