package ch10_3_example;

public class Program {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		
		System.out.println(a/b);
		
		System.out.println("종료");
	
		
		/*
		 * 오류
		 * 	-구문오류 : 치명적이지않음 (문법오류 : 컴파일 수정 가능)
		 * 	-논리오류 : 치명적임 (개발자코딩(문법적 문제제외) 오류 ): 수식 계산 
		 *  -예외 : 입력값, 입출력괄련, 물리적 장치 사용 ( 우군가만.. 어ㄸㄴ 컴에서만
		 *  ...어떤상황에서만..예외적으로 발생)
		 *  
		 *  예외를 처리한다?
		 *   무엇을?
		 *   어디서?
		 *   
		 *   예시 ) 파일 입출력시 api 이용 
		 *   : api 함수에서 예외를 알아서 처리한다면?
		 *   
		 *   write () {             관리프로그램
		 *   권한			오류발생              	  try
		 *   파일존재	   ------->		write();
		 *   파일용량 		  보고
		 *   ...      throw 예외객체         catch
		 *   						   오류처리
		 *   }
		 *  
		 *  
		 */		
	}
}


