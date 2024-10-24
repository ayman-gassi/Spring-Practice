package com.mundiapolis.tp4.repository;

import com.mundiapolis.tp4.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}


