package ch06_5_insrance_static;

public class PersonExample {
	public static void main(String[] args) {
	
		Person p1 = new Person ("123456-1234567","ȫ�浿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";//final�� �ʱⰪ�� ���ٲ� 
		//p1.ssn = "111111-2222222";
		p1.name = "���ڹ�";	
		

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}

