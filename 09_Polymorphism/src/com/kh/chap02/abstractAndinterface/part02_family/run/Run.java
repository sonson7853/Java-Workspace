package com.kh.chap02.abstractAndinterface.part02_family.run;

import com.kh.chap02.abstractAndinterface.part02_family.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// 인터페이스 적용 전.
		//Person p = new Person();
//		Person p1 = new Mother("민엄마",74,60,"출산");
//		Person p2 = new Baby("민애기",3.5,60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat(); //엄마 : 몸무게에 + 10, 건강도 =10 -> 84, 50
//		p2.eat(); //아기 : 몸무게에 + 3,  건강도 =+1 -> 6.5, 61
//		p1.sleep(); //엄마 : 건강도 +10 -> 84,60
//		p2.sleep(); //아기 : 건강도 + 3 -> 6.5, 64
//		
//		System.out.println("=== 다음 날 ===");
//		System.out.println(p1);
//		System.out.println(p2);
		
		//인터페이스 적용 후 
		
		Basic b1 = new Mother("민엄마",77,70,"출산완료");
		Basic b2 = new Baby("민아기",4.5,70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		System.out.println("=== 다음날 ===");
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		
		
		
	}

}
