package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.scheduling.Car;
import com.kh.chap02_scheduling.scheduling.Plane;
import com.kh.chap02_scheduling.scheduling.Tank;

public class Run {
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Car());
		Thread th2 = new Thread(new Plane());
		Thread th3 = new Thread(new Tank());
		
		th1.setName("Car");
		th2.setName("Plane");
		th3.setName("Tank");
		
		// 우선순위 변경전
		// 스레드는 기본적으로 1~10사이의 우선수위중 5의 우선수위를 가지고 있습니다.
		// 메모리가 모자랄 때 우선순위를 정할 수 있음.
		// 스레드의 우선순위를 정하지 않으면, OS(운영체제)가 임의로 수행시킨다.
		System.out.println("======== 우선순위 변경 전 ==============");
		System.out.println(Thread.currentThread().getName() + "의 우선순위 : " + Thread.currentThread().getPriority());
		System.out.println(th1.getName() +"의 우선수위 : " + th1.getPriority());
		System.out.println(th2.getName() +"의 우선수위 : " + th2.getPriority());
		System.out.println(th3.getName() +"의 우선수위 : " + th3.getPriority());
		
		// setPriority() : 우선순위를 지정해주는 메소드
		th1.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("======== 우선순위 변경 후 ==============");
		System.out.println(Thread.currentThread().getName() + "의 우선순위 : " + Thread.currentThread().getPriority());
		System.out.println(th1.getName() +"의 우선수위 : " + th1.getPriority());
		System.out.println(th2.getName() +"의 우선수위 : " + th2.getPriority());
		System.out.println(th3.getName() +"의 우선수위 : " + th3.getPriority());
		
		th1.setDaemon(true) ;
		th2.setDaemon(true) ;
		th3.setDaemon(true) ;
		
		th1.start();
		th2.start();
		th3.start();
		
		/*
		 * 메인 스레드가 종료되더라도 실행 중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
		 * 해결책 : start() 시키기전에 우선순위, 주종관계를 설정해야함.
		 * 
		 * 주종관계 설정
		 * main스레드가 종료시 다른스레드도 종료시키기 위해서 반드시 setDaemon사용.
		 * 주의점은 스레드중 한개라도 setDaemon으로 설정시 모든 스레드에 setDaemon설정을 해줘야함.
		 */
		System.out.println("메인 스레드의 끝부분 ");
		// 시작순서는 우선순위는 다를 수 있지만 종료순서는 우선순위(priority)가 높은순으로 끝내야함.
		
	}
}
