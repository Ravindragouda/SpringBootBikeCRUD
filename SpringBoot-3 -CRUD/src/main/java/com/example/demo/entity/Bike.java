package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	String engNo;
	String brand;
	int cost;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String engNo, String brand, int cost) {
		super();
		this.engNo = engNo;
		this.brand = brand;
		this.cost = cost;
	}
	public String getEngNo() {
		return engNo;
	}
	public void setEngNo(String engNo) {
		this.engNo = engNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [engNo=" + engNo + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
