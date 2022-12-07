package com.kh.chap02_scheduling.scheduling;

public class Car implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<20 ; i++) {
			try {
				System.out.println("Car driving...");				
				Thread.sleep(100); // 스레드를 지정된시간(ms)만큼 지연시키는(일시정지) 메소드.
			} catch (InterruptedException e) {
				e.printStackTrace();
		    }
		}
			
	}
}
