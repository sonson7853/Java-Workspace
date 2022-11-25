package com.kh.chap01_beforeVsafter.before.model.vo;

public class SmartPhone {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgenct;
	
	public SmartPhone() {
		
	}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgenct) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgenct = mobileAgenct;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPcode(String pCode) {
		this.pCode = pCode;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setMobileAgenct(String mobileAgenct) {
		this.mobileAgenct = mobileAgenct;
	}
	
	public String getMobileAgenct() {
		return mobileAgenct;
	}
	
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price+", "+mobileAgenct;
	}
	
	
	
	
	
}
