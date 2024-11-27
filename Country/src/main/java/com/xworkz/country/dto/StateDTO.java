package com.xworkz.country.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "states_table")
public class StateDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String stateName;
    private String capital;
    private double population;
    private double area;
    private double gdp;
    private double literacyRate;
    private String officialLanguage;
    private String majorRiver;
    private String famousLandmark;
    private String chiefMinister;

    public StateDTO() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    public void setLiteracyRate(double literacyRate) {
        this.literacyRate = literacyRate;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getMajorRiver() {
        return majorRiver;
    }

    public void setMajorRiver(String majorRiver) {
        this.majorRiver = majorRiver;
    }

    public String getFamousLandmark() {
        return famousLandmark;
    }

    public void setFamousLandmark(String famousLandmark) {
        this.famousLandmark = famousLandmark;
    }

    public String getChiefMinister() {
        return chiefMinister;
    }

    public void setChiefMinister(String chiefMinister) {
        this.chiefMinister = chiefMinister;
    }

    public StateDTO(String stateName, String capital, double population, double area, double gdp, double literacyRate,
                    String officialLanguage, String majorRiver, String famousLandmark, String chiefMinister) {
        super();
        this.stateName = stateName;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
        this.literacyRate = literacyRate;
        this.officialLanguage = officialLanguage;
        this.majorRiver = majorRiver;
        this.famousLandmark = famousLandmark;
        this.chiefMinister = chiefMinister;
    }
}
