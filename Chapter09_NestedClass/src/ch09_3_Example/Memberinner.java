package ch09_3_Example;


class Outer{
	//인스턴스 멤버 
	int num= 0;
	//클래스 
	class Member{  //인스턴스 멤버 클래스 //중첩 클래스 
		//메소드
		void add(int n) {
			num += n;
		}
		int getnum() {
			return num;
		}
	}
}




public class Memberinner {
	public static void main(String[] args) {
		
	//밖 클래스 먼저 생성해줌 
		
		Outer o1 = new Outer();
		Outer o2 = new Outer();
		
		//o1과o2는 다름  
		System.out.println(o1==o2);
		
		//o1 기반으로 두 인스턴스 생성 
		Outer.Member o1m1 = o1.new Member(); //o1의 멤버1 인스턴스 
		//자료형Outer.Member 참조변수.new
		Outer.Member o1m2 = o1.new Member(); //o1의 멤버2
		
		//o2 기반으로 두 인스턴스 생성
		Outer.Member o2m1 = o2.new Member();
		Outer.Member o2m2 = o2.new Member();
		
		//o1기반으로 생성된 두 인스턴스의 메소드 호출  //void add(int n) 호출
		o1m1.add(5);
		System.out.println(o1m1.getnum());
		//o2를 기반으로 생성된 두 인스턴스의 메소드 호출 
		o2m1.add(7);
		System.out.println(o2m2.getnum());
		//0이 아니고 7 이 나오는 이유는? 
		//outer.num이 o2m1.add(7); 로 인해 7이 되어있는 상태에서 o2m2를 호출하면  
		//outer.num은 그대로 7로 찍히게된다.
		
	
		
		
		}
	}
	
	

