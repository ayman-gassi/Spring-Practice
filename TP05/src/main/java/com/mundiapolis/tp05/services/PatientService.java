package com.mundiapolis.tp05.services;

import com.mundiapolis.tp05.entities.Patient;
import com.mundiapolis.tp05.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Page<Patient> getAllPatients(String word , int page, int size) {
        return patientRepository.findByNomContains(word,PageRequest.of(page,size));
    }

    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);

    }
}
