/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.tcuzick;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "TyrerResult")
public class TyrerResult extends BaseResult {

    public static final String TYRER = "TYRER";
    
    protected static final Map<String,String> columnToFields = new HashMap<>();
    private Double probabilityMutationBRCA1;
    private Double probabilityMutationBRCA2;
    private Double probabilityMutationBoth;
 
    @Override
    public Map<String, String> getColumnToFields() {
       return  columnToFields;
    }

    @Override
    public String getModel() {
        return TYRER;
    }
    
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

    public Double getProbabilityMutationBoth() {
        return probabilityMutationBoth;
    }

    public void setProbabilityMutationBoth(Double probabilityMutationBoth) {
        this.probabilityMutationBoth = probabilityMutationBoth;
    }
           
    
}
