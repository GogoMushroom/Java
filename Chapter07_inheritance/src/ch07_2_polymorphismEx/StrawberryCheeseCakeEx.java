package ch07_2_polymorphismEx;

class Cake{
	//�ʵ�
	//������ �⺻������ �������
	//�޼ҵ� 
	public void sweet() {System.out.println("Cake.sweet()");}
	public void send() {System.out.println("Cake Sending..."); }
}



class CheeseCake extends Cake{
	public void milky() {System.out.println("CheeseCake.milky()");}
	@Override
	public void send() {
		super.send();
		System.out.println("CheeseCake Sending..."); 
	}
}



class StrawberryCheeseCake extends CheeseCake {
	public void sour() {System.out.println("StrawberrtCheeseCake.sour()");}
	@Override
	public void send() {
		// TODO Auto-generated method stub
		super.send();
		System.out.println("StrawberryCheeseCake Sending...");}
}




public class StrawberryCheeseCakeEx {
	private static int i;

	public static void main(String[] args) {

		//StrawberryCheeseCake �ν��Ͻ��� CheeseCake �ν��Ͻ��̸鼭 Cake �ν��Ͻ��̴�.
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		StrawberryCheeseCake cake3 = new StrawberryCheeseCake();



		cake1.sweet();
		//StrawberryCheeseCake�� �ڷ��������� cake�� �����ϰ��ֱ�빮�� sweet�� ��밡��
		cake2.sweet();
		cake2.milky();
		//StrawberryCheeseCake�� �ڷ��������� cheesecake�� �����ϰ��ֱ�빮�� sweet�� milky��밡��
		cake3.sweet();
		cake3.milky();
		cake3.sour();

		/*
		 * �������� �� ���԰� ����ȯ 
		 */
		CheeseCake ca1 = new CheeseCake();
		//Cake ca2 = new CheeseCake();
		//ca2 = ca1;
		Cake ca2 = ca1;

		Cake ca3 = new CheeseCake(); //�ڵ�����ȯ���Ͼ~
		//CheeseCake ca4 = ca3;  // ca3�� Cake������ ����ȯ �Ǿ��⶧���� �� ���������� ���� �� ���� 
		CheeseCake ca4 = (CheeseCake)ca3; //�׷��� �����ϰ������ ���� ����ȯ ������� 

		/*
		 * �ϰ�ó��(�迭 �������� ����)
		 */
		//�迭�� ���� �ڷ����� ���� �� ���� 
		//StrawberryCheeseCake�� CheeseCake���� ������ �����ϴ�.
		//ġ������ũ ���������� ����� ���� ���� �迭�� �� �� �ִ�.
		//������������ũ�� ����ġ������ũ ġ���ɾ�ũ�� ���� �迭�� �� �� �ִ�.
		//���� �ڷ����� ���� ġ������ũ�� ����, ���⸦ �־��ָ� ��  

		//����ũ �迭 ����
		//CheeseCake [] cakes = new Cake[10];
		Cake [] cakes = new Cake[3]; //����ũ�� ���� �� �ִ� ���������� 3�� ���� 
		//����ũ 10�� ġ������ũ�� ����ũ�� ����ȯ
		cakes[0]= new Cake();
		cakes[1]= new CheeseCake();
		cakes[2]= new StrawberryCheeseCake();
		//��.... �ӳ�.... ����ũ �迭 1���� ����ũ�� ��� 
		//����ũ �迭 2���� ġ������ũ�� ��� 
		//����ũ �迭 3���� ġ������ũ�� ��Ƽ� 

		for(int i=0; i< cakes.length;i++ ) {
			//cakes [i]= new CheeseCake();
			cakes [i].send();
			
		//����ũ �迭�� ���� �ߴ��� �´� ����ũ�� �θ�Ŭ������ �������־ ���带 �� �� �־���.
		//�׸��� ���带 ���� �������̵� �ؼ� �־������ �������̵� �� ����� �� ���ư���.	

		
		}
	}
}