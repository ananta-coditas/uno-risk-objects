/*
 * 
 */
package com.objex.risk.beans.charts;

/**
 *  This type wraps a point
 * @author jward
 */
public class DataPoint {
    
    public final double x;
    public final double y;

    private DataPoint() {
        x = 0;
        y = 0;
    }
    public DataPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
