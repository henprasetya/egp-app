/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.repo;

import com.egp.api.model.FormActivity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KFC SOLUTION
 */
@Repository
public interface FormActivityRepository extends MongoRepository<FormActivity, String>{
    
}
