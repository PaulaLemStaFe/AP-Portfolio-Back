package com.Portfolio.API.AP.controller;

import com.Portfolio.API.AP.dto.ComputerSkillDto;
import com.Portfolio.API.AP.model.ComputerSkill;
import com.Portfolio.API.AP.service.ComputerSkillService;
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
@RequestMapping("/computerSkill")
@CrossOrigin(origins = "http://localhost:4200")
public class ComputerSkillController {
    
    private final ComputerSkillService computerSkillService;
    
    @Autowired
    public ComputerSkillController(ComputerSkillService computerSkillService){
        this.computerSkillService = computerSkillService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<ComputerSkill>> getComputerSkills() {
        List<ComputerSkill> computerSkills = computerSkillService.findComputerSkills();
        return new ResponseEntity(computerSkills, HttpStatus.OK);
    }
    
    @GetMapping("/getbyid/{idComputerSkill}")
    public ResponseEntity<ComputerSkill> getComputerSkillById(@PathVariable("idComputerSkill") Long idComputerSkill) {
        ComputerSkill computerSkill = computerSkillService.getIdComputerSkill(idComputerSkill).orElse(null);
        return new ResponseEntity(computerSkill, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createComputerSkill(@RequestBody ComputerSkill computerSkillDto){
        ComputerSkill computerSkill = new ComputerSkill (computerSkillDto.getTitleComputerSkill(), computerSkillDto.getUrlImgComputerSkill());
        computerSkillService.addComputerSkill(computerSkill);
        return new ResponseEntity(computerSkill, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<ComputerSkill> editComputerSkill(@RequestBody ComputerSkill computerSkill) {
        
        ComputerSkill editComputerSkill = computerSkillService.editComputerSkill(computerSkill);
        return new ResponseEntity<>(editComputerSkill, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idComputerSkill}")
    public ResponseEntity<?> deleteComputerSkill(@PathVariable("idComputerSkill") Long idComputerSkill){
        computerSkillService.deleteComputerSkill(idComputerSkill);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
