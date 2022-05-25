package com.Portfolio.API.AP.service;

import com.Portfolio.API.AP.model.User;
import com.Portfolio.API.AP.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    
    private final UserRepository userRepo;
    
    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }
    
    public User addUser(User user) {
        return userRepo.save(user);
    }
    
    public List<User> findUsers(){
        return userRepo.findAll();
    }
    
    public Optional<User> getIdUser(Long idUser) {
        return userRepo.findById(idUser);
    }
    
    public User editUser(User user){
        return userRepo.save(user);
    }
    
    public void deleteUser(Long idUser){
        userRepo.deleteById(idUser);
    }
    
}
