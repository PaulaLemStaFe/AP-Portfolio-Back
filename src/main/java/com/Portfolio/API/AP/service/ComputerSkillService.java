package com.Portfolio.API.AP.service;

import com.Portfolio.API.AP.model.ComputerSkill;
import com.Portfolio.API.AP.repository.ComputerSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ComputerSkillService {
    
    private final ComputerSkillRepository computerSkillRepo;
    
    @Autowired
    public ComputerSkillService(ComputerSkillRepository computerSkillRepo) {
        this.computerSkillRepo = computerSkillRepo;
    }
    
    public ComputerSkill addComputerSkill(ComputerSkill computerSkill) {
        return computerSkillRepo.save(computerSkill);
    }
    
    public List<ComputerSkill> findComputerSkills(){
        return computerSkillRepo.findAll();
    }
    
    public Optional<ComputerSkill> getIdComputerSkill(Long idComputerSkill) {
        return computerSkillRepo.findById(idComputerSkill);
    }
    
    public ComputerSkill editComputerSkill(ComputerSkill computerSkill){
        return computerSkillRepo.save(computerSkill);
    }
    
    public void deleteComputerSkill(Long idComputerSkill){
        computerSkillRepo.deleteById(idComputerSkill);
    }
    
}
