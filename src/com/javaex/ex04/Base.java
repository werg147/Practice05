package com.javaex.ex04;

public class Base {
    
	//필드
	private String status;
	private String service;
	
	//메소드
	
    public void service(String status) {
    	//코드작성
    	
    	this.service = status;
    	
    	//메소드를 불러옴
    	if(status=="낮") {
    		this.day();
    	} else if(status=="밤") {
    		this.night();
    	} else if(status=="오후") {
    		this.afternoon();
    	}
    	
    	
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

