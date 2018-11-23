/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao.impl;

import com.egp.api.dao.ClientDAO;
import com.egp.api.model.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KFC SOLUTION
 */
@Repository
public class ClientDaoImpl implements ClientDAO{
    
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Client> getListClient() {
        return mongoTemplate.findAll(Client.class);
    }

    @Override
    public Client addClient(Client client) {
        mongoTemplate.save(client);
        return client;
    }
    
}
