package ch07_2_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		  
		Driver d= new Driver(); //����̹� ��ü ���� 
		
		Bus bus = new Bus(); //���� ��ü ���� 
		//vehicle ���� ��ӹ��� bus �ڷ����� ��ü ����
		Taxi taxi = new Taxi(); //�ý� ��ü ���� 
		
		d.drive(bus); //drive �� Vehicle �ڷ����� �������� �ϴµ�  bus �� Bus �ڷ����� 
		// ������ Bus�� Vehicle�� ��ӹ��� Ŭ���� �̱� ������ Vehicle��� Bus �ڷ����� ����ص��ȴ�. 
		//d.drive((Vehicle)new b()); �̶���������
		d.drive(taxi);
		
		
		
		Vehicle v = new Bus();
	}
}
