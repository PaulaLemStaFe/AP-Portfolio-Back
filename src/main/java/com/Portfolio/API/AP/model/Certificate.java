package com.Portfolio.API.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCertificate;
    private String urlImgCertificate;
    private String titleCertificate;
    private String obtainedCertificate;

    public Certificate() {
    }

    public Certificate(Long idCertificate, String urlImgCertificate, String titleCertificate, String obtainedCertificate) {
        this.idCertificate = idCertificate;
        this.urlImgCertificate = urlImgCertificate;
        this.titleCertificate = titleCertificate;
        this.obtainedCertificate = obtainedCertificate;
    }

    public Certificate(String urlImgCertificate, String titleCertificate, String obtainedCertificate) {
        this.urlImgCertificate = urlImgCertificate;
        this.titleCertificate = titleCertificate;
        this.obtainedCertificate = obtainedCertificate;
    }

    public Long getIdCertificate() {
        return idCertificate;
    }

    public void setIdCertificate(Long idCertificate) {
        this.idCertificate = idCertificate;
    }

    public String getUrlImgCertificate() {
        return urlImgCertificate;
    }

    public void setUrlImgCertificate(String urlImgCertificate) {
        this.urlImgCertificate = urlImgCertificate;
    }

    public String getTitleCertificate() {
        return titleCertificate;
    }

    public void setTitleCertificate(String titleCertificate) {
        this.titleCertificate = titleCertificate;
    }

    public String getObtainedCertificate() {
        return obtainedCertificate;
    }

    public void setObtainedCertificate(String obtainedCertificate) {
        this.obtainedCertificate = obtainedCertificate;
    }
    
}
