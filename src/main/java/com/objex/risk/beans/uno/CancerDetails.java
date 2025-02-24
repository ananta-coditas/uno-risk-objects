/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import com.objex.risk.beans.AffectedType;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "CancerDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class CancerDetails {
	private AffectedType contralateral    = null;
    private String contralateralAge = null;
    private AffectedType bilateral = null;
    private String bilateralAge = null;
    private String metastatic = null;
    private String breastMultiplePrimaries = null;
    private List<BreastCancerType> breastCancerTypes = null;
    private String breastTrippleNegative = null;
    private String prostateGleasonScore = null;
    private String prostateRiskGroup = null;

    /**
     * @return the contralateral
     */
    public AffectedType getContralateral() {
        return contralateral;
    }

    /**
     * @param contralateral the contralateral to set
     */
    public void setContralateral(AffectedType contralateral) {
        this.contralateral = contralateral;
    }
    /**
     * @return the contralateralAge
     */
    public String getContralateralAge() {
        return contralateralAge;
    }

    /**
     * @param contralateralAge the contralateralAge to set
     */
    public void setContralateralAge(String contralateralAge) {
        this.contralateralAge = contralateralAge;
    }

    /**
     * @return the bilateral
     */
    public AffectedType getBilateral() {
        return bilateral;
    }

    /**
     * @param bilateral the bilateral to set
     */
    public void setBilateral(AffectedType bilateral) {
        this.bilateral = bilateral;
    }

    /**
     * @return the bilateralAge
     */
    public String getBilateralAge() {
        return bilateralAge;
    }

    /**
     * @param bilateralAge the bilateralAge to set
     */
    public void setBilateralAge(String bilateralAge) {
        this.bilateralAge = bilateralAge;
    }

    /**
     * @return the metastatic
     */
    public String getMetastatic() {
        return metastatic;
    }

    /**
     * @param metastatic the metastatic to set
     */
    public void setMetastatic(String metastatic) {
        this.metastatic = metastatic;
    }

    /**
     * @return the breastMultiplePrimaries
     */
    public String getBreastMultiplePrimaries() {
        return breastMultiplePrimaries;
    }

    /**
     * @param breastMultiplePrimaries the breastMultiplePrimaries to set
     */
    public void setBreastMultiplePrimaries(String breastMultiplePrimaries) {
        this.breastMultiplePrimaries = breastMultiplePrimaries;
    }

    public List<BreastCancerType> getBreastCancerTypes() {
        return breastCancerTypes;
    }

    public void setBreastCancerTypes( List<BreastCancerType> breastCancerType) {
        this.breastCancerTypes = breastCancerType;
    }

    /**
     * @return the prostateGleasonScore
     */
    public String getProstateGleasonScore() {
        return prostateGleasonScore;
    }

    /**
     * @param prostateGleasonScore the prostateGleasonScore to set
     */
    public void setProstateGleasonScore(String prostateGleasonScore) {
        this.prostateGleasonScore = prostateGleasonScore;
    }

    /**
     * @return the prostateRiskGroup
     */
    public String getProstateRiskGroup() {
        return prostateRiskGroup;
    }

    /**
     * @param prostateRiskGroup the prostateRiskGroup to set
     */
    public void setProstateRiskGroup(String prostateRiskGroup) {
        this.prostateRiskGroup = prostateRiskGroup;
    }

    public String getBreastTrippleNegative() {
        return breastTrippleNegative;
    }

    public void setBreastTrippleNegative(String breastTrippleNegative) {
        this.breastTrippleNegative = breastTrippleNegative;
    }
}

