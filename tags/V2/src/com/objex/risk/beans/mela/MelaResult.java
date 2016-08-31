/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mela;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "MelaResult")
public class MelaResult extends BaseResult {
    protected static final Map<String,String> columnToFields = new HashMap<>();
    public static final String MELANOMA_RISK = "melanomaRisk";
    public static final String MELAPRO = "MELAPRO";
   static {
        columnToFields.put("Melanoma Risk",  MELANOMA_RISK);
    };

    @Override
    public Map<String, String> getColumnToFields() {
       return  columnToFields;
    }

    @Override
    public String getModel() {
       return MELAPRO;
    }
    
}
