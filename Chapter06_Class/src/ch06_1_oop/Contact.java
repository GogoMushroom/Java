package ch06_1_oop;

public class Contact { //���θ޼ҵ尡 ���Ե� Ŭ���� 
	public static void main(String[] args) {
		//static �޼ҵ� ���� �޸𸮿� �޼ҵ带 ��������
		//���ε� class �Ҽ� �޼ҵ���
		Contact con = new Contact();//�޸𸮿��� ����, �ּҰ��� con�̶�� ������ ����  
		con.setName("���ڹ�");
			System.out.println(con.getName());
		con.setFaxNumber("0101010101");	
			System.out.println(con.getFaxNumber());
		con.setEmailAdress("wwwww@WWWWW");
			System.out.println(con.getEmailAdress());
	}



	}
}
 
class Contact { 
	//�ν��Ͻ������� Ŭ������ 
	String emailAdress;  
	String FaxNumber;
	String name; //�ʵ� 
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getFaxNumber() {
		return FaxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		FaxNumber = faxNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	}
	//���콺 ��Ŭ�� �ҽ� getters setters 

	}
