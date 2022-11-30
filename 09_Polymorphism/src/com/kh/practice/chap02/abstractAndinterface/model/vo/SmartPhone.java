package com.kh.practice.chap02.abstractAndinterface.model.vo;

public abstract class SmartPhone extends GalaxyNote9 {

	private String maker;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}
	
		
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}

	@Override
	public String printlnInformation() {
		return "SmartPhone [maker=" + maker + "]";
	}
	
	
}
