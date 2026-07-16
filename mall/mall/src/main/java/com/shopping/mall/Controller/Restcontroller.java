package com.shopping.mall.Controller;

import com.shopping.mall.Entity.User;
import com.shopping.mall.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")   // <-- Add this
public class Restcontroller {

    @Autowired
    private UserService service;

    // Add User
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    // Update User
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    // Delete User
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        service.removeUser(id);
        return "User Deleted Successfully";
    }

    // Show All Users
    @GetMapping("/all")
    public List<User> showUsers() {
        return service.showUsers();
    }
}