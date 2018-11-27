/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao;

import com.egp.api.model.FormActivity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author KFC SOLUTION
 */
public interface FormActivityDAO {
 
    List<FormActivity> listAll();
    
    List<FormActivity> listAll(String userCode, Date dateForm, Date dateTo);
    
    FormActivity addAct(FormActivity formActivity);
}
