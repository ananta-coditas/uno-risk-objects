/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mela;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import static com.objex.risk.beans.Germline.*;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.mela")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    /*Family members for whom no information is avaliable should be coded with a 0 in the cancer
        diagnosis fields, and a 1 in the age elds. */
    private Integer affectedSkinType       = 0;
    private Integer diagnoseSkinAge     = 1;
    
    public Person() { 
    }
    @Override
    protected List<String> germLines() {
        return Arrays.asList(P16);
    }

    public Integer getAffectedSkinType() {
        return affectedSkinType;
    }

    public void setAffectedSkinType(Integer affectedSkinType) {
        this.affectedSkinType = toInt(affectedSkinType);
    }

    public Integer getDiagnoseSkinAge() {
        if (diagnoseSkinAge == 0 && getAffectedSkinType() == 0) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnoseSkinAge;
    }

    public void setDiagnoseSkinAge(Integer diagnoseSkinAge) {
        if (diagnoseSkinAge == null) {
            this.diagnoseSkinAge = diagnoseSkinAge;
        }
        else {
         this.diagnoseSkinAge = diagnoseSkinAge;
        }
    }
   
}
