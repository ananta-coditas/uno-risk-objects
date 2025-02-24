/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.gail;

import com.objex.risk.beans.AffectedType;
import static com.objex.risk.beans.Germline.BRCA1;
import static com.objex.risk.beans.Germline.BRCA2;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.gail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    public enum Race  {White(1), Black(2), Hispanic(3), Chinese(7), Japanese(8), Filipino(9), Hawaiian(10), PacificIslander(11), AsianAmerican(12),Unsupported(13);
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
    private Race race = null;
    private AffectedType affectedBreastType = AffectedType.NONE;
    
   
    
    public Person() {
    }

    @Override
    protected List<String> germLines() {
         return Arrays.asList(BRCA1,BRCA2);
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

    @XmlElement(namespace="com.objex.risk.beans.gail.Person.Race")
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
        this.biopsyCount = toInt(biopsyCount);
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
        this.menarcheAge = toInt(menarcheAge);
    }
    
    public void setPerformedBiopsy(boolean biopsy) {
        this.performedBiopsy = biopsy;
    }
    
    public void setRace(Race race) {
        this.race = race;
    }
   
}
