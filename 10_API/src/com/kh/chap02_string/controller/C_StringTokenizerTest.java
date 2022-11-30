package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	
	public void method() {
		String str = "Java Oracle JDBC HTML CSS JavaScript Server";
		
		// 구분자를 제시해서 해당 문자열을 분리시키는 방법
		// 방법 1. 분리된 문자열을들을 String[]배열에 차곡차곡 담아서 관리하는 방법
		//        문자열.split(구분자) : String[]
		String [] arr = str.split(",");
		
//		for(int i =0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 문자열 배열의 경우 for문을 다음과 쓸 수 있다. : 향상된 for문
		// for( 값을 받아줄 변수 : 순차적으로 접근할 배열){
		//}
		for( String s  :  arr) {
			System.out.println(s);
		}
		
		System.out.println("===================================================");
	
		//방법 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을 때
		//       java.util.StringTokenizer 클래스를 이용하는 방법
		//       StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		System.out.println("분리된 문자열의 갯수 : "+ stn.countTokens());
		
//		System.out.println(stn.nextToken()); 
//		System.out.println(stn.nextToken()); 
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
		
		while(stn.hasMoreTokens()) {// 다음토큰인 있으면 true, 없으면 false
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
