package com.kh.hw.shape.model.vo;

public class Shape {
	//필드부
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	//생성자부
	public Shape() {
		
	}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;		
	}
	
	//메소드부
	// 1.setter 메소드
		public void setType(int type) {
			this.type = type;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void setWidth(double width) {
			this.width = width;	
		}
		
		// 2.getter 메소드
		public int getType() {
			return type;
		}
		public double getHeight() {
			return height;
		}
		public double getWidth() {
			return width;
		}
				
		// 3.information 메소드
		public String information() {
			return height+" "+width+" "+color;
		}
}
