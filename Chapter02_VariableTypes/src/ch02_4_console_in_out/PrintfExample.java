package ch02_4_console_in_out;

public class PrintfExample {

	public static void main(String[] args) {
		
		//System.out.printf("��Ÿ������ �ϴ� ���ڸ� �״�� �����ָ��");

		System.out.printf("�̸�:%s\n","���ڹ�\n");
		
		//%d ���ø� %x ���
		System.out.printf("����:%d\n", 27 );
		System.out.printf("����:%x\n", 27 );
		System.out.println("����:" + 27);
		//println ���� �� ������
		System.out.printf("����:%e\n", 158.7 );
		//%e ����ǥ���� 
	
		// %x , %s , %d ,% f  
		
		
		
		System.out.printf("�̸��� %s ���̴� %d�� �Դϴ�.\n", "���ڹ�" ,27 );
		
		int value = 123;
		System.out.printf("��ǰ�� ����: %d��\n", value);
		System.out.printf("��ǰ�� ����: %6d��\n", value);
		System.out.printf("��ǰ�� ����: %-6d��\n", value);
		System.out.printf("��ǰ�� ����: %06d��\n", value);
		// ���� ������ ���� ,���ڸ� ä���
				
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %010.2f\n", 10 , area);
		//                             10=��ü 10�ڸ� , .2 �Ҽ���°�ڸ� ǥ�� 
		System.out.printf("�������� %d�� ���� ����: %f\n", 10 , area);
		
		
		
		
		
		
		
	}
}
