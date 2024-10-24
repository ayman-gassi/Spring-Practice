package com.mundiapolis.tp4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateRendezVous;
    //@ManyToOne private Medecin medecin;
    @ManyToOne private Patient patient;
    //@OneToOne private Consultation consultation;
}
