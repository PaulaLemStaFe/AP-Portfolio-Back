package com.Portfolio.API.AP.service;

import com.Portfolio.API.AP.model.Project;
import com.Portfolio.API.AP.repository.ProjectRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService {
    
    private final ProjectRepository projectRepo;
    
    @Autowired
    public ProjectService(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }
    
    public Project addProject(Project project) {
        return projectRepo.save(project);
    }
    
    public List<Project> findProjects(){
        return projectRepo.findAll();
    }
    
    public Optional<Project> getIdProject(Long idProject) {
        return projectRepo.findById(idProject);
    }
    
    public Project editProject(Project project){
        return projectRepo.save(project);
    }
    
    public void deleteProject(Long idProject){
        projectRepo.deleteById(idProject);
    }
    
}
