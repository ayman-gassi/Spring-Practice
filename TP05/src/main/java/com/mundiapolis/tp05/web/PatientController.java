package com.mundiapolis.tp05.web;

import com.mundiapolis.tp05.entities.Patient;
import com.mundiapolis.tp05.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping
    public String getAllPatients(Model model,
                                 @RequestParam(value = "page",defaultValue = "0") int page ,
                                 @RequestParam(value = "size",defaultValue = "5") int size ,
                                 @RequestParam(value = "word",defaultValue = "") String word ) {
        Page<Patient> pagePatients =  patientService.getAllPatients(word , page,size);
        model.addAttribute("allPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("word",word);
        return "patients";
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patientDetails) {
        Optional<Patient> patient = patientService.getPatientById(id);
        if (patient.isPresent()) {
            Patient existingPatient = patient.get();
            existingPatient.setNom(patientDetails.getNom());
            existingPatient.setEmail(patientDetails.getEmail());
            return patientService.savePatient(existingPatient);
        } else {
            throw new RuntimeException("Patient not found");
        }
    }
    @GetMapping("/delete")
    public String deletePatient(Long id , String word , int page) {
        patientService.deletePatient(id);
        return "redirect:/patients?page="+page+"&word="+word;
    }
}
