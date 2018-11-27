/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao.impl;

import com.egp.api.dao.FormIncidentDAO;
import com.egp.api.model.FormIncident;
import java.util.Date;
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
public class FormIncidentDaoImpl implements FormIncidentDAO{
    
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<FormIncident> listAll() {
        return mongoTemplate.findAll(FormIncident.class);
    }

    @Override
    public List<FormIncident> listAll(String userCode, Date dateFrom, Date dateTo) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userCreateCode").is(userCode).and("createDate").gte(dateFrom).and("createDate").lte(dateTo));

        return mongoTemplate.find(query, FormIncident.class);
    }

    @Override
    public FormIncident addAct(FormIncident formIncident) {
        mongoTemplate.save(mongoTemplate);
        return formIncident;
    }
    
}
