package test;

public class ch03test02_10 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
//		double var4 = var1*var1*var2 + "." + var3;
//   원의 넓이 구하는 공식 반지름 * 반지름 * 원주율		
		double var4 = var1*var1*Double.parseDouble(var2 + "." + var3);
// 뒤에가 3.14 가 나와야되서 int 에서 더블로 바꿔서 계산해줌 앞은 자동으로 더블로 바뀜  		
		
		System.out.println("원의 넚이:" + var4);
		
	}
}
