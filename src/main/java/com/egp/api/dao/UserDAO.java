/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao;

import com.egp.api.model.User;
import java.util.List;

/**
 *
 * @author KFC SOLUTION
 */
public interface UserDAO {

    List<User> getAllUsers();

    User getUserById(String userId);
    
    User login(User user);

    User addNewUser(User user);

    Object getAllUserSettings(String userId);

    String getUserSetting(String userId, String key);

    String addUserSetting(String userId, String key, String value);
}
