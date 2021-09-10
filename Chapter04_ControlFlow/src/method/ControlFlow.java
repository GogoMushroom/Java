package method;

public class ControlFlow {
	public static void main(String[] args) {
		
		double time = 0.0;
		boolean (open = true);
		while( true ) {
		//1. 고객 in 
		System.out.println("안녕하세요^-^");
		//2. 매뉴 보여주기
		System.out.println("***~Display Meun~***");
		//3. 주문접수
		System.out.println("상품 입력");
		//4. 상품제조
		makeCoffee();
		//5. 고객전달
		System.out.println("서빙");
		//6. 고객 OUT
		System.out.println("또 오세요~");
		if (time > 21) {
			open = false;
			System.out.println("영업종료");
		}
		time++;
	}
}

static void makeCoffee() {
	System.out.println("-----");
}
}
/*
 *  이렇게 히면 너무 비효울적임 ㅜㅜ
 *  그래서 우리가 메소드(함수)를 사용함
 *  
 *  어떠한 기능별로 묶어서 따로 만들어놓았다가 필요할떄 호출해서 씀!
 *  
 *  
 */