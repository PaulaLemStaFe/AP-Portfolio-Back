package com.Portfolio.API.AP.repository;

import com.Portfolio.API.AP.model.ComputerSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerSkillRepository extends JpaRepository<ComputerSkill, Long> {
    
}
