package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
	//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
	//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
	//ex.
	//1 2 3 4 5 6 7 8 9 10		
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = i + 1 ;
		}
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]+  " ");
		}		
	}
	
	
	public void practice2() {
	//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
	//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
	//ex.
	//10 9 8 7 6 5 4 3 2 1		
		int[] arr = new int[10];
		int value =10;
		for(int i=0; i<10; i++) {
			arr[i] = value - i;
		}
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice3() {
	//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	//ex.
	//양의 정수 : 5
	//1 2 3 4 5 
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num.length; i++) {
			
		}
		
	}
	
	
}
