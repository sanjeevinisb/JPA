package com.xworkz.lens.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lens_table")
public class LensEntity {
	@Id
	private int id;
	private String brand;
	private String model;
	private int focal_Length;
	private float aperture;
	private float weight;
	private double price;
	private String material;
	private String color;
	private String is_Waterproof;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getFocal_Length() {
		return focal_Length;
	}
	public void setFocal_Length(int focal_Length) {
		this.focal_Length = focal_Length;
	}
	public float getAperture() {
		return aperture;
	}
	public void setAperture(float aperture) {
		this.aperture = aperture;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getIs_Waterproof() {
		return is_Waterproof;
	}
	public void setIs_Waterproof(String is_Waterproof) {
		this.is_Waterproof = is_Waterproof;
	}

	
}
