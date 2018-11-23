/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api;

import com.egp.api.dao.UserDAO;
import com.egp.api.model.User;
import com.egp.api.repo.UserRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KFC SOLUTION
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    private final UserRepository userRepository;
    
    private final UserDAO userDAO;

    public UserController(UserRepository userRepository, UserDAO userDAO) {
        this.userRepository = userRepository;
        this.userDAO = userDAO;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User addNewUsers(@RequestBody User user) {
        return userRepository.save(user);
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User user) {
        return userDAO.login(user);
    }
}
