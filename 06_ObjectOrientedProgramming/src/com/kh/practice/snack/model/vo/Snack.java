package com.kh.practice.snack.model.vo;

public class Snack {
	//필드부
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자부
	public Snack() {
		
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	//메소드부	
	// 1.setter 메소드
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 2.getter 메소드
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumof() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	
	// 3.information 메소드
	// "빵(케이크 - 블루베리) 1개 15000원"
	public String information() {
		return kind + "("+name+" - "+ flavor + ") " + numOf +"개 " + price + "원";
	}
}
