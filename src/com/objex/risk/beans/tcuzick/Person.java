/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.tcuzick;

import com.objex.risk.beans.AffectedType;
import static com.objex.risk.beans.Germline.BRCA1;
import static com.objex.risk.beans.Germline.BRCA2;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.tcuzick")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
    
    public enum HRTUse { NEVER(0),PRIOR_OUTSIDE_FIVE(1),PRIOR_WITHIN_FIVE(2),CURRENT(3);
          public int value;
          HRTUse(int code) {
              value = code;
          }
    }
    public enum HRTType { OESTROGEN(0),COMBINED(1);
          public int value;
          HRTType(int code) {
              value = code;
          }
    }
    
    public enum Ethnic  {nonAJ, AJ}
    public enum ParousType { Nulliparous(0),Parous(1),Unknown(2);
        public int value;
        ParousType(int code) {
            value = code;
        }
    };
     public enum MenosType { preMenopausal(0),periMenopausal(1),postMenopausal(2),Unknown(3);
        public int value;
        MenosType(int code) {
            value = code;
        }
    };
    
    private boolean performedBiopsy  = false;
    private Integer biopsyCount = 0;  
    private Integer menarcheAge = -99;
    private Integer menopauseAge = 0;
    private MenosType menostat = MenosType.Unknown;
    private Double height = -99d; //meters
    private Double weight = -99d; //kgs
    private Boolean hasLiveBirth = null;
    private Integer liveBirthAge = -99;
    private boolean hasHyperplasia = false;
    private boolean hasAtypicalHyperplasia = false;
    private boolean hasLCIS = false;
    private Ethnic ethnic     =  Ethnic.nonAJ;
    private AffectedType affectedBreastType = AffectedType.NONE;
    private AffectedType affectedOvarianType = AffectedType.NONE;
    private AffectedType affectedBilateralBreastType = AffectedType.NONE;
    private Integer diagnoseOvarianAge     = 0;
    private Integer diagnoseBreastAge     = 0;
    private Integer diagnoseBilateralBreastAge     = 0;
    private HRTUse usedHRT = HRTUse.NEVER;
    private HRTType hrtType = null;
    private Double yearsPastHRT = 0d;
    private Double yearsFutureHRT = 0d;
    private Double yearsSinceHRT = 0d;
    
    public Person() {
    }
    
    @Override
    protected List<String> germLines() {
        return Arrays.asList(BRCA1,BRCA2);
    }
    
    public AffectedType getAffectedBreastType() {
        return affectedBreastType;
    }

    public Integer getBiopsyCount() {
        return biopsyCount;
    }

    public Double getHeight() {
        return height;
    }

    public HRTType getHrtType() {
        return hrtType;
    }

    public HRTUse getUsedHRT() {
        return usedHRT;
    }

    public Integer getLiveBirthAge() {
        return liveBirthAge;
    }

    public Integer getMenarcheAge() {
        return menarcheAge;
    }

    public Integer getMenopauseAge() {
        if (getMenostat() == MenosType.preMenopausal || getMenostat() == MenosType.periMenopausal || getMenostat() == MenosType.Unknown) {
            return -99;
        } else if (getMenostat() == MenosType.postMenopausal && getMenopauseAge() == 0) {
            return 50;
        }
        return menopauseAge;
    }

    public MenosType getMenostat() {
        return menostat;
    }

    public ParousType getParous() {
       ParousType parous =  ParousType.Nulliparous;
        if (hasLiveBirth == null) {
            parous =  ParousType.Unknown;
        } else if (hasLiveBirth) {
             parous =  ParousType.Parous;
        }
        
       return parous;
    }

    public Ethnic getEthnic() {
        return ethnic;
    }

    public Double getWeight() {
        return weight;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getDiagnoseOvarianAge() {
         if (diagnoseOvarianAge == 0) {
            return -99;
        }
        return diagnoseOvarianAge;
    }
    
    public Integer getDiagnoseBreastAge() {
      if (diagnoseBreastAge == 0 || diagnoseBreastAge == -99) {
          if (getAge() == 0) {
              if (getAgeOfDeath() == 0) {
                  return -99;
              } else {
                  return getAgeOfDeath();
              }
          } else {
            return getAge();
          }
      }
      return diagnoseBreastAge;
    }
    
    public Integer getDiagnoseBilateralBreastAge() {
         if (diagnoseBilateralBreastAge == 0) {
            return -99;
        }
        return diagnoseBilateralBreastAge;
    }

    public Double getYearsFutureHRT() {
        return yearsFutureHRT;
    }

    public Double getYearsPastHRT() {
        return yearsPastHRT;
    }

    public Double getYearsSinceHRT() {
        return yearsSinceHRT;
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

    public void setDiagnoseBreastAge(Integer diagnoseBreastAge) {
             this.diagnoseBreastAge = toInt(diagnoseBreastAge);
    }
    
    public void setDiagnoseBilateralBreastAge(Integer diagnoseBilateralBreastAge) {
             this.diagnoseBilateralBreastAge = toInt(diagnoseBilateralBreastAge);
    }
     
    public boolean isPerformedBiopsy() {
        return performedBiopsy;
    }
    
    public boolean getHasHyperplasia() {
        return hasHyperplasia;
    }
    
    public boolean getHasAtypicalHyperplasia() {
        return hasAtypicalHyperplasia;
    }
    
    public void setHasAtypicalHyperplasia(boolean hasAtyp) {
        hasAtypicalHyperplasia = hasAtyp;
    }
    
    public void setHasLCIS(boolean hasLCIS) {
        this.hasLCIS = hasLCIS;
    }
    
    public boolean getHasLCIS() {
        return hasLCIS;
    }

    public void setAffectedBreastType(AffectedType affectedBreastType) {
        if (affectedBreastType == null) {
            this.affectedBreastType = AffectedType.NONE;
        } else {
            this.affectedBreastType = affectedBreastType;
        }
    }
    
     public void setAffectedBreastType(Integer affectedBreastType) {
        setAffectedBreastType(AffectedType.toAffectedType(affectedBreastType));
    }
     
      public void setAffectedBilateralBreastType(AffectedType affectedBilateralBreastType) {
        if (affectedBilateralBreastType == null) {
            this.affectedBilateralBreastType = AffectedType.NONE;
        } else {
            this.affectedBilateralBreastType = affectedBilateralBreastType;
        }
    }
    
     public void setAffectedBilateralBreastType(Integer affectedBilateralBreastType) {
        setAffectedBilateralBreastType(AffectedType.toAffectedType(affectedBilateralBreastType));
    }
     
    public AffectedType getAffectedOvarianType() {
        return affectedOvarianType;
    }
    
    public AffectedType getAffectedBilateralBreastType() {
        return affectedBilateralBreastType;
    }
     
    public void setAffectedOvarianType(AffectedType affectedOvarianType) {
        if (affectedOvarianType == null) {
            this.affectedOvarianType = AffectedType.NONE;
        } else {
            this.affectedOvarianType = affectedOvarianType;
        }
    }
    
     public void setAffectedOvarianType(Integer affectedOvarianType) {
        setAffectedOvarianType(AffectedType.toAffectedType(affectedOvarianType));
    }

    public void setBiopsyCount(Integer biopsyCount) {
        this.biopsyCount = biopsyCount;
    }

    public void setHasHyperplasia(boolean hasHyperplasia) {
        this.hasHyperplasia = hasHyperplasia;
    }

    public void setHasLiveBirth(boolean hasLiveBirth) {
        this.hasLiveBirth = hasLiveBirth;
    }
    
    public boolean getHasLiveBirth() {
        return hasLiveBirth;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setHrtType(HRTType hrtType) {
        this.hrtType = hrtType;
    }

    public void setUsedHRT(HRTUse hrtUse) {
        this.usedHRT = hrtUse;
    }

    public void setLiveBirthAge(Integer liveBirthAge) {
        this.liveBirthAge = liveBirthAge;
    }

    public void setMenarcheAge(Integer menarcheAge) {
        this.menarcheAge = menarcheAge;
    }

    public void setMenopauseAge(Integer menopauseAge) {
        this.menopauseAge = menopauseAge;
    }

    public void setMenostat(MenosType menostat) {
        this.menostat = menostat;
    }
    
    public void setPerformedBiopsy(boolean biopsy) {
        this.performedBiopsy = biopsy;
    }
    
    public void setEthnic(Ethnic ethnic) {
        this.ethnic = ethnic;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setYearsFutureHRT(Double yearsFutureHRT) {
        this.yearsFutureHRT = yearsFutureHRT;
    }

    public void setYearsPastHRT(Double yearsPastHRT) {
        this.yearsPastHRT = yearsPastHRT;
    }

    public void setYearsSinceHRT(Double yearsSinceHRT) {
        this.yearsSinceHRT = yearsSinceHRT;
    }
   
}
