package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.ATM1;
import com.kh.chap03_sync.sync.Account;

public class Run2 {
	
	public static void main(String[] args) {
		// 계좌, ATM
		Account acc = new Account();
		Thread atm1 = new Thread(new ATM1(acc));
		Thread atm2 = new Thread(new ATM1(acc));
		
		/*
		 * 메소드에 동기화처리(synchronized) 처리해주지 않은경우 값이 마구 뒤섞임.
		 * 즉, 앞의 스레드가 실행되는동안은 다른 스레드가 같은 자원에 접근하면안됨.
		 */
		atm1.start();
		atm2.start();
		
		/*
		 * 동기화란?
		 * 멀티스레딩 프로그램에서 스레드간 공유자원에 대한 처리를 말함.
		 * 공유자원에대한 사용순서를 정해주는 것.
		 * LOCK을 획득한 스레드만 사용가능하다.
		 */
		System.out.println("메인스레드 종료");
		
	}
}
