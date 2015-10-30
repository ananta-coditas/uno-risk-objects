/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.premm;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.premm")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    public enum AffectedType { NONE(0),ONE(1),MULTIPLE(2);
        public int value = 0;
        AffectedType(int code) {
            value = code;
        }
};
    
    
    public static final String MLH1 = "MLH1";
    public static final String MSH2 = "MSH2";
    public static final String MSH6 = "MSH6";
            
    private AffectedType affectedColonType       =  AffectedType.NONE;
    private AffectedType affectedEndometriumType = AffectedType.NONE;
    private AffectedType affectedRelatedType = AffectedType.NONE;
    private Integer diagnoseColonAge     = 0;
    private Integer diagnoseEndometriumAge     = 0;
    private Integer diagnoseRelatedAge     = 0;
    
    
    
    public Person() {
    }

    @Override
    protected List<String> germLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public AffectedType getAffectedColonType() {
        return affectedColonType;
    }
     public AffectedType getAffectedRelatedType() {
        return affectedRelatedType;
    }

    public void setAffectedColonType(AffectedType affectedColonType) {
         if (affectedColonType == null) {
            this.affectedColonType = AffectedType.NONE;
        } else {
            this.affectedColonType =  affectedColonType;
        }
    }
    public void setAffectedColonType(Integer intType) {
        setAffectedColonType(toAffectedType(intType));
    }
    public static AffectedType toAffectedType(Integer anInt) {
        for (AffectedType type : AffectedType.values()) {
            if (anInt != null && anInt == type.value) {
                return type;
            }
        }
        return AffectedType.NONE;
    }
    public void setAffectedRelatedType(AffectedType affectedRelatedType) {
         if (affectedRelatedType == null) {
            this.affectedRelatedType = AffectedType.NONE;
        } else {
            this.affectedRelatedType =  affectedRelatedType;
        }
    }
    public void setAffectedRelatedType(Integer intType) {
        setAffectedRelatedType(toAffectedType(intType));
    }
     public void setAffectedEndolmetriumType(Integer intType) {
        setAffectedEndometriumType(toAffectedType(intType));
    }
    public AffectedType getAffectedEndometriumType() {
        return affectedEndometriumType;
    }

    public void setAffectedEndometriumType(AffectedType affectedEndometriumType) {
        if (affectedEndometriumType == null) {
            this.affectedEndometriumType = AffectedType.NONE;
        } else {
            this.affectedEndometriumType =  affectedEndometriumType;
        }
    }

    public Integer getDiagnoseColonAge() {
        if (diagnoseColonAge  == 0 && getAffectedColonType() == AffectedType.NONE) {
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
        if (diagnoseEndometriumAge == 0 && getAffectedEndometriumType() == AffectedType.NONE) {
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
