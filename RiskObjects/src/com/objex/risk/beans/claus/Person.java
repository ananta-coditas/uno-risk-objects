/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.claus;

import com.objex.risk.beans.AffectedType;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.claus")
@XmlRootElement(name = "Person")
public class Person extends com.objex.risk.beans.BasePerson {
   
    private AffectedType affectedBreastType = AffectedType.NONE;
    private AffectedType affectedOvarianType  = AffectedType.NONE;
    private Integer diagnoseBreastAge     = 0;
    private Integer diagnoseOvarianAge     = 0;
    
    public Person() {
    }

    @Override
    protected List<String> germLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AffectedType getAffectedBreastType() {
        return affectedBreastType;
    }
    

    public AffectedType getAffectedOvarianType() {
        return affectedOvarianType;
    }

    public Integer getDiagnoseOvarianAge() {
        return diagnoseOvarianAge;
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
    
    /**
     *  Age of onset of breast cancer if a breast cancer case.
        Current age or age of death if not a breast cancer case.
        1 if unaffected and there is no age information. 
     * @param diagnoseBreastAge 
     */
    public void setDiagnoseBreastAge(Integer diagnoseBreastAge) {
       
            this.diagnoseBreastAge = toInt(diagnoseBreastAge);
    }
    
     public Integer getDiagnoseBreastAge() {
        if (diagnoseBreastAge == 0 && getAffectedBreastType() == AffectedType.NONE) {
            if (getAgeOfDeath() == 0) {
                return getAge();
            }
            return getAgeOfDeath();
        }
        return diagnoseBreastAge;
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
     
}
