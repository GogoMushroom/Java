package ch06_1_oop;

public class Korean {

	
	//필드
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String n , String s) {
		this.name=n;  //this 자기자신 객체 주소
		ssn=s;
	}
}
