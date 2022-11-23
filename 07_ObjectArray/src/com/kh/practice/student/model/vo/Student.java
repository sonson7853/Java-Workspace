package com.kh.practice.student.model.vo;

public class Student {
	
	//필드부
	private String name;
	private String subject;
	private int score;
	
	
	//생성자부	
	public Student() {
		super();
	}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;		
	}
	
	//메소드부	
	// 1.setter 메소드
		public void setName(String name) {
			this.name = name;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public void setScore(int score) {
			this.score = score;	
		}				
		
		// 2.getter 메소드
		public String getName() {
			return name;
		}
		public String getSubject() {
			return subject;
		}
		public int getScore() {
			return score;
		}

		
		// 3.information 메소드
		public String inform() {
			return "이름 : "+name+" / 과목 : "+subject+" / 점수 : "+score;
		}
	
}
