package ch06_4_method;

class Util{

	public void calcExec() {
		
		Calculator myCalc = new Calculator(); // Calculator class�� �����ͼ� ����Ѵ�. 

		//���� �ѱ� 
		myCalc.powerOn();
		
		//����ϱ�
		int var1 = myCalc.plus(8, 8) ;
		System.out.println(var1);
		
		//�������
		myCalc.powerOff();
		
		double var2= myCalc.devide(10, 1);
		System.out.println(var2);
		
		byte x=10; //�Ű����� Ÿ�԰� �Ű������� Ÿ���� �޶� byte�� intŸ������ �ڵ���ȯ�ȴ�.
		byte y=4;   // byte�� ���ս��� �Ͼ�� �ݱ� ������ ������ ������ ���� ���� double���� ���ս��� �Ͼ�� ������ �� 
		double var3= myCalc.devide(x, y);
		System.out.println(var3);
		
		
	}
	
	
}

public class CalculatorExample {
	//calculator class�� ����Ҳ��� 
	public static void main(String[] args) {
		
		Util util = new Util();
		util.calcExec();
		
	}
}
