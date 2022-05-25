package com.Portfolio.API.AP.controller;

import com.Portfolio.API.AP.dto.ProjectDto;
import com.Portfolio.API.AP.model.Project;
import com.Portfolio.API.AP.service.ProjectService;
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
@RequestMapping("/project")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {
    
    private final ProjectService projectService;
    
    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Project>> getProjects() {
        List<Project> projects = projectService.findProjects();
        return new ResponseEntity(projects, HttpStatus.OK);
    }
    
    @GetMapping("/getbyid/{idProject}")
    public ResponseEntity<Project> getProjectById(@PathVariable("idProject") Long idProject) {
        Project project = projectService.getIdProject(idProject).orElse(null);
        return new ResponseEntity(project, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createProject(@RequestBody Project projectDto){
        Project project = new Project (projectDto.getUrlImgProject(), projectDto.getTitleProject(), projectDto.getTextProject(), projectDto.getBtn01UrlProject(), projectDto.getBtn02UrlProject());
        projectService.addProject(project);
        return new ResponseEntity(project, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<Project> editProject(@RequestBody Project project) {
        
        Project editProject = projectService.editProject(project);
        return new ResponseEntity<>(editProject, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idProject}")
    public ResponseEntity<?> deleteProject(@PathVariable("idProject") Long idProject){
        projectService.deleteProject(idProject);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
