/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.uno;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.objex.risk.beans.BaseRisk;
import com.objex.risk.beans.uno.Model.ModelName;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.uno")
@XmlRootElement(name = "Risk")
public class Risk extends BaseRisk {
    

    @XmlElementWrapper(name="RequestedModels")
    @XmlElement(name="Model")
    private List<Model> requestedModels = new ArrayList<>();
    @XmlElementWrapper(name="Family")
    @XmlElement(name="Person")
    private List<Person> family = new ArrayList<>();

    @Override
    public List<Person> getFamily() {
        return family;
    }
    public List<Model> getRequestedModels() {
        return requestedModels;
    }
    public void setRequestedModels(List<Model> requestedModels) {
        this.requestedModels = requestedModels;
    }
    public void setFamily(List<Person> family) {
        this.family = family;
    }
	public Model getRequestedModel(ModelName modelName) {
	    for (Model model : requestedModels) {
	    	if (model.getName() == modelName) {
	    		return model;
	    	}
	    }
		return null;
	}
	public void add(Person person) {
       family.add(person);
    }
}
