/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mmr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.mmr")
@XmlRootElement(name = "Marker")
public class Marker implements Cloneable, Serializable  {
    public enum MSIType {HIGH_INSTABILITY(1),LOW_INSTABILITY(2),NONE(0);
         public int value = 0;
         MSIType(int value) {
             this.value = value;
         }
    }
    public enum TumorLoc {PROXIMAL(1),DISTAL(2),UNKNOWN(0);
         public int value = 0;
         TumorLoc(int value) {
             this.value = value;
         }
    }    
    private MSIType msi = MSIType.NONE;
    private TumorLoc location = TumorLoc.UNKNOWN;
    private Integer id            = null;
    private String transId = null;

    public Integer getId() {
        return id;
    }

    public MSIType getMsi() {
        return msi;
    }

    public String getTransId() {
        return transId;
    }
    
    

    public void setId(Integer Id) {
        id = Id;
    }

    public void setMsi(MSIType msi) {
        this.msi = msi;
    }

    public TumorLoc getLocation() {
        return location;
    }

    public void setLocation(TumorLoc location) {
        this.location = location;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }
    
    
}
