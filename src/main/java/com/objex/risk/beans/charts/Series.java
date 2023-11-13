/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.charts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;


/**
 *  This type wraps related data on a graph
 * @author jward
 */
public class Series {

    private String name = null;
    private String label = null;
    private String primaryColor = null;
    @XmlElement(name="DataPoint")
    private List<DataPoint> dataPoints = new ArrayList<>();
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the primaryColor
     */
    public String getPrimaryColor() {
        return primaryColor;
    }

    /**
     * @param primaryColor the primaryColor to set
     */
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    /**
     * @return the dataPoints
     */
    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    /**
     * @param dataPoints the dataPoints to set
     */
    public void setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    /**
     * returns data as a table
     * @return 
     */
    public double[][] getDataMatrix() {
        double[][] matrix = new double[2][dataPoints.size()];
        int index = 0;
        for (DataPoint point : dataPoints) 
        {
            matrix[0][index] = point.getX();  
            matrix[1][index] = point.getY();  
            index++;
        }
        return matrix;
    }

    public void add(DataPoint dataPoint) {
        dataPoints.add(dataPoint);
    }
    public void setDataPoints(double[][] data) {
        dataPoints.clear();
        if (data == null) {
            return;
        }
        if (data.length != 2 || data[1].length != data[0].length) {
            throw new IllegalArgumentException("Invalid Input size or mismatch");
        }
        
        for (double x : data[0]) {
            double y = data[1][dataPoints.size()];
            add(new DataPoint(x, y));
        }   
    }
}
