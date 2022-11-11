package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void test2() {
		// 키보드로 정수 두개를 입력 받아 두 수의
		// 합, 차, 곱, 나누기한 몫을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 :");
		int num2 = sc.nextInt();
		
		System.out.println("더하기결과 :" + (num1+num2));
		
		System.out.println("빼기결과 :" + (num1-num2));
		
		System.out.println("곱하기결과 :" + (num1*num2));
	
		System.out.println("나누기결과 :" + (num1/num2));
		
		
		
		
	}

}
