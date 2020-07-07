/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.brca;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "BRCAResult")
public class BRCAResult extends BaseResult {
    
   private Double probabilityMutationBRCA1 = null;
   private Double probabilityMutationBRCA2 = null;
   public static final String BRCAPRO = "BRCAPRO";
   public static final String BREAST_RISK =  "breastRisk";
   public static final String OVARIAN_RISK = "ovarianRisk";
   
   protected static final Map<String,String> columnToFields = new HashMap<>();
   static {
        columnToFields.put("Contralateral Breast Ca Risk", "breastRisk");
        columnToFields.put("Ovarian Ca Risk", "ovarianRisk");
        columnToFields.put("Breast Ca Risk", "breastRisk");
    };
 
    public Double getProbabilityMutationBRCA1() {
        return probabilityMutationBRCA1;
    }

    public void setProbabilityMutationBRCA1(Double probabilityMutationBRCA1) {
        this.probabilityMutationBRCA1 = probabilityMutationBRCA1;
    }

    public Double getProbabilityMutationBRCA2() {
        return probabilityMutationBRCA2;
    }

    public void setProbabilityMutationBRCA2(Double probabilityMutationBRCA2) {
        this.probabilityMutationBRCA2 = probabilityMutationBRCA2;
    }

    @Override
    public void addProbability(String name, Double prob) {
        super.addProbability(name, prob);
        if ("Pr(BRCA1 mutation)".equals(name)) {
            setProbabilityMutationBRCA1(prob);
        }
        else if ("Pr(BRCA2 mutation)".equals(name)) {
            setProbabilityMutationBRCA2(prob);
        }
        /*else if ("Pr(Both genes mutated)".equals(name)) {
            setProbabilityCarrier(prob);
        } */
    }

    @Override
    public Map<String, String> getColumnToFields() {
       return columnToFields;
    }

    @Override
    public String getModel() {
        return BRCAPRO;
    }
}
