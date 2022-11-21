package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;


public class ShapeMenu {
	//필드부
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	//생성자부
	
	//메소드부
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
			if(num == 3) {
				new ShapeMenu().triangleMenu();
			} if(num == 4) {
				new ShapeMenu().squareMenu();
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		
		
		
		}
	
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		int num = sc.nextInt();
		
		
				
	}
	public void squareMenu() {
		
	}
	public void inputSize(int type, int menuNum) {
		
	}
	public void printlnInformation(int type) {
		
	}
	
	
}
