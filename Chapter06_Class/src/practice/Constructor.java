package practice;


	
	class Data1 {
		int value;// 생성자가 하나도 없기떄문에 기본생성자가 컴파일러에서 만들어짐 
		
	}
	
	class Data2 {
		int value;
		
		//기본 생성자를 써줘야함 
		
		Data2 (int x) {
			value = x;   // 매개변수가 있는 생성자 
			
		}
	}
	
	public class Constructor {
		public static void main(String[] args) {
			
	Data1  d1 = new Data1();
//	Data2  d2 = new Data2(); // 컴파일에러 Data2에 기본 생성자가 없기때문 
	
	
	
		}
}
