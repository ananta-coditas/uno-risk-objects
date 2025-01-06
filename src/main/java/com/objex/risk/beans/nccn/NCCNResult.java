/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.nccn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "NCCNResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class NCCNResult {
    
   
    private String hbocOverall = null;
    private CriteriaMet hbocCriteriaMet = null;
    private CriteriaMetId hbocCriteriaMetId = null;
    
    private String lynchOverall = null;
    private CriteriaMet lynchCriteriaMet = null;
    private CriteriaMetId lynchCriteriaMetId = null;
    
    
    private String absApcOverall = null;
    private CriteriaMet absApcCriteriaMet = null;
    private CriteriaMetId absApcCriteriaMetId = null;

    /**
     * @return the hbocOverall
     */
    public String getHbocOverall() {
        return hbocOverall;
    }

    /**
     * @param hbocOverall the hbocOverall to set
     */
    public void setHbocOverall(String hbocOverall) {
        this.hbocOverall = hbocOverall;
    }

    /**
     * @return the hbocCriteriaMet
     */
    public CriteriaMet getHbocCriteriaMet() {
        return hbocCriteriaMet;
    }

    /**
     * @param hbocCriteriaMet the hbocCriteriaMet to set
     */
    public void setHbocCriteriaMet(CriteriaMet hbocCriteriaMet) {
        this.hbocCriteriaMet = hbocCriteriaMet;
    }

    /**
     * @return the hbocCriteriaMetId
     */
    public CriteriaMetId getHbocCriteriaMetId() {
        return hbocCriteriaMetId;
    }

    /**
     * @param hbocCriteriaMetId the hbocCriteriaMetId to set
     */
    public void setHbocCriteriaMetId(CriteriaMetId hbocCriteriaMetId) {
        this.hbocCriteriaMetId = hbocCriteriaMetId;
    }

    /**
     * @return the lynchOverall
     */
    public String getLynchOverall() {
        return lynchOverall;
    }

    /**
     * @param lynchOverall the lynchOverall to set
     */
    public void setLynchOverall(String lynchOverall) {
        this.lynchOverall = lynchOverall;
    }

    /**
     * @return the lynchCriteriaMet
     */
    public CriteriaMet getLynchCriteriaMet() {
        return lynchCriteriaMet;
    }

    /**
     * @param lynchCriteriaMet the lynchCriteriaMet to set
     */
    public void setLynchCriteriaMet(CriteriaMet lynchCriteriaMet) {
        this.lynchCriteriaMet = lynchCriteriaMet;
    }

    /**
     * @return the lynchCriteriaMetId
     */
    public CriteriaMetId getLynchCriteriaMetId() {
        return lynchCriteriaMetId;
    }

    /**
     * @param lynchCriteriaMetId the lynchCriteriaMetId to set
     */
    public void setLynchCriteriaMetId(CriteriaMetId lynchCriteriaMetId) {
        this.lynchCriteriaMetId = lynchCriteriaMetId;
    }

    /**
     * @return the absApcOverall
     */
    public String getAbsApcOverall() {
        return absApcOverall;
    }

    /**
     * @param absApcOverall the absApcOverall to set
     */
    public void setAbsApcOverall(String absApcOverall) {
        this.absApcOverall = absApcOverall;
    }

    /**
     * @return the absApcCriteriaMet
     */
    public CriteriaMet getAbsApcCriteriaMet() {
        return absApcCriteriaMet;
    }

    /**
     * @param absApcCriteriaMet the absApcCriteriaMet to set
     */
    public void setAbsApcCriteriaMet(CriteriaMet absApcCriteriaMet) {
        this.absApcCriteriaMet = absApcCriteriaMet;
    }

    /**
     * @return the absApcCriteriaMetId
     */
    public CriteriaMetId getAbsApcCriteriaMetId() {
        return absApcCriteriaMetId;
    }

    /**
     * @param absApcCriteriaMetId the absApcCriteriaMetId to set
     */
    public void setAbsApcCriteriaMetId(CriteriaMetId absApcCriteriaMetId) {
        this.absApcCriteriaMetId = absApcCriteriaMetId;
    }
       
    
    
     
    
}
