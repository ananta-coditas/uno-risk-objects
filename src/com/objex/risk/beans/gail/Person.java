/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.gail;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.gail")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    public enum Race  {Unknown, Hispanic, Asian,Chinese,Japanese,Filipino, Black, NativeAmerican,White, PacificIslander};
    
    private boolean performedBiopsy  = false;
   // private Integer biopsyCount = 0;  for everyone or proband???
    private Integer menarcheAge = 0;
    private boolean hasLiveBirth = false;
    private Integer liveBirthAge = 0;
    private boolean hasHyperplasia = false;
    private Race race = Race.Unknown;
    
    public enum AffectedType { NONE(0),ONE(1),MULTIPLE(2);
        public int value = 0;
        AffectedType(int code) {
            value = code;
        }
};
    
    private AffectedType affectedEndometriumType = AffectedType.NONE;
    private AffectedType affectedRelatedType = AffectedType.NONE;
    private Integer diagnoseEndometriumAge     = 0;
    private Integer diagnoseRelatedAge     = 0;
    
    
    
    public Person() {
    }

    @Override
    protected List<String> germLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
   
     public AffectedType getAffectedRelatedType() {
        return affectedRelatedType;
    }

    public Integer getLiveBirthAge() {
        return liveBirthAge;
    }

    public Integer getMenarcheAge() {
        return menarcheAge;
    }

    public Race getRace() {
        return race;
    }

    public boolean isPerformedBiopsy() {
        return performedBiopsy;
    }

    public void setLiveBirthAge(Integer liveBirthAge) {
        this.liveBirthAge = liveBirthAge;
    }

    public void setMenarcheAge(Integer menarcheAge) {
        this.menarcheAge = menarcheAge;
    }
    public void setPerformedBiopsy(boolean biopsy) {
        this.performedBiopsy = biopsy;
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

    public void setRace(Race race) {
        this.race = race;
    }
   
}
