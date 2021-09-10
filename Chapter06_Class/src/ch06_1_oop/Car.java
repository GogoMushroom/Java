package ch06_1_oop;



public class Car {
	
//	//필드
//	String company = "현대자동차";
//	String model = "그렌저";
//	String color = "검정";
//	int maxSpeed = 350;
//	int Speed; //기본값 0 
	
	//필드
	String company = "";
	String model = "";
	String color = "";
	String engine = "";
	int maxSpeed = 350;
	int Speed; //기본값 0 	
	
	
	Car(String company,String model,String color,String engine){
		this.company = company;
		this.model = model;
		this.color = color;
		this.engine = engine;
	}
	//구성요소가 다르면 다른 함수임 	
	Car(String company,String model,String color){
		this.company = company;
		this.model = model;
		this.color = color;		
		
// 생성자 오버로딩 생성자의 매개변수의 유형과 개수가 다르게 하여 같은 이름의 생성자를 여러 개 가질 수 있다
		
		
	}
	}


