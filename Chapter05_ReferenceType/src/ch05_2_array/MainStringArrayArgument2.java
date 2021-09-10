package ch05_2_array;

public class MainStringArrayArgument2 {
	public static void main(String[] args) { //main 도 메소드 
		
		{
		int var = add(7,3);
		System.out.println(var); //10
		
		if(args.length != 2 ) {   //입력된 데이터의 값이 2가 아닐 결우
			System.out.println("값의 수가 부족합니다.");
			//System.exit(0); // 강제종료 이러면 안됨;;
			return; // 값이 없으면 그냥 빠져나가세요 
		}
		
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		System.out.printf("%d+%d=%d", num1,num2,result);
	} //-> 일루 리턴 하면됨
	//System.out.println("리턴됨");
	}
	//일반 함수나 메소드나 똑같음 
	private static int add(int i, int j) { //add 는 메소드  
		
		return i+j; //i+j의 값을 내보내서 호출한곳으로 간다 (7번쨰줄)
	}
  
}
