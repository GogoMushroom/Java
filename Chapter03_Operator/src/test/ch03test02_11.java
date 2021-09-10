package test;
import java.util.Scanner;
public class ch03test02_11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디");
		String name = scanner.nextLine();

		System.out.println("패스워드");
		String strPassword = scanner.nextLine();

		if(name.equals("java")){
			
			if (strPassword.equals("12345"))	{ 
				
/*
 *  equals와 == 의 차이점 
 *  == 는 주소값을 비교하고 equals는 내용자체를 비교한다. 
 *  문자열을 비교할때는 equals를 사용해야하고 
 *  == 를 사용하려면 int로 변형해주자
 *  
 *  				
 */

				System.out.println("로그인 성공");

			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
	
	} else {        
		System.out.println("로그인 실패 : 아이디가 존재하지 않음");
	}
}
}


