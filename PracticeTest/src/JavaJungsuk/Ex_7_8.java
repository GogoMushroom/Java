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
		//조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); //가격 100
	}
	//Object클래스의 tostring()을 오버라이딩 한다
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
			 System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		 return;
		 }
		 
		 money -= p.price;
		 bonusPoint +=p.bonusPoint;
		 System.out.println(p+"구입하셧습니다.");
		 System.out.println(p.toString()+"구입하셧습니다.");
		 
	 }
 }


public class Ex_7_8 {
	public static void main(String[] args) {
		
	Buyer b = new Buyer();
	
	b.buy(new Tv());
	b.buy(new Computer());
	
	System.out.println("현제 남은 돈 "+b.money +"만원입니다.");
	System.out.println("현제 보너스접수 "+b.bonusPoint+"점입니다.");
	
	
	}
}
