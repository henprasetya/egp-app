/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api;

import com.egp.api.dao.FormActivityDAO;
import com.egp.api.model.FormActivity;
import com.egp.api.repo.FormActivityRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KFC SOLUTION
 */
@RestController
@RequestMapping(value = "/act")
public class FormActivityController {
    
    private final FormActivityRepository repository;
    private final FormActivityDAO dao;
    
    public FormActivityController(FormActivityRepository repository, FormActivityDAO dao){
        this.repository = repository;
        this.dao = dao;
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public FormActivity add(@RequestBody FormActivity formActivity){
        return repository.save(formActivity);
    }
    
    @RequestMapping(value = "/list-all", method = RequestMethod.GET)
    public List<FormActivity> listAll(){
        return repository.findAll();
    }
    
    @RequestMapping(value = "/list-all-user", method = RequestMethod.GET)
    public List<FormActivity> listAll(String userCode, String dateFrom, String dateTo) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return dao.listAll(userCode, sdf.parse(dateFrom), sdf.parse(dateTo));
    }
}
