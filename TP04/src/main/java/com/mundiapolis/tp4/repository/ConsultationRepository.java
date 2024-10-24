package com.mundiapolis.tp4.repository;

import com.mundiapolis.tp4.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
