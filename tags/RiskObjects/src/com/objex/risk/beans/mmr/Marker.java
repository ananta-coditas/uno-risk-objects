/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.mmr;

import javax.xml.bind.annotation.XmlRootElement;
import static com.objex.risk.beans.TestResult.NONE;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.mmr")
@XmlRootElement(name = "Marker")
public class Marker implements Cloneable  {
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

    public MSIType getMsi() {
        return msi;
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

    
}
