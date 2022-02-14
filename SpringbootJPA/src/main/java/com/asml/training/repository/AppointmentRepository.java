package com.asml.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asml.training.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
