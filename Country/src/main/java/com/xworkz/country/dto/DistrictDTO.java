package com.xworkz.country.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "districts_table") 
public class DistrictDTO {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id; 
    private String districtName;
    private String headquarters; 
    private double population; 
    private double area; 
    private double literacyRate;
    private String officialLanguage;
    private String majorRiver;
    private String famousLandmark; 
    private String districtCollector;
    
    public DistrictDTO() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
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

    public String getDistrictCollector() {
        return districtCollector;
    }

    public void setDistrictCollector(String districtCollector) {
        this.districtCollector = districtCollector;
    }

    public DistrictDTO(String districtName, String headquarters, double population, double area, double literacyRate,
                       String officialLanguage, String majorRiver, String famousLandmark, String districtCollector) {
        super();
        this.districtName = districtName;
        this.headquarters = headquarters;
        this.population = population;
        this.area = area;
        this.literacyRate = literacyRate;
        this.officialLanguage = officialLanguage;
        this.majorRiver = majorRiver;
        this.famousLandmark = famousLandmark;
        this.districtCollector = districtCollector;
    }
}
