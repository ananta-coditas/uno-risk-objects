/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans.brca;

import javax.xml.bind.annotation.XmlRootElement;
import com.objex.risk.beans.TestResult;
import static com.objex.risk.beans.TestResult.NONE;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jason
 */
@XmlType(namespace="com.objex.risk.beans.brca")
@XmlRootElement(name = "Marker")
public class Marker implements Cloneable  {
    
private TestResult er      = NONE;
private TestResult ck14    = NONE;
private TestResult ck5_6   = NONE;
private TestResult pr      = NONE;
private TestResult her2    = NONE;

    @XmlElement(name = "er")
    public TestResult getER() {
        return er;
    }

    public void setER(TestResult ER) {
        if (ER != null)
            this.er = ER;
    }
    @XmlElement(name = "ck14")
    public TestResult getCK14() {
        return ck14;
    }

    public void setCK14(TestResult CK14) {
        if (CK14 != null)
         this.ck14 = CK14;
    }
    @XmlElement(name = "ck5_6")
    public TestResult getCK5_6() {
        return ck5_6;
    }

    public void setCK5_6(TestResult CK5_6) {
        if (CK5_6 != null)
        this.ck5_6 = CK5_6;
    }
    @XmlElement(name = "pr")
    public TestResult getPR() {
        return pr;
    }

    public void setPR(TestResult PR) {
        if (PR != null)
        this.pr = PR;
    }
    @XmlElement(name = "her2")
    public TestResult getHER2() {
        return her2;
    }

    public void setHER2(TestResult HER2) {
        if (HER2 != null)
        this.her2 = HER2;
    }
    
}
