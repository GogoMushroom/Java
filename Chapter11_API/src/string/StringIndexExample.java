package string;


//indexOf if문의 조건식에서 특정 문자열이 포함되어있는지 여부에 따라 실행코드를 달리할때 사용
//-1을 리턴하면 특정 문자열이 포함되어 있지 않다 는 뜻 

public class StringIndexExample {
	public static void main(String[] args) {
		String subject = "자바프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);;
		
		if (subject.indexOf("자바")!=-1) {
			System.out.println("자바 관련 책");
		} else {
			System.out.println("자바 관련 책 아님");
		}
		
	}
}
