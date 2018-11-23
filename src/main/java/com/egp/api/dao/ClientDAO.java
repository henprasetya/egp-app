/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.dao;

import com.egp.api.model.Client;
import java.util.List;

/**
 *
 * @author KFC SOLUTION
 */
public interface ClientDAO {
    
    List<Client> getListClient();
    
    Client addClient(Client client);
}
