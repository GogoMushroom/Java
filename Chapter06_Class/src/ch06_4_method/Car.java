package ch06_4_method;

public class Car {
//�ʵ�
	int gas;
	
	
//������
	//�Ƚ��ָ� ������ �Ҷ� �⺻ ������ �������� 
//�޼ҵ� 
		void setGas(int gas) { //���ϰ��� ���� void
			this.gas =  gas;
		}
		
		boolean isLeftGas() { //boolean ���ϰ��� f or t 
			if (gas ==0) {
				System.out.println("gas�� �����ϴ�.");
				return false; //false�� ����
		 	}
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
		void run () {
			while(true) {
				if (gas > 0) {
					System.out.println("�޸��ϴ�.(gas�ܷ�:"+gas+")");
					gas--; // ����� ���� ���� -1
					
				} else {
					System.out.printf("����ϴ�.(gas�ܷ�:%d)\n",gas);
					return; //�޼ҵ� ���� ����
				}
			}
		}
	
}
