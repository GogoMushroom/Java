package ch02_1_variable;

public class FloatDoubleExample {
public static void main(String[] args) {
		
		//실수값저장
		//float var1 = 3.14
		float var2 = 3.14f;
		double var3 = 3.14;
		
    //정밀도저장
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);		
			
		//e사용하기
		double var6 = 3e6; //3.0 x 10의6승
		float var7 = 3e6F; //3.0 x 10의6승float
		double var8 = 2e-3;  //2.0 x 10의-3승
		
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
		
	
	
	}

}

