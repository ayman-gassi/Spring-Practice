package com.mundiapolis.tp4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "patient" , fetch= FetchType.LAZY)
    private Collection<RendezVous> rendezVous;
}