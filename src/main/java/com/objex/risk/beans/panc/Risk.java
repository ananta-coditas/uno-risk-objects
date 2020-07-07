/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.panc;

import com.objex.risk.beans.mmr.*;
import com.objex.risk.beans.BasePerson;
import com.objex.risk.beans.BaseRisk;
import static com.objex.risk.beans.panc.PancResult.PANCPRO;
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
@XmlType(namespace="com.objex.risk.beans.panc")
@XmlRootElement(name = "Risk")
public class Risk extends BaseRisk {

    @XmlElementWrapper(name="Family")
    @XmlElement(name="Person")
    private List<Person> family = new ArrayList<>();
    private boolean impute;
    private boolean imputeRelatives;
    private Double sensitivity1 = null;
    private Double sensitivity2 = null;
    private Double specificity1 = null;
    private Double specificity2 = null;
    @Override
    public List<Person> getFamily() {
        return family;
    }
     public void add(Person person) {
       family.add(person);
    }

    @Override
    public String getModel() {
        return PANCPRO;
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
