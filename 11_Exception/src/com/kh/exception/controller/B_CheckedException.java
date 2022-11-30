package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * CheckedException은 반드시 예외처리를 해줘야 되는 예외들.
	 * (즉, 에측 불가능한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해야 함)
	 * => 주로 외무매채와 어떤 입출력 시 발생
	 */
	
	public void method1() {
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로만 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자나 입력해주세요.");
		
		// 1. try ~ catch문 : 여기서 바로 예외 처리하기
//		try {
//			String str = br.readLine();
//			System.out.println("문자열의 길이 : " + str.length());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 2. throws : 지금 현재메소드에서 예외를 처리하지않고 현재 이 메소드를 호출한곳(method1)로 떠넘기겠다.
		String str = br.readLine();
		System.out.println("문자열의 길이 : " + str.length());
				
	}
	
	/*
	 * 				예외 발생 시점 									예외 처리
	 * RuntimeExcepiion 프로그램 실행 시 => 런타임 에러(컴파일에러x)        필수 아님 => uncheckedException(조건문 또는 예외처리구문 사용
	 * IOException 그외     => 컴파일에러							 필수 => checkedException(반드시 예외처리로 해결)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
