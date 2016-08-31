/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mmr;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import static com.objex.risk.beans.Germline.*;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.mmr")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
            
    private Integer affectedColonType       = 0;
    private Integer affectedEndometriumType      = 0;
    private Integer diagnoseColonAge     = 0;
    private Integer diagnoseEndometriumAge     = 0;
    private Marker marker = null;
    
    public Person() {
    }
    @Override
    protected List<String> germLines() {
        return Arrays.asList(MLH1,MSH2,MSH6);
    }
    
    @XmlElement(name="Marker")
    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Integer getAffectedColonType() {
        return affectedColonType;
    }
   
   /**
    * the max value of this is one, greater integers will be translated to 1
    * @param affectedColonType 
    */ 
    public void setAffectedColonType(Integer affectedColonType) {
        this.affectedColonType = toInt(affectedColonType);
        if (this.affectedColonType > 1) {
            this.affectedColonType = 1;
        }
    }

    public Integer getAffectedEndometriumType() {
        return affectedEndometriumType;
    }
    /**
     * the integer is converted to 1 if it is greater than 1.
     * @param affectedEndometriumType 
     */

    public void setAffectedEndometriumType(Integer affectedEndometriumType) {
        this.affectedEndometriumType = toInt(affectedEndometriumType);
        if (this.affectedEndometriumType > 1) {
            this.affectedEndometriumType = 1;
        }
    }

    public Integer getDiagnoseColonAge() {
        if (diagnoseColonAge  == 0 && getAffectedColonType() == 0) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnoseColonAge;
    }

    public void setDiagnoseColonAge(Integer diagnoseColonAge) {
          this.diagnoseColonAge = toInt(diagnoseColonAge);
        
    }

    public Integer getDiagnoseEndometriumAge() {
        if (diagnoseEndometriumAge == 0 && getAffectedEndometriumType() == 0) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnoseEndometriumAge;
    }

    public void setDiagnoseEndometriumAge(Integer diagnoseEndometriumAge) {
            this.diagnoseEndometriumAge =  toInt(diagnoseEndometriumAge);
    }
   
}
