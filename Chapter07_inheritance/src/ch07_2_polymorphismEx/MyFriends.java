package ch07_2_polymorphismEx;

//상속없이 만든 코딩을 상속구조로 변경해보아라

//대학친구
class UnivFreinds{
	//필드
	private String name;
	private String major;
	private String num;
	//생성자
	public UnivFreinds(String na, String ma, String num) {
		name =na;
		major = ma;
		this.num =num;
	}
	//메소드
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("전공:" + major);
		System.out.println("번호:" + num);

	}	
}

//직장동료
class CompF {
	//필드 
	private String name;
	private String department;
	private String num;
	//초기화
	public CompF(String na, String dp, String num) {
		name =na;
		department = dp;
		this.num =num;
	}
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("부서:" + department);
		System.out.println("번호:" + num);
	}
}

public class MyFriends {
	public static void main(String[] args) {

		//대학친구의 관리를 위한 배열과 변수 
		UnivFreinds[] uf = new UnivFreinds[3];
		int ucnt = 0;

		//직장동료의 관리를 위한 배열과 변수
		CompF[] cf = new CompF[3];
		int ccnt = 0;

		//대학친구추가
		uf[ucnt++] = new UnivFreinds("lee", "computer", "010-0000-0000") ;
		//uf 가 하나 추가될떄마다 ucnt 가 1씩 증가한다. 인덱스는 0 부터 시작하기때문에 후위연산 
		uf[ucnt++] = new UnivFreinds("seo", "electronics", "010-1111-1111");
		uf[ucnt++] = new UnivFreinds("kim", "math", "010-2222-2222");

		//직장친구추가 
		cf[ccnt++] = new CompF("lee", "R&D", "010-1111-2222");
		cf[ccnt++] = new CompF("KIM", "R&D", "010-2222-2222");
		cf[ccnt++] = new CompF("PARK", "R&D", "010-3333-2222");

		//대학친구목록 일괄출력 
		for (int i=0; i<uf.length; i++) {
			uf[i].showInfo();	
		}
		
		System.out.println();
		
		//대학친구목록 일괄출력 
		for (int i=0; i<cf.length; i++) {
			cf[i].showInfo();
		}

	}	

}	

