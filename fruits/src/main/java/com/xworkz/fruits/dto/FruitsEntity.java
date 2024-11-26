package com.xworkz.fruits.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fruits_table")
public class FruitsEntity {
	@Id
	private int id;
	private String name;
	private String color;
	private float weight;
	private double price;
	private String origin;
	private String season;
	private String taste;
	private String is_Organic;
	private int shelf_Life;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getIs_Organic() {
		return is_Organic;
	}

	public void setIs_Organic(String is_Organic) {
		this.is_Organic = is_Organic;
	}

	public int getShelf_Life() {
		return shelf_Life;
	}

	public void setShelf_Life(int shelf_Life) {
		this.shelf_Life = shelf_Life;
	}

}
