package practice;

//���ڿ��� ���ڷ� ��ȯ�ϴ� �پ��� ��� 


public class StringToNum {

	
	int i = new Integer("100").intValue(); //wrapperŬ������ �⺻������ �ٲ� 
	int i2 = Integer.parseInt ("100");  // ���ڿ��� �⺻���� �ٲ�
	Integer i3 = Integer.valueOf("100"); //���ڿ��� wrapperŬ������ ��ȯ
	
	int i4 = Integer.parseInt("100",2); //2���� 100(2)->4 
	int i5 = Integer.parseInt("100",8); //8���� 100(8)->64
	int i6 = Integer.parseInt("100",16); //16���� 100(16)->256
	int i7 = Integer.parseInt("FF",16);  //16���� 100(16)->255
	int i8 = Integer.parseInt("FF");//�ƹ��͵� �Ƚ������� 10���� ,10�������� FF�� ��� ���� 
	
}
