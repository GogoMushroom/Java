package ch08_1_interface;


interface RemoteControl{
	//���
	public static final int MAX_VOLUME = 10; //static final �ٿ��ֱ�
	public int MIN_VOLUME = 0; //�޸𸮻����δ� �޼ҵ念���� ����
	// �������� �� ���� ������ �Ⱥٿ��ָ� �ڵ����� �ٿ��ֱ⶧�� 
	
	//�߻�޼ҵ�
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);// �޼ҵ� ����θ� �ۼ�
	//abstract �� ������ ������ �ڵ����� �ٿ��ش�.
	//�����θ� ���� = ����ؼ� �����ؾ��� 
	
	//extends
	//�θ𿡼� ���� / ���Ǹ� ����ϸ� �ڽ��� �޼ҵ� / ������ �״�� ����� �� ����
	//implements (interface ����)
	//�θ� ��ü�� ���� �ϸ� ����(����)�� �ڽĿ��� �������̵� (������) �ؼ� ����ؾ���
}
class Television implements RemoteControl{
	//implements=����� �����ߴ�.
	//tv�� ������ ����� �����Ѵ�.
	//
	//�ʵ�
	private int volume;
	
	
	//turnOn () �߻� �޼ҵ��� ���� �޼ҵ� 
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	//turnOff () �߻� �޼ҵ��� ���� �޼ҵ� 
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");	
	}
	//setVolume() �߻�޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int Volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� tv ���� " + this.volume);
	}
}

class Audio implements RemoteControl{
	//�ʵ�
	private int volume;
	//turnOn () �߻� �޼ҵ��� ���� �޼ҵ� 
		public void turnOn() {
			System.out.println("������� �մϴ�.");
		}
		//turnOff () �߻� �޼ҵ��� ���� �޼ҵ� 
		public void turnOff() {
			System.out.println("������� ���ϴ�.");	
		}
		//setVolume() �߻�޼ҵ��� ��ü �޼ҵ�
		public void setVolume(int Volume) {
			if (volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if (volume<RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("���� Audio ���� " + this.volume);
		}
	}
	

public class RemoteControlExample {
	public static void main(String[] args) {
		// �� ������ ���ڱ�Ⱑ �ϼ��Ǿ�߸� �����ڵ带 �ۼ��� �� �ִ�.

		
		
		 
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
//		RemoteControl rc = new Television();
//		rc.turnOn();
//		rc.setVolume(100);
//		rc.turnOff();
//		
	}
}


