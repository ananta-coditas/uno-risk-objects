/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "Cancer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cancer {
	public Cancer() {
		
	}
	public Cancer(CancerType type, Integer affected, Integer diagnoseAge) {
		setCancerType(type);
		setAffected(affected);
		setDiagnoseAge(diagnoseAge);
	}

    public enum CancerType {

        BREAST(""), OVARIAN(""), COLORECTAL(""), ENDOMETRIAL(""), NA(""), Gastric(""), Uterine(""), SmallIntestine(""),
        Fallopian(""), Biliary(""), Ureter(""), DESMOIDS(""), Blood(""), PRELEUKEMIA(""), LEUKEMIA(""), LYMPHOMA(""),
        Fallopian_Tube("Fallopian Tube"), SEBACEOUS_CARCINOMA("Sebaceous Carcinoma"),
        SEBACEOUS_ADENOMAS("Sebaceous_adenomas"), SKIN("SKIN"), PREMMRELATED("Related"),PANCREATIC("pancratic"),
        PROSTATE(""), BILIARY_TRACT(""), KIDNEY(""), BRAIN(""), SEBACEOUS_ADENOMA(""), MELANOMA(""), 
        GALLBLADDER(""), CERVICAL(""), BLADDER(""), THROAT(""), THYROID(""), ORAL(""), LIVER(""), TESTICULAR(""), 
        PARAGANGLIOMA(""), PHEOCHROMOCYTOMA(""), LUNG(""), SARCOMA("");

        String description;

        CancerType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private CancerType cancerType = null;
    private Integer diagnoseAge = 0;
    private Integer affected = 0;
    @XmlElement(name = "CancerDetails")
    private CancerDetails cancerDetails = null;

    /**
     * @return the CancerType
     */
    public CancerType getCancerType() {
        return cancerType;
    }

    /**
     * @param cancerType the CancerType to set
     */
    public void setCancerType(CancerType cancerType) {
        this.cancerType = cancerType;
    }

    /**
     * @return the diagnoseAge
     */
    public Integer getDiagnoseAge() {
        return diagnoseAge;
    }

    /**
     * @param diagnoseAge the diagnoseAge to set
     */
    public void setDiagnoseAge(Integer diagnoseAge) {
        this.diagnoseAge = diagnoseAge;
    }

    /**
     * @return the affected
     */
    public Integer getAffected() {
        return affected;
    }

    /**
     * @param affected the affected to set
     */
    public void setAffected(Integer affected) {
        this.affected = affected;
    }

    /**
     * @return the cancerDetails
     */
    public CancerDetails getCancerDetails() {
        return cancerDetails;
    }

    /**
     * @param cancerDetails the cancerDetails to set
     */
    public void setCancerDetails(CancerDetails cancerDetails) {
        this.cancerDetails = cancerDetails;
    }

}
