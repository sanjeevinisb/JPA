package com.xworkz.clutcher.dto;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clutcher_table")
public class ClutcherEntity {
	@Id
	private int id;
	
private String name;
private double price;
private int quantity;
private String color;
private String material;
private long created_at;
private long updated_at;
private  String is_available;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public long getCreated_at() {
	return created_at;
}
public void setCreated_at(long created_at) {
	this.created_at = created_at;
}
public long getUpdated_at() {
	return updated_at;
}
public void setUpdated_at(long updated_at) {
	this.updated_at = updated_at;
}
public String getIs_available() {
	return is_available;
}
public void setIs_available(String is_available) {
	this.is_available = is_available;
}

}
