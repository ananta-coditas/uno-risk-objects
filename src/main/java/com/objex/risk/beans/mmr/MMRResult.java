/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mmr;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "MMRResult")
public class MMRResult extends BaseResult {
    private Double probabilityMutationMLH1 = null;
    private Double probabilityMutationMSH2 = null;
    private Double probabilityMutationMSH6 = null;
    public static final String MMRPRO = "MMRPRO";
    
    protected static final Map<String,String> columnToFields = new HashMap<>();
    public static final String COLORECTAL_RISK = "colorectalRisk";
    public static final String ENDOMETRIAL_RISK = "endometrialRisk";
   static {
        columnToFields.put("Colorectal Ca Risk", COLORECTAL_RISK);
        columnToFields.put("Endometrial Ca Risk", ENDOMETRIAL_RISK);
    };

    @Override
    public void addProbability(String name, Double prob) {
         super.addProbability(name, prob);
         if ("Pr(MLH1 mutation)".equals(name)) {
             setProbabilityMutationMLH1(prob);
         }
         else if ("Pr(MSH2 mutation)".equals(name)) {
             setProbabilityMutationMSH2(prob);
         }
         else if ("Pr(MSH6)".equals(name)) {
             setProbabilityMutationMSH6(prob);
         }  
    }


    public Double getProbabilityMutationMLH1() {
        return probabilityMutationMLH1;
    }

    public void setProbabilityMutationMLH1(Double probabilityMutationMLH1) {
        this.probabilityMutationMLH1 = probabilityMutationMLH1;
    }

    public Double getProbabilityMutationMSH2() {
        return probabilityMutationMSH2;
    }

    public void setProbabilityMutationMSH2(Double probabilityMutationMSH2) {
        this.probabilityMutationMSH2 = probabilityMutationMSH2;
    }

    public Double getProbabilityMutationMSH6() {
        return probabilityMutationMSH6;
    }

    public void setProbabilityMutationMSH6(Double percentMutationMSH6) {
        this.probabilityMutationMSH6 = percentMutationMSH6;
    }

    @Override
    public Map<String, String> getColumnToFields() {
       return  columnToFields;
    }

    @Override
    public String getModel() {
        return MMRPRO;
    }
    
}
