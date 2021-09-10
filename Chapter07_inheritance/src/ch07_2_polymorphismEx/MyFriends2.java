package ch07_2_polymorphismEx;

//상속없이 만든 코딩(MyFriends)을 상속구조로 변경해보아라

//친구
class F{
	//필드
	private String name;
	private String num;
	
	//생성자
	public String getName() {
		return name;
	}
	public String getNum() {
		return num;
	}
	
	public F(String na, String num) {
		name = na;
		this.num = num;
		
		
		
	}
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("번호:" + num);		
	}
}	


//대학친구
class UF extends F{
	//필드
	private String major;
	//생성자
	public UF (String na, String num, String ma) {
		super(na,num);
		major=ma;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공:" + major);
	}	
}

//직장동료
class CF extends F {
	//필드 
	private String department;
	//초기화
	public CF(String na, String dp, String num) {
		super(na,num);
		department= dp;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("부서:" + department);
	}
}

public class MyFriends2 {
	public static void main(String[] args) {



		//F자료형이 부모 클래스가 되어서 F자료형으로 UF와 CF가 둘다 사용가능 

		//친구의 관리를 위한 배열과 변수 
		F[] f = new F[6];
		int cnt = 0;

		//대학친구추가
		f[cnt++] = new UF("lee", "computer", "010-0000-0000") ;
		//f 가 하나 추가될떄마다 cnt 가 1씩 증가한다. 인덱스는 0 부터 시작하기때문에 후위연산 
		f[cnt++] = new UF("seo", "electronics", "010-1111-1111");
		f[cnt++] = new UF("kim", "math", "010-2222-2222");

		//직장친구추가 
		f[cnt++] = new CF("LEE", "R&D", "010-1111-2222");
		f[cnt++] = new CF("KIM", "R&D", "010-2222-2222");
		f[cnt++] = new CF("PARK", "R&D", "010-3333-2222");

		//친구목록 일괄출력 
		for (int i=0; i<f.length; i++) {
			f[i].showInfo();
			if(f[i].getName().equalsIgnoreCase("lee")){
				System.out.println("lee : 목록 "+ (i+1) + "번지에서 찾았습니다.");
			}
		}
	}
}	



