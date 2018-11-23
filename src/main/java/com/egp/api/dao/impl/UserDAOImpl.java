/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao.impl;

import com.egp.api.dao.UserDAO;
import com.egp.api.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KFC SOLUTION
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User getUserById(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public User addNewUser(User user) {
        mongoTemplate.save(user);
        // Now, user object will contain the ID as well
        return user;
    }

    @Override
    public Object getAllUserSettings(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        User user = mongoTemplate.findOne(query, User.class);
        return user != null ? user.getUserSettings() : "User not found.";
    }

    @Override
    public String getUserSetting(String userId, String key) {
        Query query = new Query();
        query.fields().include("userSettings");
        query.addCriteria(Criteria.where("userId").is(userId).andOperator(Criteria.where("userSettings." + key).exists(true)));
        User user = mongoTemplate.findOne(query, User.class);
        return user != null ? user.getUserSettings().get(key) : "Not found.";
    }

    @Override
    public String addUserSetting(String userId, String key, String value) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        User user = mongoTemplate.findOne(query, User.class);
        if (user != null) {
            user.getUserSettings().put(key, value);
            mongoTemplate.save(user);
            return "Key added.";
        } else {
            return "User not found.";
        }
    }

    @Override
    public User login(User user) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userName").is(user.getUserName()).and("password").is(user.getPassword()).and("company").is(user.getCompany()));
        User usr = mongoTemplate.findOne(query, User.class);
        return usr != null ? usr : new User();
    }

}
