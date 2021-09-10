package ch06_1_oop;

public class CarExample {
	public static void main(String[] args) {

		//객체 생성
		Car mycar = new Car ("기아차","카니발","흰색");
		Car secondcar = new Car ("현대","아반떼","회색","디젤");
		//Car 클래스를 사용하면 같은 형식을 여러개 찍을 수 있음
		//클래스의 구성요소가 다르면 다른 클래스임 

		// public Car(){}
		//
		//초기화(안썼는데 알아서 해줌)

		//필드값 읽기
		System.out.println("제작회사:" +mycar.company);
		System.out.println("모델명:" +mycar.model);
		System.out.println("색낄:" + mycar.color);
		System.out.println("최고속도:" + mycar.maxSpeed);
		System.out.println("현제속도" + mycar.Speed);
		System.out.println();
		System.out.println("제작회사:" +secondcar.company);
		System.out.println("모델명:" +secondcar.model);
		System.out.println("색낄:" + secondcar.color);
		System.out.println("최고속도:" + secondcar.maxSpeed);
		System.out.println("현제속도:" + secondcar.Speed);
		System.out.println("엔진:" + secondcar.engine);
		System.out.println();
		
		
		//필드값 변경 
		mycar.Speed = 60;
		System.out.println("수정된 속도:"+mycar.Speed);
	
		
	
	}
}
