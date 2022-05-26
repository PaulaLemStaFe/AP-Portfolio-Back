package com.Portfolio.API.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperience;
    private String EnterpriseExperience;
    private String DateExperience;
    private String DescriptionExperience;

    public Experience() {
    }

    public Experience(Long idExperience, String EnterpriseExperience, String DateExperience, String DescriptionExperience) {
        this.idExperience = idExperience;
        this.EnterpriseExperience = EnterpriseExperience;
        this.DateExperience = DateExperience;
        this.DescriptionExperience = DescriptionExperience;
    }

    public Experience(String EnterpriseExperience, String DateExperience, String DescriptionExperience) {
        this.EnterpriseExperience = EnterpriseExperience;
        this.DateExperience = DateExperience;
        this.DescriptionExperience = DescriptionExperience;
    }
    
    public Long getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(Long idExperience) {
        this.idExperience = idExperience;
    }

    public String getEnterpriseExperience() {
        return EnterpriseExperience;
    }

    public void setEnterpriseExperience(String EnterpriseExperience) {
        this.EnterpriseExperience = EnterpriseExperience;
    }

    public String getDateExperience() {
        return DateExperience;
    }

    public void setDateExperience(String DateExperience) {
        this.DateExperience = DateExperience;
    }

    public String getDescriptionExperience() {
        return DescriptionExperience;
    }

    public void setDescriptionExperience(String DescriptionExperience) {
        this.DescriptionExperience = DescriptionExperience;
    }
    
}
