package ch07_2_polymorphismEx;


// �θ� Ŭ���� (��ȭ��� �������)
class MobilePhone {
	//�ʵ�
	protected String number; //��ȭ��ȣ 
	//public ���� �� ���� //private �ƹ��� ���� ���� 
	//�ƹ��͵� �� ������ default 
	//protected ���� ��Ű�� �ų� �ٸ���Ű������ ��ӹ��� ����� ��밡�� 


	//������
	public MobilePhone(String num) { //() �ȿ� number�� ȣ��ȭ �� ���� �־������ 
		this.number = num;// this �������� 

	}
	//�޼ҵ� 
	//��ȭ �޴� ��ɸ� ���� ������
	public void recieve() { //���ϰ����� 
		System.out.println("hi from "+this.number);
	}

}

class SmartPhone extends MobilePhone{
	//�ʵ�
	private String androidVer;
	//������
	public SmartPhone(String num,String ver) { 
		//�θ� Ŭ�������ִ� num�� �޾ƿ�
		//String ���� �ȵ���̵�ver �ʱ�ȭ���� 
		super(num); //�θ� �� ���� String num�� �ޱ� ������   super�� �� ���ٿ� �����
		androidVer = ver; // �ڱⲨ �����ؾ߶�

	}
	//�޼ҵ�
	//�θ�Ŭ�������ִ� recieve �� ���������� 
	@Override
	public void recieve() {

		super.recieve();
		System.out.println("i am smart");
	}

	//���ο� ����� �߰����� //2���� ��ȭ �ɱ�, ���� �����Ű��
	public void send (String number) {
		System.out.println("Hello~ to" + number);
	}
	public void playApp() {
		System.out.println("app is running in " + androidVer);
	}
}

	public class MoblieSmartPhone{

		public static void main(String[] args) {
			//����Ʈ�� ��ü ����
			SmartPhone phone = new SmartPhone("010-0000-1111", "android7.0");
			//��ȭ�ɱ�
			phone.send("010-2222-3333");
			//��ȭ�ޱ�
			phone.recieve();
			//���� ��å�Ͽ� �����ϱ�
			phone.playApp();
		}
	}

