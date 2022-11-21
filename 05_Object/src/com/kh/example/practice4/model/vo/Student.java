package com.kh.example.practice4.model.vo;

public class Student {

   private int grade;
   private int classroom;
   private String name;
   private double height;
   private char gender;
   
   {
	   grade =3;
	   classroom = 15;
	   name = "민경민";
	   height = 180.5;
	   gender = '남';
   }
   
   public Student() {
      
   }
   
   public void setGrade(int grade) {
      this.grade = grade;
   }
   
   public void setClassroom(int classroom) {
      this.classroom = classroom;
      
   }
   
   public void setName(String name) {
      this.name = name;
      
   }
   
   public void setHeight(double height) {
      this.height = height;
      
   }
   
   
   public void setGender(char gender) {
      this.gender = gender;
   }
   
   public int getGrade() {
      return grade;
   }
   
   public int getCalssroom() {
      return classroom;
   }
   
   public String getName() {
      return name;
   }
   
   public double getHeight() {
      return height;
   }
   
   public char getGender() {
      return gender;
   }
   
   public void information() {
      //xx학생은 x학년 x반이고, 키는xx.cm 이며 성별은 남학생입니다
      System.out.println("xxx학생은 x학년이고 x반이며, 키는 xxxcm이고 x학생입니다.",name,grade,classroom,height);
   }
   
   
}