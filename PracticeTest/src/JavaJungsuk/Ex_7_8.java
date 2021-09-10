package JavaJungsuk;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint= (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100); //���� 100
	}
	//ObjectŬ������ tostring()�� �������̵� �Ѵ�
	@Override
	public String toString() {
		return "Tv";
	}
}
 class Computer extends Product{
	  Computer() {super(200);}
	  
	  public String toString() {return "Computer";}
	
 }
 class Buyer{
	 int money=1000;
	 int bonusPoint =0;
	 
	 void buy (Product p) {
		 if (money < p.price) {
			 System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
		 return;
		 }
		 
		 money -= p.price;
		 bonusPoint +=p.bonusPoint;
		 System.out.println(p+"�����ϼ˽��ϴ�.");
		 System.out.println(p.toString()+"�����ϼ˽��ϴ�.");
		 
	 }
 }


public class Ex_7_8 {
	public static void main(String[] args) {
		
	Buyer b = new Buyer();
	
	b.buy(new Tv());
	b.buy(new Computer());
	
	System.out.println("���� ���� �� "+b.money +"�����Դϴ�.");
	System.out.println("���� ���ʽ����� "+b.bonusPoint+"���Դϴ�.");
	
	
	}
}
