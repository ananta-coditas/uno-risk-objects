/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jason
 */
public abstract class BaseRisk implements Cloneable, Serializable {
    //public enum RACE = {};
  
    private String input = null;
    private boolean consent = false;
    private int ageBy = 5;
    private int ageTo = 85;
    private String penetrance = null; //enum
    boolean saveIncoming = false;
    private String familyId = "";
    private String transId = null;
    private String model = "NONE";

    public String getFamilyId() {
        return familyId;
    }

    public String getModel() {
        return "NONE";
    }
    
    protected void setModel(String model) {
        this.model = model;
    }
    
    public String getTransId() {
        return transId;
    }
    
    public boolean isSaveIncoming() {
        return saveIncoming;
    }
    public abstract List<? extends BasePerson> getFamily();
    /**
     * convenience method which return proband which currently should always be the
     * first element
     * @return 
     */
    public BasePerson getProband() {
        if (!getFamily().isEmpty()) {
            return getFamily().get(0);
        }
        return null;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }
    
    public void setSaveIncoming(boolean saveIncoming) {
        this.saveIncoming = saveIncoming;
    }
    public int getAgeBy() {
            return ageBy;
    }
    public void setAgeBy(int ageBy) {
            this.ageBy = ageBy;
    }
    public int getAgeTo() {
            return ageTo;
    }
    public void setAgeTo(int ageTo) {
            this.ageTo = ageTo;
    }
    public String getPenetrance() {
            return penetrance;
    }
    public void setPenetrance(String penetrance) {
            this.penetrance = penetrance;
    }
    
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }


    public boolean isConsent() {
        return consent;
    }

    public void setConsent(boolean consent) {
        this.consent = consent;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public void remove(BasePerson person) {
       getFamily().remove(person);
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }
}
