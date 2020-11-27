package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
    //생성자
    public Friend() {}
    
    public Friend(String name, String hp, String school) {
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }

    
    // getter/setter 작성
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
    
    public void setHp(String hp) {
    	this.hp = hp;
    }
    public String getHp() {
    	return hp;
    }
    
    public void setSchool(String school) {
    	this.school = school;
    }
    public String getSchool() {
    	return school;
    }
    
    
    //일반메소드
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
    
    

}
