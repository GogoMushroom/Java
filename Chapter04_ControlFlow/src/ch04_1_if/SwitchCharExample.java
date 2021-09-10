package ch04_1_if;

public class SwitchCharExample {
	public static void main(String[] args) {
		
		char grade = 'B';

		
		switch(grade) {
		case'A':
		case'a':
			//break를 각 케이스마다 걸어주지 않아도 됨 
			System.out.println("우수 회원입니다.");
			break;
		case'B':
		case'b':
			System.out.println("일반 회원입니다.");		
			break;
		default:
			System.out.println("손님입니다.");
			// a 와 b 가 아닌 나머지 값은 default값
		}
	}
}
