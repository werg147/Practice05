package com.javaex.ex09;

public class StringUtil {
    
	//
	
	//메소드 일반
    public static String concatString(String[] arr){
       
        //메소드 내용작성
        String result = ""; //문자열 초기화
    	
    	for(int i=0; i<arr.length; i++) {
    		result = result+arr[i];
    	}
    	
    	return result;
    }

}
