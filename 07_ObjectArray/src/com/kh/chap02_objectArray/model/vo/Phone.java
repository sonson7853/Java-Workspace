package com.kh.chap02_objectArray.model.vo;

public class Phone {
	//필드부
	private String name;
	private String series;
	private String brand;
	private int price;
	
	
	//생성자부
	public Phone() {
		
	}
	
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	
	//메소드부
	
	// 1. setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 2.getter 메소드
		public String getName() {
			return name;
		}
		public String getSeries() {
			return series;
		}
		public String getBrand() {
			return brand;
		}
		public int getPrice() {
			return price;
		}
		
		// 3.information 메소드
		public String information() {
			return name + "," + series + "," +brand + "," + price;
		}
}
