package com.kh.practice.chap02.abstractAndinterface.model.vo;

public interface Phone extends CellPhone{

	public char [] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'}
			
	public String makeCall();
	
	public String takeCall();
	
}
