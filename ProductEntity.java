package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	@Column(columnDefinition = "double(5,2)")
	private double pprice;
	private String pquality;
	
	
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pquality=" + pquality + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPquality() {
		return pquality;
	}
	public void setPquality(String pquality) {
		this.pquality = pquality;
	}
	

}
