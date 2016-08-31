/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.brca;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import static com.objex.risk.beans.Germline.*;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.brca")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    @XmlType(namespace="com.objex.risk.beans.brca.Person.Ethnic")
    public enum Ethnic  {nonAJ, AJ, Italian, Other, NA }
    private Integer affectedBreastType       = 0;
    private Integer affectedOvarianType      = 0;
    private Integer diagnoseBreastAge     = 0;
    private Integer diagnoseOvarianAge     = 0;
    private Integer diagnoseBreastContralateralAge     = 0;
    private Integer twin      = 0; 
    private Ethnic ethnic     =  Ethnic.nonAJ;
    
    private boolean performedMasectomy  = false;
    private Integer ageMasectomy = 1;
    
    private boolean performedOophorectomy  = false;
    private Integer ageOophorectomy = 1;
    
    private Marker marker = null;
    
    public Person() {
    }

    public boolean isPerformedMasectomy() {
        return performedMasectomy;
    }
    @Override
    protected List<String> germLines() {
        return Arrays.asList(BRCA1,BRCA2);
    }

    public void setPerformedMasectomy(boolean performedMasectomy) {
        this.performedMasectomy = performedMasectomy;
    }

    public Integer getAgeMasectomy() {
        return ageMasectomy;
    }

    public void setAgeMasectomy(Integer ageMasectomy) {
        this.ageMasectomy = ageMasectomy;
    }

    public boolean isPerformedOophorectomy() {
        return performedOophorectomy;
    }

    public void setPerformedOophorectomy(boolean performedOophorectomy) {
        this.performedOophorectomy = performedOophorectomy;
    }

    public Integer getAgeOophorectomy() {
        return ageOophorectomy;
    }

    public void setAgeOophorectomy(Integer ageOophorectomy) {
        this.ageOophorectomy = ageOophorectomy;
    }
    
    public Integer getAffectedBreastType() {
        return affectedBreastType;
    }
    /**
     * Breast cancer status (0=no cancer of no information, 1=breast cancer,one 
     * breast involved; 2=bilateral breast cancer)
     * @param breastCancerType 
     */
    public void setAffectedBreastType(Integer breastCancerType) {
        this.affectedBreastType = toInt(breastCancerType);
    }

    public Integer getAffectedOvarianType() {
        return affectedOvarianType;
    }
    /**
     * Ovarian cancer status (0=no cancer, 1=ovarian cancer)
     * @param ovarianCancerType 
     */
    public void setAffectedOvarianType(Integer ovarianCancerType) {
        this.affectedOvarianType = toInt(ovarianCancerType);
    }

    public Integer getDiagnoseBreastAge() {
        if (diagnoseBreastAge == 0 && getAffectedBreastType() == 0) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnoseBreastAge;
    }
    /**
     *  Age of onset of breast cancer if a breast cancer case.
        Current age or age of death if not a breast cancer case.
        1 if unaffected and there is no age information. 
     * @param diagnoseBreastAge 
     */
    public void setDiagnoseBreastAge(Integer diagnoseBreastAge) {
       
            this.diagnoseBreastAge = toInt(diagnoseBreastAge);
    }
    /**
     * 
     * @return 
     */
    public Integer getDiagnoseOvarianAge() {
         if (diagnoseOvarianAge == 0 && getAffectedOvarianType() == 0) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnoseOvarianAge;
    }
    /**
     * Age of onset of ovarian cancer if an ovarian cancer case.  Current age or 
     * age of death if not an ovarian cancer case. 1 if unaffected and there is 
     * no age information.
     * @param diagnoseOvarianAge 
     */
    public void setDiagnoseOvarianAge(Integer diagnoseOvarianAge) {
             this.diagnoseOvarianAge = toInt(diagnoseOvarianAge);
    }
    /**
     * 
     * @return 
     */
    public Integer getDiagnoseBreastContralateralAge() {
        return diagnoseBreastContralateralAge;
    }
    /**
     * Age at onset of breast cancer, second breast. Only for members with breast 
     * cancer status=2. For the rest enter a 0.
     * @param diagnoseBreastContralateralAge 
     */
    public void setDiagnoseBreastContralateralAge(Integer diagnoseBreastContralateralAge) {
        this.diagnoseBreastContralateralAge = toInt(diagnoseBreastContralateralAge);
    }

    public Integer getTwin() {
        return twin;
    }

    public void setTwin(Integer twin) {
        this.twin = twin;
    }

    public Ethnic getEthnic() {
        return ethnic;
    }

    public void setEthnic(Ethnic ethnic) {
        this.ethnic = ethnic;
    }
    @XmlElement(name="Marker")
    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }
    
    
}
