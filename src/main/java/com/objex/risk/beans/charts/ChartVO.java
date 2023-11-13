/*
 */
package com.objex.risk.beans.charts;

import static com.objex.risk.beans.charts.ChartVO.Type.LINE;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "Chart")
public class ChartVO {


    public enum Type {LINE,PIE}
    
    private String backgroundColor = null;
    private String title = null;
    private Integer width = null;
    private Integer height = null;
    private String axisX = null;
    private String axisY = null;
    private Integer chartCode = 0;
    private Type chartType = null;
    private String context = null;
    @XmlElement(name="Series")
    private List<Series> series = new ArrayList();
    private Boolean explodePie = null;
    private Boolean showPoints = null;

    /**
     * @return the backgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }
    
    void setBackgroundColor(Color color) {
        setBackgroundColor(String.format("#%02x%02x%02x",color.getRed(),color.getGreen(), color.getBlue()));
    }
    public Series getSeriesForName(String name) {
        for (Series series : series) {
            if (name.equals(series.getName())) {
                return series;
            }
        }
        return null;
    }
    /**
     * use this chart as a prototype and copy unset fields to new chart.  THis will not set chartCode
     * @param chart 
     */
    
    public void copyChart(ChartVO chart) {
              if (chart.getTitle() == null) {
                chart.setTitle(title);
              }
              if (chart.getWidth() == null) {
                 chart.setWidth(width);
              }
              if (chart.getHeight() == null) {
                     chart.setHeight(height);
              }
              if (chart.getAxisX() == null) {
                chart.setAxisX(axisY);
              }
              if (chart.getAxisY() == null) {
                chart.setAxisY(axisY);
              }
              if (chart.getBackgroundColor() == null) {
                chart.setBackgroundColor(backgroundColor);
              }
              if (chart.explodePie == null) {
                    chart.setExplodePie(explodePie);
              }
              if (chart.showPoints == null)
              {
                  chart.setShowPoints(showPoints);
              }
              if (chart.chartType == null) {
                  chart.setChartType(getChartType());
              }
              
              for (Series series : getSeries()) {
                  Series seriesCopy = null;
                  if (chart.getSeriesForName(series.getName()) == null) {
                      seriesCopy = chart.addSeries(series.getName());
                  } else
                  {
                      seriesCopy = chart.getSeriesForName(series.getName());
                  }
                  if (seriesCopy.getLabel() == null) {
                        seriesCopy.setLabel(series.getLabel());
                  }
                  if (seriesCopy.getPrimaryColor() == null) {
                        seriesCopy.setPrimaryColor(series.getPrimaryColor());
                  }
                  if (seriesCopy.getDataPoints().isEmpty()) {
                      seriesCopy.setDataPoints(series.getDataMatrix());
                  }
                  
              }
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Integer height) {
        this.height = height;
    }


    /**
     * @return the chartCode
     */
    public Integer getChartCode() {
        return chartCode;
    }

    /**
     * primary identifier for a chart.  it should be unique with a context.
     * @param chartCode the chartCode to set
     */
    public void setChartCode(Integer chartCode) {
        this.chartCode = chartCode;
    }

    /**
     * @return the chartType
     */
    public Type getChartType() {
        if (chartType == null) {
            return LINE;
        }
        return chartType;
    }

    /**
     * Line, Pie etc..
     * @param chartType the chartType to set
     */
    public void setChartType(Type chartType) {
        this.chartType = chartType;
    }

    /**
     * @return the axisX
     */
    public String getAxisX() {
        return axisX;
    }

    /**
     * @param axisX the axisX to set
     */
    public void setAxisX(String axisX) {
        this.axisX = axisX;
    }

    /**
     * @return the axisY
     */
    public String getAxisY() {
        return axisY;
    }

    /**
     * @param axisY the axisY to set
     */
    public void setAxisY(String axisY) {
        this.axisY = axisY;
    }
    public void setSize(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }
    /**
     * a series is each set of related data.
     * @param name
     * @return 
     */
    public Series addSeries(String name) {
        Series s = new Series();
        s.setName(name);
        series.add(s);
        return s;
    }
    public List<Series> getSeries() {
        return series;
    }

    /**
     * with a pie graph, will explode out the first pie.
     * @return the explodePie
     */
    public Boolean isExplodePie() {
        if (explodePie == null) {
            return Boolean.FALSE;
        }
        return explodePie;
    }

    /**
     * @param explodePie the explodePie to set
     */
    public void setExplodePie(Boolean explodePie) {
        this.explodePie = explodePie;
    }

    /**
     * @return the showPoints
     */
    public Boolean isShowPoints() {
        if (showPoints == null) {
          return Boolean.FALSE;
        }
        return showPoints;
    }

    /**
     * @param showPoints the showPoints to set
     */
    public void setShowPoints(Boolean showPoints) {
        this.showPoints = showPoints;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * the parent or other owner if any that is providing the data for this chart.  Usually model.
     * @param context 
     */
    public void setContext(String context) {
        this.context = context;
    }
    
}
