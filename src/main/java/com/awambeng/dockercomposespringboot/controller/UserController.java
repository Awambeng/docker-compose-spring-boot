package com.awambeng.dockercomposespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.awambeng.dockercomposespringboot.repository.UserRepository;
import com.awambeng.dockercomposespringboot.user.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user){
        User existingUser = userRepository.findById(id).get();
        existingUser.setName(user.getName());
        existingUser.setGender(user.getGender());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(existingUser);

    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        try{
            userRepository.findById(id).get();
            userRepository.deleteById(id);
            return "User deleted successfully";
        }catch (Exception e){
            return "User not found";
        }
    }
}
