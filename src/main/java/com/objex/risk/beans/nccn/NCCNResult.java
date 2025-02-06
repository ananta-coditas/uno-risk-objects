/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.nccn;

import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.objex.risk.beans.BaseResult;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "NCCNResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class NCCNResult extends BaseResult {

    private String hbocVersion;
    private String crcVersion;
    private String hbocOverall;
    private Set<String> hbocCriteriaMet;
    private Set<String> hbocCriteriaMetIds;
    private String lynchOverall;
    private Set<String> lynchCriteriaMet;
    private Set<String> lynchCriteriaMetIds;
    private String apsApcOverall;
    private Set<String> apsApcCriteriaMet;
    private Set<String> apsApcCriteriaMetIds;
    private String dateAssessed;

    public String getHbocVersion() {
        return hbocVersion;
    }

    public void setHbocVersion(String hbocVersion) {
        this.hbocVersion = hbocVersion;
    }

    public String getCrcVersion() {
        return crcVersion;
    }

    public void setCrcVersion(String crcVersion) {
        this.crcVersion = crcVersion;
    }

    public String getHbocOverall() {
        return hbocOverall;
    }

    public void setHbocOverall(String hbocOverall) {
        this.hbocOverall = hbocOverall;
    }

    public Set<String> getHbocCriteriaMet() {
        return hbocCriteriaMet;
    }

    public void setHbocCriteriaMet(Set<String> hbocCriteriaMet) {
        this.hbocCriteriaMet = hbocCriteriaMet;
    }

    public Set<String> getHbocCriteriaMetIds() {
        return hbocCriteriaMetIds;
    }

    public void setHbocCriteriaMetIds(Set<String> hbocCriteriaMetIds) {
        this.hbocCriteriaMetIds = hbocCriteriaMetIds;
    }

    public String getLynchOverall() {
        return lynchOverall;
    }

    public void setLynchOverall(String lynchOverall) {
        this.lynchOverall = lynchOverall;
    }

    public Set<String> getLynchCriteriaMet() {
        return lynchCriteriaMet;
    }

    public void setLynchCriteriaMet(Set<String> lynchCriteriaMet) {
        this.lynchCriteriaMet = lynchCriteriaMet;
    }

    public Set<String> getLynchCriteriaMetIds() {
        return lynchCriteriaMetIds;
    }

    public void setLynchCriteriaMetIds(Set<String> lynchCriteriaMetIds) {
        this.lynchCriteriaMetIds = lynchCriteriaMetIds;
    }

    public String getApsApcOverall() {
        return apsApcOverall;
    }

    public void setApsApcOverall(String apsApcOverall) {
        this.apsApcOverall = apsApcOverall;
    }

    public Set<String> getApsApcCriteriaMet() {
        return apsApcCriteriaMet;
    }

    public void setApsApcCriteriaMet(Set<String> apsApcCriteriaMet) {
        this.apsApcCriteriaMet = apsApcCriteriaMet;
    }

    public Set<String> getApsApcCriteriaMetIds() {
        return apsApcCriteriaMetIds;
    }

    public void setApsApcCriteriaMetIds(Set<String> apsApcCriteriaMetIds) {
        this.apsApcCriteriaMetIds = apsApcCriteriaMetIds;
    }

    public String getDateAssessed() {
        return dateAssessed;
    }

    public void setDateAssessed(String dateAssessed) {
        this.dateAssessed = dateAssessed;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public Map<String, String> getColumnToFields() {
        return null;
    }
}
