/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author jason
 */
public abstract class BasePerson implements Cloneable {
    private Integer age                    = 0;
    private Integer ageOfDeath             = 0;
    private Integer id                     = -1;
    private Integer gender                 = 0;
    private Integer fatherId               = 0;
    private Integer motherId               = 0;
    private Integer testOrder             =  0;
    @XmlElementWrapper(name="Germline")
    private Map<String, TestResult> germline = null;

    @XmlElement(name = "age")
    public Integer getAge() {
        return age;
    }

    @XmlElement(name = "ageOfDeath")
    public Integer getAgeOfDeath() {
        return ageOfDeath;
    }
    
    @XmlElement(name = "ID")
    public Integer getId() {
        return id;
    }
    public boolean isMother(BasePerson person) {
        if (person == null) {
            return false;
        }
       return Objects.equals(getId(), person.getMotherId());
    }
    public boolean isFather(BasePerson person) {
         if (person == null) {
            return false;
        }
         return Objects.equals(getId(), person.getFatherId());
    }
    public boolean isParent(BasePerson person) {
         if (person == null) {
            return false;
        }
        return isFather(person) || isMother(person);
    }
    /**
     * this is for a full sibling with the same mother and father
     * @param person
     * @return 
     */
    public  boolean isSibling(BasePerson person) {
        if (person == null || getId().equals(person.getId())) {
            return false;
        }
        boolean sameFather = getFatherId() > 0 && getFatherId() == person.getFatherId();
        boolean sameMother = getMotherId() > 0 && getMotherId() == person.getMotherId();
        return  sameFather && sameMother;
    }
    /**
     * this is for a half sibling with the same mother and father
     * @param person
     * @return 
     */
    public  boolean isHalfSibling(BasePerson person) {
        if (person == null || getId().equals(person.getId())) {
            return false;
        }
        boolean sameFather = getFatherId() > 0 && getFatherId() == person.getFatherId();
        boolean sameMother = getMotherId() > 0 && getMotherId() == person.getMotherId();
        return  sameFather || sameMother && !isSibling(person);
    }
    public boolean isChild(BasePerson person) {
         if (person == null) {
            return false;
        }
        return person.isParent(this);
    }
    public void setAge(Integer age) {
        if (age  == null) {
            this.age = 0;
        }
        else {
         this.age = age; 
        }
    }

    public void setAgeOfDeath(Integer ageOfDeath) {
         if (ageOfDeath  == null) {
            this.ageOfDeath  = 0;
        }
        else {
         this.ageOfDeath  = ageOfDeath; 
        }
    }
    protected Integer toInt(Integer inValue) {
        if (inValue == null) {
            return 0;
        }
        return inValue;
    }
   
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
    @XmlElement(name = "fatherID")
    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        if (fatherId == null) {
            this.fatherId = 0;
        }
        else {
            this.fatherId = fatherId;
        }
    }
    @XmlElement(name = "motherID")
    public Integer getMotherId() {
        return motherId;
    }

    public void setMotherId(Integer motherId) {
         if (motherId == null) {
            this.motherId = 0;
        }
        else {
            this.motherId = motherId;
        }
    }

    public Integer getTestOrder() {
        return testOrder;
    }

    public void setTestOrder(Integer testOrder) {
        this.testOrder = testOrder;
    }

    public Map<String, TestResult> getGermline() {
        if (germline == null || (germline.isEmpty() && !germLines().isEmpty())) {
            germline = new LinkedHashMap<>();
            for (String germ : germLines()) {
                germline.put(germ, TestResult.NONE);;
            }
        }
        return germline;
    }

   // public void setGermline(Map<String, TestResult> germline) {
     //   this.germline = germline;
    //}
    public void setGermline(String name, TestResult result) {
        if (getGermline().get(name) != null) {
             getGermline().put(name,result);
        }
    }
    public TestResult getGermline(String testName) {
        if (getGermline().get(testName) == null) {
            return TestResult.NONE;
        }
        return getGermline().get(testName);   
    }
    public boolean hasGermline() {
        for (TestResult germ : getGermline().values()) {
            if (germ != TestResult.NONE) {
                return true;
            }
            
        }
        return false;
    }

    protected abstract List<String> germLines();
    
}
