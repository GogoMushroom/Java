package practice;

class TvExample {
	public static void main(String[] args) {
		Tv t;//Tv �ν��Ͻ��� �����ϱ� ���� ����t���� //�ν��Ͻ� =��ü  ->��ü����
		t= new Tv();//Tv �ν��Ͻ� ����					 ->��ü����
		t.channel = 7;//Tv �ν��Ͻ��� ������� channel �� ����7ȣ          ->��ü���(�������)
		t.channelDown(); // Tv �ν��Ͻ� �޼ҵ� channelDown �� ȣ��   ->��ü���(�޼ҵ���)
		System.out.println("����ü����" + t.channel + "�Դϴ�.");
	}
}
class Tv {
	// Tv�� �Ӽ� �������
	String color;
	boolean power;
	int channel;
	
	//Tv�� ��� �޼ҵ� 
	void power() {power =! power;}
	void channelUp() {++channel;}
 	void channelDown() {--channel;}
}
