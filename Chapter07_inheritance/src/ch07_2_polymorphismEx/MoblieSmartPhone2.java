package ch07_2_polymorphismEx;
//
//
//// �θ� Ŭ���� (��ȭ��� �������)
//class MobilePhone {
//	//�ʵ�
//	protected String number; //��ȭ��ȣ 
//	//public ���� �� ���� //private �ƹ��� ���� ���� 
//	//�ƹ��͵� �� ������ default 
//	//protected ���� ��Ű�� �ų� �ٸ���Ű������ ��ӹ��� ����� ��밡�� 
//
//
//	//������
//	public MobilePhone(String num) { //() �ȿ� number�� ȣ��ȭ �� ���� �־������ 
//		this.number = num;// this �������� 
//
//	}
//	//�޼ҵ� 
//	//��ȭ �޴� ��ɸ� ���� ������
//	public void recieve() { //���ϰ����� 
//		System.out.println("hi from "+this.number);
//	}
//
//}
//
//class SmartPhone extends MobilePhone{
//	//�ʵ�
//	private String androidVer;
//	//������
//	public SmartPhone(String num,String ver) { 
//		//�θ� Ŭ�������ִ� num�� �޾ƿ�
//		//String ���� �ȵ���̵�ver �ʱ�ȭ���� 
//		super(num); //�θ� �� ���� String num�� �ޱ� ������   super�� �� ���ٿ� �����
//		androidVer = ver; // �ڱⲨ �����ؾ߶�
//
//	}
//	//�޼ҵ�
//	//�θ�Ŭ�������ִ� recieve �� ���������� 
//	@Override
//	public void recieve() {
//
//		super.recieve();
//		System.out.println("i am smart");
//	}
//
//	//���ο� ����� �߰����� //2���� ��ȭ �ɱ�, ���� �����Ű��
//	public void send (String number) {
//		System.out.println("Hello~ to" + number);
//	}
//	public void playApp() {
//		System.out.println("app is running in " + androidVer);
//	}
//}
public class MoblieSmartPhone2{
	public static void main(String[] args) {
		//����Ʈ�� ��ü ����
		SmartPhone phone1 = new SmartPhone("010-0000-1111", "android7.0");
		MobilePhone phone3 = new MobilePhone("1234");

		//�θ�Ŭ������ �������� (phone2)s�� �ڽ�Ŭ���� (smartphone)�� �ν��Ͻ��������� �� �ִ�.
		//MobliePhone�� ������ Smartphone ���� �ν��Ͻ��� ���� �����ϴ�.
		//�ڷ����� �ڵ�����ȯ�� �Ǿ smartphone ���� mobliephone ���� �ȴ�.
		MobilePhone phone2 = new SmartPhone("010-1111-2222", "android7.0");
		//double phone2 = int phone; 
		//�ڷ����� �ڵ�����ȯ�� �Ǿ int �� double �� �ٲ��.

		//SmartPhone phone4 = phone3;
		//SmartPhone phone4 = new MobilePhone("1234");
		SmartPhone phone4 = (SmartPhone)new MobilePhone("1234");
		//�θ�Ŭ������ �ڽ�Ŭ������ ����ȯ�� �ȵ� 
		//(SmartPhone)�� ����ؼ� ���� ����ȯ �� ����� 		


		phone2.recieve();
		//�ڽ�Ŭ������ �θ�Ŭ������ �ڵ����з� �߱⶧���� �θ�Ŭ���� �ȿ��ִ� �޼��常 ��밡�� 
		//�ٵ� �� �޼��尡 �������̵��ȰŶ�� �������̵� �� �޼��尡 ���ȴ�.


		//��ȭ�ɱ�
		phone1.send("010-2222-3333");
		//phone2.send("010-2222-3333");//phone2�� �θ�Ÿ������ ����ȯ�ȰŶ� send�� ����� �� ���� 8��8
		//��ȭ�ޱ�
		phone1.recieve();
		phone2.recieve();

		//���� ��å�Ͽ� �����ϱ�
		phone1.playApp();
		//phone2.playApp(); // ���� ����ȵ� 
	}
}

