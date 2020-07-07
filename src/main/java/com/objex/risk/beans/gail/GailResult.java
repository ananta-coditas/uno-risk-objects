/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.gail;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@XmlRootElement(name = "GailResult")
public class GailResult extends BaseResult {

    public static final String GAIL = "GAIL";
    
    protected static final Map<String,String> columnToFields = new HashMap<>();
 
    @Override
    public Map<String, String> getColumnToFields() {
       return  columnToFields;
    }

    @Override
    public String getModel() {
        return GAIL;
    }
    
}
