/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao;

import com.egp.api.model.FormIncident;
import java.util.Date;
import java.util.List;

/**
 *
 * @author KFC SOLUTION
 */
public interface FormIncidentDAO {
    
    List<FormIncident> listAll();
    List<FormIncident> listAll(String userCode, Date dateFrom, Date dateTo);
    FormIncident addAct(FormIncident formIncident);
}
