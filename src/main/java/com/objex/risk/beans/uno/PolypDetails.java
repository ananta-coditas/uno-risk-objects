/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "PolypDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PolypDetails {
private String polypType    = null;            
private Integer numOfColorectalPolyps = null;            
private String OtherNumOfPolyps        = null;            

    /**
     * @return the polypType
     */
    public String getPolypType() {
        return polypType;
    }

    /**
     * @param polypType the polypType to set
     */
    public void setPolypType(String polypType) {
        this.polypType = polypType;
    }

    /**
     * @return the numOfColorectalPolyps
     */
    public Integer getNumOfColorectalPolyps() {
        return numOfColorectalPolyps;
    }

    /**
     * @param numOfColorectalPolyps the numOfColorectalPolyps to set
     */
    public void setNumOfColorectalPolyps(Integer numOfColorectalPolyps) {
        this.numOfColorectalPolyps = numOfColorectalPolyps;
    }

    /**
     * @return the OtherNumOfPolyps
     */
    public String getOtherNumOfPolyps() {
        return OtherNumOfPolyps;
    }

    /**
     * @param OtherNumOfPolyps the OtherNumOfPolyps to set
     */
    public void setOtherNumOfPolyps(String OtherNumOfPolyps) {
        this.OtherNumOfPolyps = OtherNumOfPolyps;
    }
}
