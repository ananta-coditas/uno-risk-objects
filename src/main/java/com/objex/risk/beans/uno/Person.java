/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.objex.risk.beans.uno;

import com.objex.risk.beans.BasePerson;
import com.objex.risk.beans.brca.Person.Ethnic;

import static com.objex.risk.beans.Germline.MLH1;
import static com.objex.risk.beans.Germline.MSH2;
import static com.objex.risk.beans.Germline.MSH6;
import com.objex.risk.beans.tcuzick.Person.DensityMeasure;
import com.objex.risk.beans.tcuzick.Person.HRTType;
import com.objex.risk.beans.tcuzick.Person.HRTUse;
import com.objex.risk.beans.tcuzick.Person.HyperplasiaType;
import com.objex.risk.beans.tcuzick.Person.MenosType;
import com.objex.risk.beans.tcuzick.Person.ParousType;
import com.objex.risk.beans.uno.Cancer.CancerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jward
 */
@XmlRootElement(name = "Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person extends BasePerson {

    // @XmlType(namespace="com.objex.risk.beans.uno.Person.Ethnic")
    // public enum Ethnic {nonAJ, AJ}


    public enum FamilyRace {
        Unknown, Hispanic, Asian, Black, NativeAmerican, White, AfricanAmerican, Caucasian, 
        FrenchCanadian, HispanicLatino, Jewish_Ashkenazi,Jewish_Non_Ashkenazi, MiddleEastern, Portuguese, Other
    }

    public enum NCCNEnum {
        YES, NO, NOT_PROVIDED
    }

    private boolean performedBiopsy = false;
    private Integer biopsyCount = 0;
    private Integer menarcheAge = 0;
    private Boolean hasLiveBirth = false;
    private Integer liveBirthAge = 0;
    private HyperplasiaType hyperplasiaType = HyperplasiaType.NONE;
    private boolean hasHyperplasia = false;
    private boolean hasAtypicalHyperplasia = false;
    private boolean hasLCIS = false;
    private boolean hasDCIS = false;
    private boolean hasMantleRadiation = false;
    private com.objex.risk.beans.gail.Person.Race race = null;
    private FamilyRace familyRace = FamilyRace.Unknown;
    // private Integer affectedBreastType = 0;
    // private Integer affectedOvarianType = 0;
    // private Integer diagnoseBreastAge = 0;
    // private Integer diagnoseOvarianAge = 0;
    // private Integer diagnoseBreastContralateralAge = 0;
    private Ethnic ethnic = Ethnic.nonAJ;
    private ParousType parous = null;
    private boolean performedMasectomy = false;
    private Integer ageMasectomy = 1;

    private boolean performedOophorectomy = false;
    private Integer ageOophorectomy = 1;
    // private Integer menarcheAge = -99;
    private Integer menopauseAge = -99;
    private MenosType menostat = MenosType.Unknown;
    private Double height = -99d; // meters
    private Double weight = -99d; // kgs
    private DensityMeasure densityMeasure = DensityMeasure.NONE;
    private Double densityValue = -99d;
    private Double polygenicSNP = 0d;
    // private Boolean hasLiveBirth = null;
    // private Integer liveBirthAge = -99;

    // private boolean hasLCIS = false;
    // private Ethnic ethnic = Ethnic.nonAJ;
    // private AffectedType affectedBreastType = AffectedType.NONE;
    // private AffectedType affectedOvarianType = AffectedType.NONE;
    // private AffectedType affectedBilateralBreastType = AffectedType.NONE;
    // private Integer diagnoseOvarianAge = 0;
    // private Integer diagnoseBreastAge = 0;
    // private Integer diagnoseBilateralBreastAge = 0;
    private HRTUse usedHRT = HRTUse.NEVER;
    private HRTType hrtType = null;
    private Double yearsPastHRT = 0d;
    private Double yearsFutureHRT = 0d;
    private Double yearsSinceHRT = 0d;
    private NCCNEnum polypOverall = NCCNEnum.NOT_PROVIDED;
    private PolypDetails polypDetails = null;
    @XmlElementWrapper(name = "Cancers")
    @XmlElement(name = "Cancer")
    private List<Cancer> cancers = new ArrayList<>();

    @Override
    protected List<String> germLines() {
        return Arrays.asList(MLH1, MSH2, MSH6);
    }

    /**
     * @return the menarcheAge
     */
    public Integer getMenarcheAge() {
        return menarcheAge;
    }

    /**
     * @param menarcheAge the menarcheAge to set
     */
    public void setMenarcheAge(Integer menarcheAge) {
        this.menarcheAge = menarcheAge;
    }

    /**
     * @return the menopauseAge
     */
    public Integer getMenopauseAge() {
        return menopauseAge;
    }

    /**
     * @param menopauseAge the menopauseAge to set
     */
    public void setMenopauseAge(Integer menopauseAge) {
        this.menopauseAge = menopauseAge;
    }

    /**
     * @return the menostat
     */
    public MenosType getMenostat() {
        return menostat;
    }

    /**
     * @param menostat the menostat to set
     */
    public void setMenostat(MenosType menostat) {
        this.menostat = menostat;
    }

    /**
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public ParousType getParous() {
        ParousType parous = ParousType.Nulliparous;
        if (getHasLiveBirth() == null) {
            parous = ParousType.Unknown;
        } else if (getHasLiveBirth()) {
            parous = ParousType.Parous;
        }

        return parous;
    }

    /**
     * @return the densityMeasure
     */
    public DensityMeasure getDensityMeasure() {
        return densityMeasure;
    }

    /**
     * @param densityMeasure the densityMeasure to set
     */
    public void setDensityMeasure(DensityMeasure densityMeasure) {
        this.densityMeasure = densityMeasure;
    }

    /**
     * @return the densityValue
     */
    public Double getDensityValue() {
        return densityValue;
    }

    /**
     * @param densityValue the densityValue to set
     */
    public void setDensityValue(Double densityValue) {
        this.densityValue = densityValue;
    }

    /**
     * @return the polygenicSNP
     */
    public Double getPolygenicSNP() {
        return polygenicSNP;
    }

    /**
     * @param polygenicSNP the polygenicSNP to set
     */
    public void setPolygenicSNP(Double polygenicSNP) {
        this.polygenicSNP = polygenicSNP;
    }

    /**
     * @return the hasLiveBirth
     */
    public Boolean getHasLiveBirth() {
        return hasLiveBirth;
    }

    /**
     * @param hasLiveBirth the hasLiveBirth to set
     */
    public void setHasLiveBirth(Boolean hasLiveBirth) {
        this.hasLiveBirth = hasLiveBirth;
    }

    /**
     * @return the liveBirthAge
     */
    public Integer getLiveBirthAge() {
        return liveBirthAge;
    }

    /**
     * @param liveBirthAge the liveBirthAge to set
     */
    public void setLiveBirthAge(Integer liveBirthAge) {
        this.liveBirthAge = liveBirthAge;
    }

    /**
     * @return the hyperplasiaType
     */
    public HyperplasiaType getHyperplasiaType() {
        return hyperplasiaType;
    }

    /**
     * @param hyperplasiaType the hyperplasiaType to set
     */
    public void setHyperplasiaType(HyperplasiaType hyperplasiaType) {
        this.hyperplasiaType = hyperplasiaType;
    }

    /**
     * @return the hasAtypicalHyperplasia
     */
    public boolean isHasAtypicalHyperplasia() {
        return hasAtypicalHyperplasia;
    }

    /**
     * @param hasAtypicalHyperplasia the hasAtypicalHyperplasia to set
     */
    public void setHasAtypicalHyperplasia(boolean hasAtypicalHyperplasia) {
        this.hasAtypicalHyperplasia = hasAtypicalHyperplasia;
    }

    /**
     * @return the hasLCIS
     */
    public boolean isHasLCIS() {
        return hasLCIS;
    }

    /**
     * @param hasLCIS the hasLCIS to set
     */
    public void setHasLCIS(boolean hasLCIS) {
        this.hasLCIS = hasLCIS;
    }

    /**
     * @return the ethnic
     */
    public Ethnic getEthnic() {
        return ethnic;
    }

    /**
     * @param ethnic the ethnic to set
     */
    public void setEthnic(Ethnic ethnic) {
        this.ethnic = ethnic;
    }

    /**
     * @return the usedHRT
     */
    public HRTUse getUsedHRT() {
        return usedHRT;
    }

    /**
     * @param usedHRT the usedHRT to set
     */
    public void setUsedHRT(HRTUse usedHRT) {
        this.usedHRT = usedHRT;
    }

    /**
     * @return the hrtType
     */
    public HRTType getHrtType() {
        return hrtType;
    }

    /**
     * @param hrtType the hrtType to set
     */
    public void setHrtType(HRTType hrtType) {
        this.hrtType = hrtType;
    }

    /**
     * @return the yearsPastHRT
     */
    public Double getYearsPastHRT() {
        return yearsPastHRT;
    }

    /**
     * @param yearsPastHRT the yearsPastHRT to set
     */
    public void setYearsPastHRT(Double yearsPastHRT) {
        this.yearsPastHRT = yearsPastHRT;
    }

    /**
     * @return the yearsFutureHRT
     */
    public Double getYearsFutureHRT() {
        return yearsFutureHRT;
    }

    /**
     * @param yearsFutureHRT the yearsFutureHRT to set
     */
    public void setYearsFutureHRT(Double yearsFutureHRT) {
        this.yearsFutureHRT = yearsFutureHRT;
    }

    /**
     * @return the yearsSinceHRT
     */
    public Double getYearsSinceHRT() {
        return yearsSinceHRT;
    }

    /**
     * @param yearsSinceHRT the yearsSinceHRT to set
     */
    public void setYearsSinceHRT(Double yearsSinceHRT) {
        this.yearsSinceHRT = yearsSinceHRT;
    }

    /**
     * @return the cancers
     */
    public List<Cancer> getCancers() {
        return cancers;
    }

    /**
     * @param cancers the cancers to set
     */
    public void setCancers(List<Cancer> cancers) {
        this.cancers = cancers;
    }

    /**
     * @return the performedBiopsy
     */
    public boolean isPerformedBiopsy() {
        return performedBiopsy;
    }

    /**
     * @param performedBiopsy the performedBiopsy to set
     */
    public void setPerformedBiopsy(boolean performedBiopsy) {
        this.performedBiopsy = performedBiopsy;
    }

    /**
     * @return the biopsyCount
     */
    public Integer getBiopsyCount() {
        return biopsyCount;
    }

    /**
     * @param biopsyCount the biopsyCount to set
     */
    public void setBiopsyCount(Integer biopsyCount) {
        this.biopsyCount = biopsyCount;
    }

    /**
     * @return the hasHyperplasia
     */
    public boolean isHasHyperplasia() {
        return hasHyperplasia;
    }

    /**
     * @param hasHyperplasia the hasHyperplasia to set
     */
    public void setHasHyperplasia(boolean hasHyperplasia) {
        this.hasHyperplasia = hasHyperplasia;
    }

    /**
     * @return the hasDCIS
     */
    public boolean isHasDCIS() {
        return hasDCIS;
    }

    /**
     * @param hasDCIS the hasDCIS to set
     */
    public void setHasDCIS(boolean hasDCIS) {
        this.hasDCIS = hasDCIS;
    }

    /**
     * @return the hasMantleRadiation
     */
    public boolean isHasMantleRadiation() {
        return hasMantleRadiation;
    }

    /**
     * @param hasMantleRadiation the hasMantleRadiation to set
     */
    public void setHasMantleRadiation(boolean hasMantleRadiation) {
        this.hasMantleRadiation = hasMantleRadiation;
    }

    /**
     * @return the performedMasectomy
     */
    public boolean isPerformedMasectomy() {
        return performedMasectomy;
    }

    /**
     * @param performedMasectomy the performedMasectomy to set
     */
    public void setPerformedMasectomy(boolean performedMasectomy) {
        this.performedMasectomy = performedMasectomy;
    }

    /**
     * @return the ageMasectomy
     */
    public Integer getAgeMasectomy() {
        return ageMasectomy;
    }

    /**
     * @param ageMasectomy the ageMasectomy to set
     */
    public void setAgeMasectomy(Integer ageMasectomy) {
        this.ageMasectomy = ageMasectomy;
    }

    /**
     * @return the performedOophorectomy
     */
    public boolean isPerformedOophorectomy() {
        return performedOophorectomy;
    }

    /**
     * @param performedOophorectomy the performedOophorectomy to set
     */
    public void setPerformedOophorectomy(boolean performedOophorectomy) {
        this.performedOophorectomy = performedOophorectomy;
    }

    /**
     * @return the ageOophorectomy
     */
    public Integer getAgeOophorectomy() {
        return ageOophorectomy;
    }

    /**
     * @param ageOophorectomy the ageOophorectomy to set
     */
    public void setAgeOophorectomy(Integer ageOophorectomy) {
        this.ageOophorectomy = ageOophorectomy;
    }

    /**
     * @return the race
     */
    public com.objex.risk.beans.gail.Person.Race getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(com.objex.risk.beans.gail.Person.Race race) {
        this.race = race;
    }

    /**
     * @return the familyRace
     */
    public FamilyRace getFamilyRace() {
        return familyRace;
    }

    /**
     * @param familyRace the familyRace to set
     */
    public void setFamilyRace(FamilyRace familyRace) {
        this.familyRace = familyRace;
    }

    /**
     * @param parous the parous to set
     */
    public void setParous(ParousType parous) {
        this.parous = parous;
    }

    /**
     * @return the polypOverall
     */
    public NCCNEnum getPolypOverall() {
        return polypOverall;
    }

    /**
     * @param polypOverall the polypOverall to set
     */
    public void setPolypOverall(NCCNEnum polypOverall) {
        this.polypOverall = polypOverall;
    }

    /**
     * @return the polypDetails
     */
    public PolypDetails getPolypDetails() {
        return polypDetails;
    }

    /**
     * @param polypDetails the polypDetails to set
     */
    public void setPolypDetails(PolypDetails polypDetails) {
        this.polypDetails = polypDetails;
    }

    public Cancer getCancer(CancerType cancerType) {
		for (Cancer cancer : getCancers()) {
			if (cancer.getCancerType() == cancerType) {
				return cancer;
			}
		}
        Cancer cancer = new Cancer();
        cancer.setCancerType(cancerType);
		return cancer;
		
	}

}
