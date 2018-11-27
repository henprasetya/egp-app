/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egp.api.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author KFC SOLUTION
 */
@Document
public class FormActivity {
    
    @Id
    String activityId = "";
    
    String clientCode = "";
    String clientName = "";
    String cabangCode = "";
    String cabangName = "";
    String location  = "";
    String coordinat = "";
    String picClient = "";
    String picEgp = "";
    Double jarak = 0d;
    String petugasJaga = "";
    String catatan = "";
    String gambar = "";
    String userCreateCode = "";
    String userCreateName = "";
    Date createDate = new Date();

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
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

    public String getCabangCode() {
        return cabangCode;
    }

    public void setCabangCode(String cabangCode) {
        this.cabangCode = cabangCode;
    }

    public String getCabangName() {
        return cabangName;
    }

    public void setCabangName(String cabangName) {
        this.cabangName = cabangName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoordinat() {
        return coordinat;
    }

    public void setCoordinat(String coordinat) {
        this.coordinat = coordinat;
    }

    public String getPicClient() {
        return picClient;
    }

    public void setPicClient(String picClient) {
        this.picClient = picClient;
    }

    public String getPicEgp() {
        return picEgp;
    }

    public void setPicEgp(String picEgp) {
        this.picEgp = picEgp;
    }

    public Double getJarak() {
        return jarak;
    }

    public void setJarak(Double jarak) {
        this.jarak = jarak;
    }

    public String getPetugasJaga() {
        return petugasJaga;
    }

    public void setPetugasJaga(String petugasJaga) {
        this.petugasJaga = petugasJaga;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getUserCreateCode() {
        return userCreateCode;
    }

    public void setUserCreateCode(String userCreateCode) {
        this.userCreateCode = userCreateCode;
    }

    public String getUserCreateName() {
        return userCreateName;
    }

    public void setUserCreateName(String userCreateName) {
        this.userCreateName = userCreateName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
}
