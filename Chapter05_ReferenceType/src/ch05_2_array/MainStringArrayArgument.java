package ch05_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {//{kor v1.01 //args = {"kor", "v1.01"}
// 실행시 특정 조건에 따른 실행을 명령하고 싶을 때
		String version = ""; //버전정보가 들어옴
		if(args != null) { //null이 아닐경우
			version = args[0]; //버전정보는 첫번째값
			if(version.equals("kor")) { // 버전 값이  kor일시  // kor은 어디서 오는걸까?
				System.out.println("안녕하세요~" + args[0]);
		}else {//아니면
			System.out.println("Hello" +args[1]);
			
		}
	}
		
		
	}
}
