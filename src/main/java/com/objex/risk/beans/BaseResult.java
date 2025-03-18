/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import com.objex.risk.beans.brca.BRCAResult;
import com.objex.risk.beans.charts.ChartResult;
import com.objex.risk.beans.claus.ClausResult;
import com.objex.risk.beans.gail.GailResult;
import com.objex.risk.beans.mela.MelaResult;
import com.objex.risk.beans.mmr.MMRResult;
import com.objex.risk.beans.panc.PancResult;
import com.objex.risk.beans.premm.PREMMResult;
import com.objex.risk.beans.tcuzick.TyrerResult;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


/**
 *
 * @author jason
 * */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "model", visible = true)
//You have to list all sub-types of this class here
@JsonSubTypes({
   
   @JsonSubTypes.Type(name = "CLAUS", value = ClausResult.class),
   @JsonSubTypes.Type(name = "GAIL", value = GailResult.class),
   @JsonSubTypes.Type(name = "PREMM", value = PREMMResult.class),
   @JsonSubTypes.Type(name = "TYRER", value = TyrerResult.class),
   @JsonSubTypes.Type(name = "BRCAPRO", value = BRCAResult.class),
   @JsonSubTypes.Type(name = "MMRPRO", value = MMRResult.class),
   @JsonSubTypes.Type(name = "PANCPRO", value = PancResult.class),
   @JsonSubTypes.Type(name = "MELAPRO", value = MelaResult.class),
   @JsonSubTypes.Type(name = "CHARTRESULT", value = ChartResult.class)
   
})
@XmlSeeAlso({TyrerResult.class,GailResult.class,ChartResult.class,MMRResult.class,BRCAResult.class,PancResult.class,MelaResult.class,PREMMResult.class,ClausResult.class})
public abstract class BaseResult {
    @XmlElement(name="Prediction")
    private List<Prediction>  predictions = new ArrayList<Prediction>();
    protected Double probabilityCarrier = null;
    protected String version = "";
    private String transId = null;
    private Integer chartCode = null;
    private String encodedChart = null;
    
    @XmlElement(name="Error")
    private List<RiskError> errors = new ArrayList();
           
    public Prediction addPrediction() {
        Prediction prediction = new Prediction();
        init(prediction);
        predictions.add(prediction);
        return prediction;
    }
    public void addProbability(String name, Double prob) {
        if ("Pr(Being a carrier)".equals(name)) {
           setProbabilityCarrier(prob);
        }
    }

    public String getTransId() {
        return transId;
    }
    
    

    public String getVersion() {
        return version;
    }
    protected  void init(Prediction pred) {
        pred.setColumnMappings(getColumnToFields());
    }
    public void remove(Prediction prediction) {
        predictions.remove(prediction);
    }
   
    public List<Prediction> getPredictions() {
        return predictions;
    }
    public Double getProbabilityCarrier() {
        return probabilityCarrier;
    }
    public abstract String getModel();
    public void setProbabilityCarrier(Double percentCarrier) {
        this.probabilityCarrier = percentCarrier;
    }
    public Double getFirstResult(String predName) {
        if (!predictions.isEmpty()){
          return  predictions.get(0).getResult(predName);
        }
        return 0d;
    }
    public Double getLastResult(String predName) {
        if (!predictions.isEmpty()){
           return predictions.get(predictions.size() - 1).getResult(predName);
        }
        return 0d;
    }

    public abstract Map<String, String> getColumnToFields();

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public void setVersion(String version) {
        this.version = version;
    } 
    
    public void addError(RiskError error) {
        errors.add(error);
    }
    public boolean hasErrors() {
        return !errors.isEmpty();
    }
    
    public List<RiskError> getErrors() {
        return errors;
    }

    /**
     * @return the chartCode
     */
    public Integer getChartCode() {
        return chartCode;
    }

    /**
     * @param chartCode the chartCode to set
     */
    public void setChartCode(Integer chartCode) {
        this.chartCode = chartCode;
    }

    /**
     * @return the chartImage
     */
    public String getEncodedChart() {
        return encodedChart;
    }

    /**
     * @param chartImage the chartImage to set as base64
     */
    public void setEncodedChart(String chartImage) {
        this.encodedChart = chartImage;
    }
    /**
     * 
     * @return 
     */
     @XmlTransient
     public byte[] getChart() {
        return Base64.getDecoder().decode(encodedChart);
    }
    
     public void setChart(byte[] chart) {
        if (chart == null) {
            setEncodedChart(null);
        } else {
            setEncodedChart(Base64.getEncoder().encodeToString(chart));
        }
    }
}
