/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.panc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.panc")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    /*Family members for whom no information is avaliable should be coded with a 0 in the cancer
        diagnosis fields, and a 1 in the age elds. */
    private Integer affectedPancreasType       = 0;
    private Integer diagnosePancreasAge     = 0;
    
    public Person() {  
    }
     @Override
    protected List<String> germLines() {
        return new ArrayList<>();
    }
    public Integer getAffectedPancreasType() {
        return affectedPancreasType;
    }

    public void setAffectedPancreasType(Integer affectedPancreasType) {
        this.affectedPancreasType = toInt(affectedPancreasType);
    }

    public Integer getDiagnosePancreasAge() {
       if (diagnosePancreasAge == 0  && getAffectedPancreasType() == 0) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnosePancreasAge;
    }

    public void setDiagnosePancreasAge(Integer diagnosePancreasAge) {
        if (diagnosePancreasAge == null) {
            this.diagnosePancreasAge = 0;
        }
        else {
            this.diagnosePancreasAge = diagnosePancreasAge;
        }
    }
   
}
