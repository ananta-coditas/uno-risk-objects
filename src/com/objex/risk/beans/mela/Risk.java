/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mela;

import com.objex.risk.beans.BaseRisk;
import static com.objex.risk.beans.mela.MelaResult.MELAPRO;
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
@XmlType(namespace="com.objex.risk.beans.mela")
@XmlRootElement(name = "Risk")
public class Risk extends BaseRisk {

    @XmlElementWrapper(name="Family")
    @XmlElement(name="Person")
    private List<Person> family = new ArrayList<>();
    private boolean impute = true;
    private boolean imputeRelatives = true;
    private Double sensitivity = null;
    private Double specificity = null;
    @Override
    public List<Person> getFamily() {
        return family;
    }
     public void add(Person person) {
       family.add(person);
    }

    @Override
    public String getModel() {
        return MELAPRO;
    }

    public Double getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(Double sensitivity) {
        this.sensitivity = sensitivity;
    }

    public Double getSpecificity() {
        return specificity;
    }

    public void setSpecificity(Double specificity) {
        this.specificity = specificity;
    } 
        public boolean isImpute() {
        return impute;
    }
    

    public void setImpute(boolean impute) {
        this.impute = impute;
    }
    
     public boolean isImputeRelatives() {
        return imputeRelatives;
    }
    

    public void setImputeRelatives(boolean impute) {
        this.imputeRelatives = impute;
    }
}
