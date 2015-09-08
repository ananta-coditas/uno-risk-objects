/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objex.risk.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author jason
 * */
public abstract class BaseResult {
    @XmlElement(name="Prediction")
    private List<Prediction>  predictions = new ArrayList<Prediction>();
    protected Double probabilityCarrier = null;
           
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
}
