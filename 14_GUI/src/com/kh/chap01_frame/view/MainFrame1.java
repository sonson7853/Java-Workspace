package com.kh.chap01_frame.view;

import javax.swing.JFrame;

public class MainFrame1 {
	/*
	 * 자바에서 프레임 생성하는 방법1.
	 * JFrame 객체를 직접 생성한 후 그 생성된 객체를 하나의 프레임으로 두는 방법
	 * 생성된 객체를 통해서 프레임의 크기 및 위치 등 변경.
	 */
	public void showFrame() {
		//JFrame mainFrame = new JFrame();//JFrame객체 생성
		//mainFrame.setTitle("MainFrme1");//생성된 프레임 제목 설정
		JFrame mainFrame = new JFrame("Main Frame1");
		
		//프레임이 뜨는 위치 설정 (x , y)
		mainFrame.setLocation(300, 200);
		//프레임의 크기(가로,세로)
		mainFrame.setSize(900,500);
		
		//아래 두 구문은 항상 세트로 작성하기.
		//창이 보여지게끔 하는 메소드
		mainFrame.setVisible(true);
		//닫기버튼을 눌렀을 때 프로세스가 완전히 종료되게 하는 메소드
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
