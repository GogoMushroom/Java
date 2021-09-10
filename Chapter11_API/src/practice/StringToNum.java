package practice;

//문자열읋 숫자로 변환하는 다양한 방법 


public class StringToNum {

	
	int i = new Integer("100").intValue(); //wrapper클래스를 기본형으로 바꿈 
	int i2 = Integer.parseInt ("100");  // 문자열을 기본형을 바꿈
	Integer i3 = Integer.valueOf("100"); //문자열을 wrapper클래스로 변환
	
	int i4 = Integer.parseInt("100",2); //2진수 100(2)->4 
	int i5 = Integer.parseInt("100",8); //8진수 100(8)->64
	int i6 = Integer.parseInt("100",16); //16진수 100(16)->256
	int i7 = Integer.parseInt("FF",16);  //16진수 100(16)->255
	int i8 = Integer.parseInt("FF");//아무것도 안써있으면 10진수 ,10진수에는 FF가 없어서 오류 
	
}
