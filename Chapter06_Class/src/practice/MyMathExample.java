package practice;

public class MyMathExample {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		//Ŭ���� �޼��� ȣ�� Ŭ�����̸�.�޼����̸�(�������� ...) ��ü�������� ȣ�� ����
		MyMath2 mm = new MyMath2(); // �ν��Ͻ� ���� 
		mm.a = 200L;
		mm.b = 100L	;	
		//                 �������� 		
		System.out.println(mm.add()); // �ν��Ͻ� �޼��� ȣ��
		// ��������.�޼ҵ��̸� (); 
		
	}
}