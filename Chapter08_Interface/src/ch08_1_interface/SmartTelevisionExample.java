package ch08_1_interface;
interface Searchable {// ����߽� able
	void search(String url);
}




class SmartTelevision implements RemoteControl, Searchable{
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV���մϴ�");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�����ϴ�");
	}
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� " + this.volume);

	}
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}

}

public class SmartTelevisionExample{
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		
		stv.turnOn();
		stv.turnOff();
		stv.search("google");
		
		RemoteControl rc = stv;
		//smartTelevision�� remotecomtrol�� �ڵ�����ȯ�� �Ͼ
		rc.turnOn();
		//����ȯ�� �Ͼ�� ����ƮƼ���� ����� ����� �� ���� 
		//�������� ��ɸ� ��밡�� 
		
		Searchable sc= stv;
		//smartTelevision�� searcheble�� �ڵ�����ȯ�� �Ͼ
		sc.search("www.google.com");
		//Searchable �� ��ɸ� ��밡�� 
		
	}
}
