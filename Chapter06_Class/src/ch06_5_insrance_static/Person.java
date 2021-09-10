package ch06_5_insrance_static;

public class Person {

	//필드 
	final String nation = "korea";
	final String ssn;
	String name;
	//필드 선언시 할당  
	
	
	//생성자
	public Person (String ssn, String name ) {
		this.ssn = ssn;
		this.name = name;
	//생성자에서 할당	
		
		//필드 선언시나 생성자에서 초기값을 지정해줌 
	}
	
	
	//메소드
}
