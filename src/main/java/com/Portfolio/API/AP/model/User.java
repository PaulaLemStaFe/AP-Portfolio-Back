package com.Portfolio.API.AP.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String nameUser;
    private String titleUser;
    private String urlImgprofileUser;
    private String text01User;
    private String text02User;
    private String text03User;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCertificate")
    private List<Certificate> certificateList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idComputerSkill")
    private List<ComputerSkill> computerskillList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperience")
    private List<Experience> experienceList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProject")
    private List<Project> projectList;

    public User() {
    }

    public User(Long idUser, String nameUser, String titleUser, String urlImgprofileUser, String text01User, String text02User, String text03User) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.titleUser = titleUser;
        this.urlImgprofileUser = urlImgprofileUser;
        this.text01User = text01User;
        this.text02User = text02User;
        this.text03User = text03User;
    }

    public User(String nameUser, String titleUser, String urlImgprofileUser, String text01User, String text02User, String text03User) {
        this.nameUser = nameUser;
        this.titleUser = titleUser;
        this.urlImgprofileUser = urlImgprofileUser;
        this.text01User = text01User;
        this.text02User = text02User;
        this.text03User = text03User;
    }
    
    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getTitleUser() {
        return titleUser;
    }

    public void setTitleUser(String titleUser) {
        this.titleUser = titleUser;
    }

    public String getUrlImgprofileUser() {
        return urlImgprofileUser;
    }

    public void setUrlImgprofileUser(String urlImgprofileUser) {
        this.urlImgprofileUser = urlImgprofileUser;
    }

    public String getText01User() {
        return text01User;
    }

    public void setText01User(String text01User) {
        this.text01User = text01User;
    }

    public String getText02User() {
        return text02User;
    }

    public void setText02User(String text02User) {
        this.text02User = text02User;
    }

    public String getText03User() {
        return text03User;
    }

    public void setText03User(String text03User) {
        this.text03User = text03User;
    }
    
}
