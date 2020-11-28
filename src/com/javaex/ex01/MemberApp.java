package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m01 = new Member();
		Member m02 = new Member();
		Member m03 = new Member();
		
		m01.setName("정우성");
		m01.setId("jws");
		m01.setPoint(50000);
		m01.showInfo();
		
		m02.setName("유재석");
		m02.setId("yjs");
		m02.setPoint(30000);
		m02.showInfo();
		
		m03.setName("이효리");
		m03.setId("lhr");
		m03.setPoint(40000);
		m03.showInfo();

		
	}

}
