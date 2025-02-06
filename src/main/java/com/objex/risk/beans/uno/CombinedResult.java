/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.objex.risk.beans.BaseResult;
import com.objex.risk.beans.uno.Model.ModelName;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "CombinedResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class CombinedResult {
    private Map<ModelName, BaseResult> results;

    public Map<ModelName, BaseResult> getResults() {
        return results;
    }

    public void setResults(Map<ModelName, BaseResult> results) {
        this.results = results;
    }
    
    public void addModelResult(ModelName modelName, BaseResult baseResult) {
        results.put(modelName, baseResult);
    }
}
