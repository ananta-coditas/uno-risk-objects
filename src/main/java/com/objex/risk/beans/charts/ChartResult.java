/*
 */
package com.objex.risk.beans.charts;

import com.objex.risk.beans.BaseResult;
import java.util.HashMap;
import java.util.Map;

/**
 * This result class exists only to wrap a returned chart.
 * @author jward
 */
public class ChartResult extends BaseResult {
   
    
    protected static final Map<String,String> columnToFields = new HashMap<>();
    
    private String context = null;

    @Override
    public String getModel() {
        return "CHARTRESULT";
    }

    @Override
    public Map<String, String> getColumnToFields() {
        return columnToFields;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }
    
}
