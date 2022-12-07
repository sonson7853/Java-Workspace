package com.kh.chap02_scheduling.scheduling;

public class Tank implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<20; i++) {
			try {
				System.out.println("Tank Shooting...");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
