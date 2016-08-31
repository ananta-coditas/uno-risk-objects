/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "RiskError")
public class RiskError {
    private String description = "";
    private Integer personId = 0;

    public Integer getCode() {
        return personId;
    }

    public RiskError() {}
    
    public RiskError(Integer personId, String desc) {
        this.personId = personId;
        this.description = desc;
    }
    
    public RiskError(String desc) {
        this(0,desc);
    }
    
    public String getDescription() {
        return description;
    }

    public void setCode(Integer code) {
        this.personId = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
