package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	// 필드부
	Shape s = new Shape();

	// 생성자부

	// 메소드부
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return height*2 + width*2;
	}
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return height*width;
	}

	public void paintColor(String color) {

		return s.information();
	}

	public String print() {

		return "사각형 "+s.information();
	}
}
