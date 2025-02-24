/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author jason
 */

public class Prediction {
    public List<NameValue> getCancerRisks() {
		return cancerRisks;
	}
	public void setCancerRisks(List<NameValue> cancerRisks) {
		this.cancerRisks = cancerRisks;
	}
	private Integer age = null;
    Map<String,String> colToField = new HashMap<>();
    
    private List<NameValue> cancerRisks = new ArrayList<>();
    
    
    public Double getResult(String name) {
        for (NameValue res : cancerRisks) {
            if (res.name.equals(name)) {
                return res.value;
            }
        }
        return null;
    }
    public Integer getAge() {
        return age;
    }
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (NameValue res : cancerRisks) {
            names.add(res.name);
        }
        return names;
    }
   
    public void setAge(Integer age) {
        this.age = age;
    }
     public void addRisk(String name, Double cancerRisk) {
        if ("By age".equals(name)) {
           double age = cancerRisk;
           setAge((int)age);
           return;
        }
        if (colToField.get(name) != null) {
            name = colToField.get(name);
        }
        if (cancerRisk != null && Double.isNaN(cancerRisk)) {
            cancerRisk = null;
        }
        cancerRisks.add(new NameValue(name, cancerRisk));
    }
    public void addColumnMapping(String col, String fieldName) {
        colToField.put(col,fieldName);
    }
    public void setColumnMappings(Map<String,String> map) {
        colToField = map;
    }
    @XmlRootElement(name = "result")
    public static class NameValue {
        private String name = null;
        private Double value = null;
        public NameValue() {}
        public NameValue(String name, Double value) {
            this.name = name;
            this.value = value;  
        }
		public Double getValue() {
			return value;
		}
		public void setValue(Double value) {
			this.value = value;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
    }
    
    
}
