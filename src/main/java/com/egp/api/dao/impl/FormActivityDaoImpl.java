/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao.impl;

import com.egp.api.dao.FormActivityDAO;
import com.egp.api.model.FormActivity;
import com.mongodb.BasicDBObjectBuilder;
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
public class FormActivityDaoImpl implements FormActivityDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<FormActivity> listAll() {
        return mongoTemplate.findAll(FormActivity.class);
    }

    @Override
    public List<FormActivity> listAll(String userCode, Date dateFrom, Date dateTo) {
        Query query = new Query();
//        query.addCriteria(Criteria.where("createDate").gte(dateFrom));
//        query.addCriteria(Criteria.where("createDate").lte(dateTo));
        query.addCriteria(Criteria.where("userCreateCode").is(userCode).and("createDate").gte(dateFrom).and("createDate").lte(dateTo));

        return mongoTemplate.find(query, FormActivity.class);
    }

    @Override
    public FormActivity addAct(FormActivity formActivity) {
        mongoTemplate.save(formActivity);
        return formActivity;
    }

}
