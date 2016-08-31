/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.panc;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "PancResult")
public class PancResult extends BaseResult {
    public static final String PANCPRO = "PANCPRO";
    protected static final Map<String,String> columnToFields = new HashMap<>();
    public static final String PANCREATIC_RISK = "pancreaticRisk";
   static {
        columnToFields.put("Pancreatic Ca Risk",  PANCREATIC_RISK);
    };

    @Override
    public Map<String, String> getColumnToFields() {
       return  columnToFields;
    }

    @Override
    public String getModel() {
        return PANCPRO;
    }
    
}
