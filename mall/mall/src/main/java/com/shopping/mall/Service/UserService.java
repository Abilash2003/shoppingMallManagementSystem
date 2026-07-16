package com.shopping.mall.Service;

import com.shopping.mall.Entity.User;
import com.shopping.mall.Repository.mallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private mallRepo repo;

    // Add User
    public User addUser(User user) {
        return repo.save(user);
    }

    // Update User
    public User updateUser(Integer id, User user) {

        User existingUser = repo.findById(id).orElse(null);

        if (existingUser != null) {

            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setDestination(user.getDestination());

            return repo.save(existingUser);
        }

        return null;
    }

    // Remove User
    public void removeUser(int id) {
        repo.deleteById(id);
    }

    // Show All Users
    public List<User> showUsers() {
        return repo.findAll();
    }
}
