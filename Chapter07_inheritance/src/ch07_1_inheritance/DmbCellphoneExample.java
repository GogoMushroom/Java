package ch07_1_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		//DmbCellphone ��ü ����
		DmbCellphone dc = new DmbCellphone("�ڹ���", "����", 10);
		
		//Cellphone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��" + dc.model);
		System.out.println("��" + dc.color);
		
		//DmbCellphone Ŭ������ �ʵ� 
		System.out.println("ü��" + dc.channel);
		
		//Cellphone Ŭ�����κ��� ������� �޼ҵ� ȣ�� 
		dc.powerOn();
		dc.powerOff();
		dc.sendVoice("�ȳ��ϼ���");
		dc.recieveVoice("�ȳ��ϼ���");
		dc.sendVoice("�ȳ����輼��");
		dc.hangUp();
		
		//DmbCellphone Ŭ������ �޼ҵ�  ȣ�� 
		dc.turnOffDmb();
		dc.ChangeChannelDmb(12);
		dc.turnOffDmb();
		
		
	}

}
