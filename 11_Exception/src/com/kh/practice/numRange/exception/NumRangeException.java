package com.kh.practice.numRange.exception;

public class NumRangeException extends RuntimeException {
	
	public NumRangeException() {
		
	}
	
	public NumRangeException(String msg) {
		super("1부터 100사이의 값이 아닙니다.");
	}
}
