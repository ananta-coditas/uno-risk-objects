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
@XmlRootElement(name = "RiskCommand")
public class RiskCommand {
    //names are only in upper case
    protected String name = "";
    protected String value = "";
    protected String response = "";
    
    public RiskCommand() {}
    
    public RiskCommand(String aname, String avalue) {
        name = aname.toUpperCase();
        value = avalue;
    }
    
    public RiskCommand(String aname) {
        name = aname.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public String getResponse() {
        return response;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
}
