package com.bratkov.project.services;

import com.bratkov.project.models.User;
import com.bratkov.project.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {

        return userRepo.findAll();

    }

    public User createUser(User user) {
        return userRepo.save(user);
    }


}
