/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.gail;

import com.objex.risk.beans.BaseRisk;
import static com.objex.risk.beans.gail.GailResult.GAIL;
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
@XmlType(namespace="com.objex.risk.beans.gail")
@XmlRootElement(name = "Risk")
public class Risk extends BaseRisk {

    @XmlElementWrapper(name="Family")
    @XmlElement(name="Person")
    private List<Person> family = new ArrayList<>();
    
    @Override
    public List<Person> getFamily() {
        return family;
    }
     public void add(Person person) {
       family.add(person);
    }

    @Override
    public String getModel() {
        return GAIL;
    }
}
