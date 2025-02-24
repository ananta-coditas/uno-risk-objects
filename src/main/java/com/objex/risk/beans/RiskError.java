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
    private String code = "";

    public RiskError() {}
    
    public RiskError(Integer personId, String desc, String code) {
        this.personId = personId;
        this.description = desc;
        this.code = code;
    }
    
    public RiskError(String desc) {
        this(0,desc,desc);
    }
    
    public String getDescription() {
        return description;
    }
    
        public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer id) {
        this.personId = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    
}
