package ch05_1_Reference_variable;

public class StringEqualsExample02 {
	public static void main(String[] args) {
		
		
		String a ="";
		String b =null;
		System.out.println(a == b);  //a는 "" 이고 b는 null(객체가 없음)
		System.out.println(a.equals(b)); // 서로 다른거임
		
		
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";


		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}


		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
