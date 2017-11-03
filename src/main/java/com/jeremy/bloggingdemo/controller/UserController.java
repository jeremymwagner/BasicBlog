package com.jeremy.bloggingdemo.controller;

import com.jeremy.bloggingdemo.entity.User;
import com.jeremy.bloggingdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;


/**
 * Created by jeremy on 11/3/17.
 */
@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User retrieveUser(@PathVariable(name = "id") Integer id){
        return userService.findUser(id);
    }

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> retrieveAllUsers(){
        return userService.findAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User createUser(@RequestBody User u){
        return userService.createUser(u);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User updateUser(@RequestBody User u){
        return userService.updateUser(u);
    }

    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User deleteUser(@RequestBody User u){
        return userService.deleteUser(u);
    }

}
