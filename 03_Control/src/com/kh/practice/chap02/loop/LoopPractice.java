package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//
		//
		//
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + "");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요.");
			practice1();
		}				
	}

	
	public void practice2() {
		
		
	}
	
	
	
	
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i==num) {
				System.out.print(i);
			}else {
				System.out.print(i + " + ");
			}
			sum += i;
		}
		System.out.print(" = " + sum);		
	}
	
	
	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i++) {			
			for(int j=1; j<=i; j++) {// 1 2 3 4
				System.out.print("*");//****
		    }
		}
		System.out.println();						
	}
	
	
	
	public void practice10() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i< num; i++) {
			for(int j=1; j<num - i; j++) { // 1 2 3
				System.out.print(" "); //   ;  			
			}
			for(int j=1; j<2 + i; j++) { // 1
				System.out.print("*"); // *
			}
			System.out.println();			
		}				
	}

	
	public void practice11() {
		//정수 입력 : 4
		//****
		// ***
		//  **
		//   *
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();// 4
		
		for(int j=0; j<4; j++) { //0123
			System.out.print("*"); //****			
		}
		System.out.println();
		
		// ***
		for(int j=0; j<1; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<3; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		//  **
		for(int j=0; j<2; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<2; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	public void practice12() {
		//정수 입력 : 4
		//   *
		//  ***
		// *****
		//*******
		System.out.print("정수 입력: ");
		int num = sc.nextInt(); //4 
		for(int i=0; i<num; i++) { // 0 1 2 3 
			for(int j=0; j<num - (1+i); j++) { //0 1 2
				System.out.print(" ");
			}
			for(int j=0; j<1+2*i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}								
	}
	
	
	
	public void practice14() {
//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//ex.
//숫자 : 11
//2 3 5 7 11 
//2부터 11까지 소수의 개수는 5개입니다		
		System.out.print("숫자 : ");
		int num = sc.nextInt();		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		int count = 0;		
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			//i값이 소수인지 아닌지 검사를함.
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime = false;
					//break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
				count++;
			}
			//i값이 소수라면 출력을하고, 값을 1증가시킴.
		}
		
		System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.", num, count);
	}
	
	
	
	public void practice18() { 
		//정수 입력 : 3
		//   *
		//  ***
		// *****
		//  ***
		//   *
		System.out.print("정수 입력: ");
		int num = sc.nextInt(); 
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-(1+i); j++) { //  ;
				System.out.print(" ");
			}
			for(int j=0; j<1+2*i; j++) { // *
				System.out.print("*");
			}
			System.out.println();			
		}			
		// ***
		for(int j=0; j<2; j++) { //  
			System.out.print(" ");
		}
		for(int j=0; j<1; j++) { // 
			System.out.print("*");
		}
		System.out.println();	
		
	}
	
	
	
	
}