package com.vimalkumarpatel.carsearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String color;
	private String make;
	private String model;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", " + (color != null ? "color=" + color + ", " : "")
				+ (make != null ? "make=" + make + ", " : "") + (model != null ? "model=" + model : "") + "]";
	}
	
}
