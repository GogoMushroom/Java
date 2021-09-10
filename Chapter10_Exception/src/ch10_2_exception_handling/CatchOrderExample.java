package ch10_2_exception_handling;

public class CatchOrderExample {
	public static void main(String[] args) {

		try {

			String data1 = args[0];
			String data2 = args[1];
			int v1 = Integer.parseInt(data1);
			int v2 = Integer.parseInt(data2);
			int result = v1+v2;

			System.out.printf("%d+%d=%d",v1,v2,result);
	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족 ");
		}	catch(Exception e) {
			System.out.println("실행에 문제 있음 ");
		} finally {
			System.out.println("다시실행하세요");
		}
		System.out.println("프로그램종료");
	}
}