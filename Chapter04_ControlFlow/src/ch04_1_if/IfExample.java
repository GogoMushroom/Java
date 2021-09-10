package ch04_1_if;

public class IfExample {
	public static void main(String[] args) {

		int score = 75;
		char grade; //점수 0 부터 59 가 갈곳이 없으니까 초기화 해줘서 기본 값을 정해줘야함 
		//	char grade = (score > 90) ? 'A' : ((score >  80) ? 'B' : 'C');


		if (score >90) {
			grade = 'A';
		} else if (score >= 80 && score <90) {
			grade = 'B';
		} else if (score >= 70 && score <80) {
			grade = 'C';
		} else if (score >= 60 && score <70) {
			grade = 'D';		
		} else {
			grade = 'F';
		}
		// 초기화하지않으려면 else 입력해준다.
		System.out.println(grade);
	}
}

