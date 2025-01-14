package com.example.myFirstProject.service;


import com.example.myFirstProject.model.User;
import com.example.myFirstProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(int id){
      userRepository.deleteById(id);
    }

    public void update(User user){
       userRepository.update(user);
    }


}