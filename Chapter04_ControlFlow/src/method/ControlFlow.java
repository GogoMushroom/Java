package method;

public class ControlFlow {
	public static void main(String[] args) {
		
		double time = 0.0;
		boolean (open = true);
		while( true ) {
		//1. �� in 
		System.out.println("�ȳ��ϼ���^-^");
		//2. �Ŵ� �����ֱ�
		System.out.println("***~Display Meun~***");
		//3. �ֹ�����
		System.out.println("��ǰ �Է�");
		//4. ��ǰ����
		makeCoffee();
		//5. ������
		System.out.println("����");
		//6. �� OUT
		System.out.println("�� ������~");
		if (time > 21) {
			open = false;
			System.out.println("��������");
		}
		time++;
	}
}

static void makeCoffee() {
	System.out.println("-----");
}
}
/*
 *  �̷��� ���� �ʹ� ��ȿ������ �̤�
 *  �׷��� �츮�� �޼ҵ�(�Լ�)�� �����
 *  
 *  ��� ��ɺ��� ��� ���� �������Ҵٰ� �ʿ��ҋ� ȣ���ؼ� ��!
 *  
 *  
 */