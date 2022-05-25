package com.Portfolio.API.AP.dto;

public class ProjectDto {
    
    private String urlImgProject;
    private String titleProject;
    private String textProject;
    private String btn01UrlProject;
    private String btn02UrlProject;

    public ProjectDto() {
    }

    public ProjectDto(String urlImgProject, String titleProject, String textProject, String btn01UrlProject, String btn02UrlProject) {
        this.urlImgProject = urlImgProject;
        this.titleProject = titleProject;
        this.textProject = textProject;
        this.btn01UrlProject = btn01UrlProject;
        this.btn02UrlProject = btn02UrlProject;
    }

    public String getUrlImgProject() {
        return urlImgProject;
    }

    public void setUrlImgProject(String urlImgProject) {
        this.urlImgProject = urlImgProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getTextProject() {
        return textProject;
    }

    public void setTextProject(String textProject) {
        this.textProject = textProject;
    }

    public String getBtn01UrlProject() {
        return btn01UrlProject;
    }

    public void setBtn01UrlProject(String btn01UrlProject) {
        this.btn01UrlProject = btn01UrlProject;
    }

    public String getBtn02UrlProject() {
        return btn02UrlProject;
    }

    public void setBtn02UrlProject(String btn02UrlProject) {
        this.btn02UrlProject = btn02UrlProject;
    }
    
}
