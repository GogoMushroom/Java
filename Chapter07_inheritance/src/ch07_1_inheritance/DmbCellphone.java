package ch07_1_inheritance;
//                                 is ���� ��� ����
public class DmbCellphone extends Cellphone {
//             �ڽ�Ŭ���� 				�θ�Ŭ����
	//�ʵ� 
	//Cellphne ���� ��ӵ� �ʵ�� �Ƚᵵ�� 
	int channel;
	
	//has ���� 
	//Cellphone cell;
	
	
	//������ 

//		�����ڸ� ������� �ʾҴٸ� 
//		DmbCellphone(){
//		super();
//	    }
//		�����ڰ� �ڵ� ������ 	
	
	DmbCellphone (String model, String color, int channel){                             		
		this.model = model;
		this.color = color;//Cellphone Ŭ�������� ��ӹ����� 
		
		this.channel = channel; //���� Ŭ������ �ִ� �ʵ�
		System.out.println("�ڽĻ����� call");
	}
	//�޼ҵ�
	void turnOnDmb () {
		System.out.println("ä��" + channel + "��" );
	}
	void ChangeChannelDmb (int Channel) {
		this.channel = channel;
		System.out.println("ä��" + channel +"�ٲ�");
	}
	void turnOffDmb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
}
