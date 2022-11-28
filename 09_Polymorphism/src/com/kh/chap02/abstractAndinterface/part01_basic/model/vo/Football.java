package com.kh.chap02.abstractAndinterface.part01_basic.model.vo;

public class Football extends Sports {

	@Override
	public void rule() {
		System.out.println("발로 공을차서 골대에 넣어야함.");
	}
}
