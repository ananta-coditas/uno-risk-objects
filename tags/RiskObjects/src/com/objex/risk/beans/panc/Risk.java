/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.panc;

import com.objex.risk.beans.mmr.*;
import com.objex.risk.beans.BasePerson;
import com.objex.risk.beans.BaseRisk;
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
    
}
