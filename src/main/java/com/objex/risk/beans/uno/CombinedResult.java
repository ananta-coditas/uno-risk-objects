/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import com.objex.risk.beans.claus.ClausResult;
import com.objex.risk.beans.tcuzick.TyrerResult;
import com.objex.risk.beans.gail.GailResult;
import com.objex.risk.beans.brca.BRCAResult;
import com.objex.risk.beans.premm.PREMMResult;
import com.objex.risk.beans.mmr.MMRResult;
import com.objex.risk.beans.nccn.NCCNResult;
import com.objex.risk.beans.panc.PancResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "CombinedResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class CombinedResult {
    @XmlElement(name = "ClausResult")
    private ClausResult clausResult = null;
    @XmlElement(name = "TyrerResult")
    private TyrerResult tyrerResult = null;
    @XmlElement(name = "GailResult")
    private GailResult gailResult = null;
    @XmlElement(name = "PREMMResult")
    private PREMMResult premmResult = null;
    @XmlElement(name = "BRCAResult")
    private BRCAResult brcaResult = null;
    @XmlElement(name = "MMRResult")
    private MMRResult mmrResult = null;
    @XmlElement(name = "PancResult")
    private PancResult pancResult = null;
    @XmlElement(name = "NCCNResult")
    private NCCNResult nccnResult = null;

    /**
     * @return the clausResult
     */
    public ClausResult getClausResult() {
        return clausResult;
    }

    /**
     * @param clausResult the clausResult to set
     */
    public void setClausResult(ClausResult clausResult) {
        this.clausResult = clausResult;
    }

    /**
     * @return the tyrerResult
     */
    public TyrerResult getTyrerResult() {
        return tyrerResult;
    }

    /**
     * @param tyrerResult the tyrerResult to set
     */
    public void setTyrerResult(TyrerResult tyrerResult) {
        this.tyrerResult = tyrerResult;
    }

    /**
     * @return the gailResult
     */
    public GailResult getGailResult() {
        return gailResult;
    }

    /**
     * @param gailResult the gailResult to set
     */
    public void setGailResult(GailResult gailResult) {
        this.gailResult = gailResult;
    }

    /**
     * @return the premmResult
     */
    public PREMMResult getPremmResult() {
        return premmResult;
    }

    /**
     * @param premmResult the premmResult to set
     */
    public void setPremmResult(PREMMResult premmResult) {
        this.premmResult = premmResult;
    }

    /**
     * @return the brcaResult
     */
    public BRCAResult getBrcaResult() {
        return brcaResult;
    }

    /**
     * @param brcaResult the brcaResult to set
     */
    public void setBrcaResult(BRCAResult brcaResult) {
        this.brcaResult = brcaResult;
    }

    /**
     * @return the mmrResult
     */
    public MMRResult getMmrResult() {
        return mmrResult;
    }

    /**
     * @param mmrResult the mmrResult to set
     */
    public void setMmrResult(MMRResult mmrResult) {
        this.mmrResult = mmrResult;
    }

    /**
     * @return the pancResult
     */
    public PancResult getPancResult() {
        return pancResult;
    }

    /**
     * @param pancResult the pancResult to set
     */
    public void setPancResult(PancResult pancResult) {
        this.pancResult = pancResult;
    }

    /**
     * @return the nccnResult
     */
    public NCCNResult getNccnResult() {
        return nccnResult;
    }

    /**
     * @param nccnResult the nccnResult to set
     */
    public void setNccnResult(NCCNResult nccnResult) {
        this.nccnResult = nccnResult;
    }
    
}
