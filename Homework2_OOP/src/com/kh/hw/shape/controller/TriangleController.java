package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	// 필드부
	Shape s = new Shape();

	// 생성자부

	// 메소드부
	public double calcArea(double height, double width) {
		s = new Shape(3 , height, width);
		s.setHeight(height);
		s.setWidth(width);
		return height*width / 2;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {

		return "삼각형 "+ s.information();
	}
}
