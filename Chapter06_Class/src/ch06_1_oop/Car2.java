package ch06_1_oop;

public class Car2 {
	
	//�ʵ�
	
	String company = "�����ڵ���";
	String model;
	String color;
	
	int maxSpeed;
	
	//������ 
	Car2() {
	}
	//������1
	
	
	Car2(String model){
		this.model = model;
	}
	//������2
	Car2(String model,String color){
		this.model = model;
		this.color = color;
	}
	//������3
	Car2(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//������4
}
	
	
	

