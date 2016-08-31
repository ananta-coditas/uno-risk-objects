/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.brca;

import com.objex.risk.beans.BasePerson;
import static com.objex.risk.beans.brca.BRCAResult.BRCAPRO;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.brca")
@XmlRootElement(name = "Risk")
public class Risk extends com.objex.risk.beans.BaseRisk {
    
    @XmlElementWrapper(name="Family")
    @XmlElement(name="Person")
    private List<Person> family = new ArrayList<>();
    private boolean impute = true;
    private Double sensitivity1 = null;
    private Double sensitivity2 = null;
    private Double specificity1 = null;
    private Double specificity2 = null;
 
    
    public enum Race  {Unknown, Hispanic, Asian, Black, NativeAmerican,White }   
    private Race race =  Race.Unknown;

    @Override
    public String getModel() {
        return BRCAPRO;
    }

    public boolean isImpute() {
        return impute;
    }
    

    public void setImpute(boolean impute) {
        this.impute = impute;
    }
     public Double getSensitivity1() {
            return sensitivity1;
    }
    public void setSensitivity1(Double sensitivity1) {
            this.sensitivity1 = sensitivity1;
    }
    public Double getSensitivity2() {
            return sensitivity2;
    }
    public void setSensitivity2(Double sensitivity2) {
            this.sensitivity2 = sensitivity2;
    }
    public Double getSpecificity1() {
            return specificity1;
    }
    public void setSpecificity1(Double specificity1) {
            this.specificity1 = specificity1;
    }
    public Double getSpecificity2() {
            return specificity2;
    }
    public void setSpecificity2(Double specificity2) {
            this.specificity2 = specificity2;
    }
    public Race getRace() {
        return race;
    }
/**
 * this is the race of the family, it should default to Unknown when not set.
 * @param race 
 */
    public void setRace(Race race) {
        if (race != null)
             this.race = race;
    }
    
    public void add(Person person) {
       family.add(person);
    }
    public List<Person> getFamily()
    {
        return family;
    }
   
}
