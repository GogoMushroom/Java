package ch04_1_if;

public class SwitchExample {
	public static void main(String[] args) {

//		int score = 85;
//		char grade; //점수 0 부터 59 가 갈곳이 없으니까 초기화 해줘서 기본 값을 정해줘야함 
		//	char grade = (score > 90) ? 'A' : ((score >  80) ? 'B' : 'C');


		//		if (score >90) {
		//			grade = 'A';
		//		} else if (score >= 80 && score <90) {
		//			grade = 'B';
		//		} else if (score >= 70 && score <80) {
		//			grade = 'C';
		//		} else if (score >= 60 && score <70) {
		//			grade = 'D';		
		//		} else {
		//			grade = 'F';
		//		}
		//		// 초기화하지않으려면 else를 입력해준다.
		//		System.out.println(grade);


		//switch문으로 바꿔보기

//		switch(score) {
//		case 100 : 
//		case 99 : 
//		case 98 : 
//		case 97 :
//		case 96 :
//		case 95 :
//		case 94 :	
//			grade='A';
//			break;
//		case 89 :
//		case 88 :
//		case 87 :
//			grade='B';
//			break;
//		}
		
		
		
		int month = 3;
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		}	
				
		}
		
		
	}

