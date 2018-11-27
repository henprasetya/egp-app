/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api;

import com.egp.api.dao.FormIncidentDAO;
import com.egp.api.model.FormIncident;
import com.egp.api.repo.FormIncidentRepository;
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
@RequestMapping(value = "/inc")
public class FormIncidentController {
    
    private final FormIncidentRepository repository;
    private final FormIncidentDAO dao;
    
    public FormIncidentController(FormIncidentRepository repository, FormIncidentDAO dao){
        this.repository = repository;
        this.dao = dao;
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public FormIncident add(@RequestBody FormIncident formActivity){
        return repository.save(formActivity);
    }
    
    @RequestMapping(value = "/list-all", method = RequestMethod.GET)
    public List<FormIncident> listAll(){
        return repository.findAll();
    }
    
    @RequestMapping(value = "/list-all-user", method = RequestMethod.GET)
    public List<FormIncident> listAll(String userCode, String dateFrom, String dateTo) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return dao.listAll(userCode, sdf.parse(dateFrom), sdf.parse(dateTo));
    }
}
