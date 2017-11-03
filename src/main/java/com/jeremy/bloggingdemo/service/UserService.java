package com.jeremy.bloggingdemo.service;

import com.jeremy.bloggingdemo.entity.User;
import com.jeremy.bloggingdemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jeremy on 11/3/17.
 */
@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User createUser(User u){
        return userRepo.create(u);
    }

    public User findUser(int id){
        return userRepo.findOne(id);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User u){
        return userRepo.update(u);
    }

    public User deleteUser(User u){
        return userRepo.delete(u.getId());
    }
}
