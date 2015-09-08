/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author jason
 */
public abstract class BaseRisk implements Cloneable {
    //public enum RACE = {};
  
    private String input = null;
    private boolean consent = false;
    private int ageBy = 5;
    private int ageTo = 85;
    private String penetrance = null; //enum
    boolean saveIncoming = false;

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
    
}
