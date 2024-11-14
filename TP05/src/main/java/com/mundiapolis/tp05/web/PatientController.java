package com.mundiapolis.tp05.web;

import com.mundiapolis.tp05.entities.Patient;
import com.mundiapolis.tp05.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
                                 @RequestParam(value = "size",defaultValue = "7") int size ,
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

    @GetMapping("/form")
    public String formPatient(Model model){
        model.addAttribute("patient", new Patient());
        return "formPatient";

    }
    @PostMapping("/savePatient")
    public String savePatient(Model model, @Valid Patient p, BindingResult
            bindingResult){
        if(bindingResult.hasErrors()){
            return "formPatient";
        }

        patientService.savePatient(p);
        model.addAttribute("patient", p);
        return "formPatientComfirmation";

    }
    @GetMapping("/delete")
    public String deletePatient(Long id , String word , int page) {
        patientService.deletePatient(id);
        return "redirect:/patients?page="+page+"&word="+word;
    }
    @GetMapping("/edit")
    public String edit(Model model,Long id){
            Patient patient = patientService.getPatientById(id).orElse(null);
            if (patient == null){
                throw new RuntimeException("Patient Doesn't Exist");
            }
            else {
                model.addAttribute("patient",patient);
                return "formEditPatient";
            }
    }
    @PostMapping("/editPatient")
    public String editPatient(Model model, @Valid Patient p, BindingResult
            bindingResult){
        if(bindingResult.hasErrors()){
            return "formEditPatient";
        }
        patientService.savePatient(p);
        return "redirect:/patients";

    }
}

