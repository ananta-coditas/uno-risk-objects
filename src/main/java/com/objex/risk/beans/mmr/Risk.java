/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mmr;

import com.objex.risk.beans.BasePerson;
import com.objex.risk.beans.BaseRisk;
import static com.objex.risk.beans.mmr.MMRResult.MMRPRO;
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
@XmlType(namespace="com.objex.risk.beans.mmr")
@XmlRootElement(name = "Risk")
public class Risk extends BaseRisk {

    @XmlElementWrapper(name="Family")
    @XmlElement(name="Person")
    private List<Person> family = new ArrayList<>();
    private boolean impute = true;
    private boolean imputeRelatives = true;
    private Double sensitivity1 = null;
    private Double sensitivity2 = null;
    private Double sensitivity3 = null;
    private Double specificity1 = null;
    private Double specificity2 = null;
    private Double specificity3 = null;
    
    
    @Override
    public List<Person> getFamily() {
        return family;
    }
     public void add(Person person) {
       family.add(person);
    }

    @Override
    public String getModel() {
       return MMRPRO;
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

    public Double getSensitivity3() {
        return sensitivity3;
    }

    public void setSensitivity3(Double sensitivity3) {
        this.sensitivity3 = sensitivity3;
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

    public Double getSpecificity3() {
        return specificity3;
    }

    public void setSpecificity3(Double specificity3) {
        this.specificity3 = specificity3;
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
