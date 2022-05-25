package com.Portfolio.API.AP.service;

import com.Portfolio.API.AP.model.Experience;
import com.Portfolio.API.AP.repository.ExperienceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService {
    
    private final ExperienceRepository experienceRepo;
    
    @Autowired
    public ExperienceService(ExperienceRepository experienceRepo) {
        this.experienceRepo = experienceRepo;
    }
    
    public Experience addExperience(Experience experience) {
        return experienceRepo.save(experience);
    }
    
    public List<Experience> findExperiences(){
        return experienceRepo.findAll();
    }
    
    public Optional<Experience> getIdExperience(Long idExperience) {
        return experienceRepo.findById(idExperience);
    }
    
    public Experience editExperience(Experience experience){
        return experienceRepo.save(experience);
    }
    
    public void deleteExperience(Long idExperience){
        experienceRepo.deleteById(idExperience);
    }
    
}
