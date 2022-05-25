package com.Portfolio.API.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComputerSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComputerSkill;
    private String titleComputerSkill;
    private String urlImgComputerSkill;

    public ComputerSkill() {
    }

    public ComputerSkill(Long idComputerSkill, String titleComputerSkill, String urlImgComputerSkill) {
        this.idComputerSkill = idComputerSkill;
        this.titleComputerSkill = titleComputerSkill;
        this.urlImgComputerSkill = urlImgComputerSkill;
    }

    public ComputerSkill(String titleComputerSkill, String urlImgComputerSkill) {
        this.titleComputerSkill = titleComputerSkill;
        this.urlImgComputerSkill = urlImgComputerSkill;
    }

    public Long getIdComputerSkill() {
        return idComputerSkill;
    }

    public void setIdComputerSkill(Long idComputerSkill) {
        this.idComputerSkill = idComputerSkill;
    }

    public String getTitleComputerSkill() {
        return titleComputerSkill;
    }

    public void setTitleComputerSkill(String titleComputerSkill) {
        this.titleComputerSkill = titleComputerSkill;
    }

    public String getUrlImgComputerSkill() {
        return urlImgComputerSkill;
    }

    public void setUrlImgComputerSkill(String urlImgComputerSkill) {
        this.urlImgComputerSkill = urlImgComputerSkill;
    }
    
}
