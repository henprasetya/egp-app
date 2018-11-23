/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api;

import com.egp.api.dao.ClientDAO;
import com.egp.api.model.Client;
import com.egp.api.repo.ClientRepository;
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
@RequestMapping(value = "/client")
public class ClientController {
 
    private final ClientRepository clientRepository;
    private final ClientDAO clientDAO;
    
    public ClientController(ClientRepository clientRepository, ClientDAO clientDao){
        this.clientRepository = clientRepository;
        this.clientDAO = clientDao;
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Client addNewClients(@RequestBody Client client) {
        return clientRepository.save(client);
    }
    
    @RequestMapping(value = "/list-client", method = RequestMethod.POST)
    public List<Client> list() {
        return clientRepository.findAll();
    }
}
