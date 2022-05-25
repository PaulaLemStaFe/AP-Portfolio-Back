package com.Portfolio.API.AP.dto;

public class CertificateDto {
    
    private String urlImgCertificate;
    private String titleCertificate;
    private String obtainedCertificate;

    public CertificateDto() {
    }

    public CertificateDto(String urlImgCertificate, String titleCertificate, String obtainedCertificate) {
        this.urlImgCertificate = urlImgCertificate;
        this.titleCertificate = titleCertificate;
        this.obtainedCertificate = obtainedCertificate;
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
