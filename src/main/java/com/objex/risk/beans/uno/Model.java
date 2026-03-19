/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "Model")
@XmlAccessorType(XmlAccessType.FIELD)
public class Model {
    
    public enum ModelName {BRCAPRO,MMRPRO,MELAPRO,PANCPRO,PREMM,GAIL,TYRER,CLAUS,NCCN,COMPETING_MORTALITY_SCENARIO}
    private ModelName name         = null;
    private int ageBy        = 0;
    private int ageTo        = 0;
    private Integer chartCode    = null;

    @XmlElementWrapper(name="Instructions")
    @XmlElement(name="Instruction")
    private List<Instruction> instructions = new ArrayList<>();

    /**
     * @return the name
     */
    public ModelName getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(ModelName name) {
        this.name = name;
    }

    /**
     * @return the ageBy
     */
    public int getAgeBy() {
        return ageBy;
    }

    /**
     * @param ageBy the ageBy to set
     */
    public void setAgeBy(int ageBy) {
        this.ageBy = ageBy;
    }

    /**
     * @return the ageTo
     */
    public int getAgeTo() {
        return ageTo;
    }

    /**
     * @param ageTo the ageTo to set
     */
    public void setAgeTo(int ageTo) {
        this.ageTo = ageTo;
    }


    /**
     * @return the chartCode
     */
    public Integer getChartCode() {
        return chartCode;
    }

    /**
     * @param chartCode the chartCode to set
     */
    public void setChartCode(Integer chartCode) {
        this.chartCode = chartCode;
    }

    /**
     * @return the instructions
     */
    public List<Instruction> getInstructions() {
        return instructions;
    }

    /**
     * @param instructions the instructions to set
     */
    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }
    
}
