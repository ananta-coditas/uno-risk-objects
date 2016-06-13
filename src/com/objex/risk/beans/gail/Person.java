/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.gail;

import com.objex.risk.beans.AffectedType;
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
    public enum Race  {White(1), Black(2), Hispanic(3), Chinese(7), Japanese(8), Filipino(9), Hawaiian(10), PacificIslander(11), AsianAmerican(12);
         public int value = 0;
         Race(int code) {
            value = code;
        }
    
    };
    
    private boolean performedBiopsy  = false;
    private Integer biopsyCount = 0;  
    private Integer menarcheAge = 0;
    private Boolean hasLiveBirth = false;
    private Integer liveBirthAge = 0;
    private boolean hasHyperplasia = false;
    private boolean hasLCIS = false;
    private boolean hasDCIS = false;
    private boolean hasMantleRadiation = false;
    private Race race = Race.White;
    private AffectedType affectedBreastType = AffectedType.NONE;
    
   
    
    public Person() {
    }

    @Override
    protected List<String> germLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AffectedType getAffectedBreastType() {
        return affectedBreastType;
    }

    public Integer getBiopsyCount() {
        return biopsyCount;
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

    public boolean getHasLCIS() {
        return hasLCIS;
    }
    
     public boolean getHasDCIS() {
        return hasDCIS;
    }

    public boolean getHasMantleRadiation() {
        return hasMantleRadiation;
    }

    public boolean isPerformedBiopsy() {
        return performedBiopsy;
    }
    
     public boolean getHasHyperplasia() {
        return hasHyperplasia;
    }

    public void setAffectedBreastType(AffectedType affectedBreastType) {
        if (affectedBreastType == null) {
            this.affectedBreastType = AffectedType.NONE;
        } else {
            this.affectedBreastType = affectedBreastType;
        }
    }
    
     public void setAffectedBreastType(Integer affectedBreastType) {
        setAffectedBreastType(AffectedType.toAffectedType(affectedBreastType));
    }

    public void setBiopsyCount(Integer biopsyCount) {
        this.biopsyCount = biopsyCount;
    }

    public void setHasDCIS(boolean hasDCIS) {
        this.hasDCIS = hasDCIS;
    }

    public void setHasHyperplasia(boolean hasHyperplasia) {
        this.hasHyperplasia = hasHyperplasia;
    }

    public void setHasLCIS(boolean hasLCIS) {
        this.hasLCIS = hasLCIS;
    }

    public void setHasLiveBirth(Boolean hasLiveBirth) {
        this.hasLiveBirth = hasLiveBirth;
    }
    
    public Boolean getHasLiveBirth() {
        return hasLiveBirth;
    }

    public void setHasMantleRadiation(boolean hasMantleRadiation) {
        this.hasMantleRadiation = hasMantleRadiation;
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
    
    public void setRace(Race race) {
        this.race = race;
    }
   
}
