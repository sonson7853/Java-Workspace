package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void Practice1() {
	
	Scanner sc = new Scanner(System.in);
    
    System.out.print("인원 수 : ");
    int persons = sc.nextInt();
    
    System.out.print("사탕 개수 : ");
    int candys = sc.nextInt();
   
    int result1 = (candys/persons);
    int result2 = (candys%persons);
    System.out.printf("1인당 사탕 개수 : " + result1);
   
    System.out.printf("남는 사탕 개수 : " + result2);
   
  }


	public void practice2() {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : " );
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classes = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘쨰자리까지) : ");
		double test = sc.nextDouble();
		
		System.out.printf("%d학년 %반 %번 %s %s의 성적은 %.2f이다", grade, classes, number, name, (gender == 'M' ? "남학생" : "여학생"), test);
		
	}
		
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : age <=19 ? "청소년" : "성인";
		
		System.out.println(result);
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;		
		double avg = sum / 3.0;
		String result = kor >= 40 && eng >= 40 && math >=40 && avg >= 60 ? "합격" : "불합격";		
		
		System.out.println("합게 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		String resNo = sc.nextLine();
		char gender = resNo.charAt(7);
		
		String result = (gender == 1 || gender == 3) ? "남자" : "여자";
		System.out.println(result);
		
	}
	
	public void practice6()	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
		System.out.println(result);
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println( (num1 == num2 && num2== num3 ) ? true : false);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int personA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int personB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int personC = sc.nextInt();
		
		double personAtotal = personA * 1.4;
		double personBtotal = personB;
		double personCtotal = personC * 1.15;
		
		System.out.println("A사원의 연봉/연봉+a : " + personA + "/" + personAtotal);
		System.out.println(personAtotal >= 3000 ? "3000 이상" : "3000 미안");
		
		System.out.println("B사원의 연봉/연봉+a : " + personB + "/" + personBtotal);
		System.out.println(personBtotal >= 3000 ? "3000 이상" : "3000 미안");
		
		System.out.println("C사원의 연봉/연봉+a : " + personC + "/" + personCtotal);
		System.out.println(personCtotal >= 3000 ? "3000 이상" : "3000 미안");
		
	}
}