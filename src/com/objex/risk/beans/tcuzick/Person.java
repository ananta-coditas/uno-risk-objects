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
    public enum HRTType { ESTROGEN(0),OESTROGEN(0),COMBINED(1);
          public int value;
          HRTType(int code) {
              value = code;
          }
    }
    @XmlType(namespace="com.objex.risk.beans.tcuzick.Person.Ethnic")
    public enum Ethnic  {nonAJ, AJ}
    public enum ParousType { Nulliparous(0),Parous(1),Unknown(2);
        public int value;
        ParousType(int code) {
            value = code;
        }
    };
    public enum HyperplasiaType { NONE(0),TYPICAL(1),BENIGN_DISEASE(2);
        public int value;
        HyperplasiaType(int code) {
            value = code;
        }
    };
     public enum MenosType { preMenopausal(0),periMenopausal(1),postMenopausal(2),Unknown(3);
        public int value;
        MenosType(int code) {
            value = code;
        }
    };
    
   
    private Integer menarcheAge = -99;
    private Integer menopauseAge = -99;
    private MenosType menostat = MenosType.Unknown;
    private Double height = -99d; //meters
    private Double weight = -99d; //kgs
    private Boolean hasLiveBirth = null;
    private Integer liveBirthAge = -99;
    private HyperplasiaType hyperplasia = HyperplasiaType.NONE;
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
        } else if (getMenostat() == MenosType.postMenopausal && menopauseAge == 0) {
            return -99;  //50;  50 matches the spec but not the implementation
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
          if (getAge() != 0  && !getAffectedBreastType().isAffected()) {
              return getAge();
          } else {
              return -99;
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
              if (this.diagnoseOvarianAge == 1) { //this allows it to use same fields as bayes which sets 1 for empty
                 this.diagnoseOvarianAge = 0;   
             }
    }

    public void setDiagnoseBreastAge(Integer diagnoseBreastAge) {
             this.diagnoseBreastAge = toInt(diagnoseBreastAge);
             if (this.diagnoseBreastAge == 1) { //this allows it to use same fields as bayes
                 this.diagnoseBreastAge = 0;   
             }
    }
    
    public void setDiagnoseBilateralBreastAge(Integer diagnoseBilateralBreastAge) {
             this.diagnoseBilateralBreastAge = toInt(diagnoseBilateralBreastAge);
             if (this.diagnoseBilateralBreastAge == 1) { //this allows it to use same fields as bayes
                 this.diagnoseBilateralBreastAge = 0;   
             }
    }
     
    public HyperplasiaType getHyperplasia() {
        return hyperplasia;
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


    public void setHyperplasia(HyperplasiaType hyperplasia) {
        if (hyperplasia == null) {
            this.hyperplasia = HyperplasiaType.NONE;
        } else {
            this.hyperplasia = hyperplasia;
        }
    }

    public void setHasLiveBirth(boolean hasLiveBirth) {
        this.hasLiveBirth = hasLiveBirth;
    }
    
    /**
     * return false if no known live birth
     * @return 
     */
    
    public boolean getHasLiveBirth() {
        if (hasLiveBirth == null) {
            return false;
        }
        return hasLiveBirth;
    }

    public void setHeight(Double height) {
        if (height != null && height != 0) {
            this.height = height;
        } else {
            this.height = -99d;
        }
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
         if (menarcheAge == null) {
            this.menarcheAge = -99;
        } else {
             this.menarcheAge = menarcheAge;
        }
       
        
    }

    public void setMenopauseAge(Integer menopauseAge) {
        if (menopauseAge == null || menopauseAge == 0) {
            this.menopauseAge = -99;
        } else {
             this.menopauseAge = menopauseAge;
        }
       
    }

    public void setMenostat(MenosType menostat) {
        this.menostat = menostat;
    }
    
    public void setEthnic(Ethnic ethnic) {
        this.ethnic = ethnic;
    }

    public void setWeight(Double weight) {
        if (weight != null && weight != 0) {
            this.weight = weight;
        } else {
            this.weight = -99d;
        }
    }
    
    public void setWeight(String val) {
        try {
            setWeight(Double.parseDouble(val));
        } catch (Exception e) {
            setWeight(0d);
        }
    }
    
    public void setHeight(String val) {
        try {
            setHeight(Double.parseDouble(val));
        } catch (Exception e) {
            setHeight(0d);
        }
    }
    

    public void setYearsFutureHRT(Double years) {
          if (years != null) {
            this.yearsFutureHRT = years;
        } else {
            this.yearsFutureHRT = 0d;
        }
    }

    public void setYearsPastHRT(Double years) {
        if (years != null) {
            this.yearsPastHRT = years;
        } else {
            this.yearsPastHRT = 0d;
        }
    }

    public void setYearsSinceHRT(Double years) {
        if (years != null) {
            this.yearsSinceHRT = years;
        } else {
            this.yearsSinceHRT = 0d;
        }
    }
   
}
