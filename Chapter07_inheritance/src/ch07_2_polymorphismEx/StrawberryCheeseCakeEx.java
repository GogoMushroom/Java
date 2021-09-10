package ch07_2_polymorphismEx;

class Cake{
	//필드
	//생성자 기본생성자 만들어짐
	//메소드 
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

		//StrawberryCheeseCake 인스턴스는 CheeseCake 인스턴스이면서 Cake 인스턴스이다.
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		StrawberryCheeseCake cake3 = new StrawberryCheeseCake();



		cake1.sweet();
		//StrawberryCheeseCake의 자료형이지만 cake를 참조하고있기대문에 sweet만 사용가능
		cake2.sweet();
		cake2.milky();
		//StrawberryCheeseCake의 자료형이지만 cheesecake를 참조하고있기대문에 sweet와 milky사용가능
		cake3.sweet();
		cake3.milky();
		cake3.sour();

		/*
		 * 참조변수 간 대입과 형변환 
		 */
		CheeseCake ca1 = new CheeseCake();
		//Cake ca2 = new CheeseCake();
		//ca2 = ca1;
		Cake ca2 = ca1;

		Cake ca3 = new CheeseCake(); //자동형변환이일어남~
		//CheeseCake ca4 = ca3;  // ca3가 Cake형으로 형변환 되었기때문에 더 작은범위에 넣을 수 없음 
		CheeseCake ca4 = (CheeseCake)ca3; //그래도 대입하고싶으면 강제 형변환 해줘야함 

		/*
		 * 일괄처리(배열 관점에서 정리)
		 */
		//배열은 같은 자료형만 넣을 수 있음 
		//StrawberryCheeseCake은 CheeseCake으로 참조가 가능하다.
		//치즈케이크 잠조형으로 만들면 둘은 같은 배열에 들어갈 수 있다.
		//초코지츠케이크와 딸기치즈케이크 치즈케아크는 같은 배열에 들어갈 수 있다.
		//같은 자료형을 가진 치즈케이크에 초코, 딸기를 넣어주면 됨  

		//케이크 배열 선언
		//CheeseCake [] cakes = new Cake[10];
		Cake [] cakes = new Cake[3]; //케이크를 담을 수 있는 참조변수를 3개 만듬 
		//케이크 10개 치즈케이크를 케이크로 형변환
		cakes[0]= new Cake();
		cakes[1]= new CheeseCake();
		cakes[2]= new StrawberryCheeseCake();
		//그.... 머냐.... 케이크 배열 1번에 케이크를 담고 
		//케이크 배열 2번에 치즈케이크를 담고 
		//케이크 배열 3번에 치즈케이크를 담아서 

		for(int i=0; i< cakes.length;i++ ) {
			//cakes [i]= new CheeseCake();
			cakes [i].send();
			
		//케이크 배열을 샌드 했더니 셋다 케이크를 부모클래스로 가지고있어서 샌드를 쓸 수 있었다.
		//그리고 샌드를 각각 오버라이딩 해서 넣어줬더니 오버라이딘 된 샌드로 잘 돌아간다.	

		
		}
	}
}