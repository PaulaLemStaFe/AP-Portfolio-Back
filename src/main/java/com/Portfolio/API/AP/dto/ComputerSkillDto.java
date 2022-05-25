package com.Portfolio.API.AP.dto;

public class ComputerSkillDto {
    
    private String titleComputerSkill;
    private String urlImgComputerSkill;

    public ComputerSkillDto() {
    }

    public ComputerSkillDto(String titleComputerSkill, String urlImgComputerSkill) {
        this.titleComputerSkill = titleComputerSkill;
        this.urlImgComputerSkill = urlImgComputerSkill;
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
