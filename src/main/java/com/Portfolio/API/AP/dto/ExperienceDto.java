package com.Portfolio.API.AP.dto;

public class ExperienceDto {
    
    private String EnterpriseExperience;
    private String DateExperience;
    private String DescriptionExperience;

    public ExperienceDto() {
    }

    public ExperienceDto(String EnterpriseExperience, String DateExperience, String DescriptionExperience) {
        this.EnterpriseExperience = EnterpriseExperience;
        this.DateExperience = DateExperience;
        this.DescriptionExperience = DescriptionExperience;
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
