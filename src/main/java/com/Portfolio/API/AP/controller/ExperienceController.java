package com.Portfolio.API.AP.controller;

import com.Portfolio.API.AP.dto.ExperienceDto;
import com.Portfolio.API.AP.model.Experience;
import com.Portfolio.API.AP.service.ExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {
    
    private final ExperienceService experienceService;
    
    @Autowired
    public ExperienceController(ExperienceService experienceService){
        this.experienceService = experienceService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getExperiences() {
        List<Experience> experiences = experienceService.findExperiences();
        return new ResponseEntity(experiences, HttpStatus.OK);
    }
    
    @GetMapping("/getbyid/{idExperience}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable("idExperience") Long idExperience) {
        Experience experience = experienceService.getIdExperience(idExperience).orElse(null);
        return new ResponseEntity(experience, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createExperience(@RequestBody Experience experienceDto){
        Experience experience = new Experience (experienceDto.getEnterpriseExperience(), experienceDto.getDateExperience(), experienceDto.getDescriptionExperience());
        experienceService.addExperience(experience);
        return new ResponseEntity(experience, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<Experience> editExperience(@RequestBody Experience experience) {
        
        Experience editExperience = experienceService.editExperience(experience);
        return new ResponseEntity<>(editExperience, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idExperience}")
    public ResponseEntity<?> deleteExperience(@PathVariable("idExperience") Long idExperience){
        experienceService.deleteExperience(idExperience);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
