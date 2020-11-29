package com.javaex.ex10;

public class Book {
    
	private int bookNo;
	private String title;
	private String author;
    private int stateCode; //대여유무코드
    
    //생성자
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }

	
    
    //메소드
    public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//대여기능 메소드
	public void rent(int num) {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}
	
	//출력 메소드
	public void print() {
		if(stateCode==1) {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여유무: 재고있음");
		} else if(stateCode==0) {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여유무: 대여중");
		}
		

	}
    
}