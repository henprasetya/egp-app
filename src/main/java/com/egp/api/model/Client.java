/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author KFC SOLUTION
 */
@Document
public class Client {

    @Id
    private String clientId;    
    private String clientCode = "";
    private String clientName = "";
    private String clientAddress = "";
    private String clientTlp = "";
    private String clientPersonil = "";
    private String clientPIC = "";
    private List<Map<String, String>> listCabang = new ArrayList<>();

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientTlp() {
        return clientTlp;
    }

    public void setClientTlp(String clientTlp) {
        this.clientTlp = clientTlp;
    }

    public String getClientPersonil() {
        return clientPersonil;
    }

    public void setClientPersonil(String clientPersonil) {
        this.clientPersonil = clientPersonil;
    }

    public String getClientPIC() {
        return clientPIC;
    }

    public void setClientPIC(String clientPIC) {
        this.clientPIC = clientPIC;
    }

    public List<Map<String, String>> getListCabang() {
        return listCabang;
    }

    public void setListCabang(List<Map<String, String>> listCabang) {
        this.listCabang = listCabang;
    }
    
    
    
}
