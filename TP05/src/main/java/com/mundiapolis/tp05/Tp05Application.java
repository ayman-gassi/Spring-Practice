package com.mundiapolis.tp05;

import com.mundiapolis.tp05.entities.Patient;
import com.mundiapolis.tp05.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp05Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp05Application.class, args);
    }

   /*@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Pablo",new Date(),"Pablo@gmail.com",true,50));
            patientRepository.save(new Patient(null,"Hamid",new Date(),"Hamid@gmail.com",false,20));
            patientRepository.save(new Patient(null,"Young",new Date(),"Young@gmail.com",true,10));
        };
    }*/

}
