package ch06_1_oop;

public class Student {
	int num =0 ;//필드

	//Student(){
	//	
	//} 
	//이게 원래 자동으로 들어가 있어야 함 //생성자
	
	Student(){
		num =100;	
	} 
	// 안쓰면 자동으로 컴파일러가  만들어줌 

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
