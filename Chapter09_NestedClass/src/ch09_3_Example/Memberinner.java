package ch09_3_Example;


class Outer{
	//�ν��Ͻ� ��� 
	int num= 0;
	//Ŭ���� 
	class Member{  //�ν��Ͻ� ��� Ŭ���� //��ø Ŭ���� 
		//�޼ҵ�
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
		
	//�� Ŭ���� ���� �������� 
		
		Outer o1 = new Outer();
		Outer o2 = new Outer();
		
		//o1��o2�� �ٸ�  
		System.out.println(o1==o2);
		
		//o1 ������� �� �ν��Ͻ� ���� 
		Outer.Member o1m1 = o1.new Member(); //o1�� ���1 �ν��Ͻ� 
		//�ڷ���Outer.Member ��������.new
		Outer.Member o1m2 = o1.new Member(); //o1�� ���2
		
		//o2 ������� �� �ν��Ͻ� ����
		Outer.Member o2m1 = o2.new Member();
		Outer.Member o2m2 = o2.new Member();
		
		//o1������� ������ �� �ν��Ͻ��� �޼ҵ� ȣ��  //void add(int n) ȣ��
		o1m1.add(5);
		System.out.println(o1m1.getnum());
		//o2�� ������� ������ �� �ν��Ͻ��� �޼ҵ� ȣ�� 
		o2m1.add(7);
		System.out.println(o2m2.getnum());
		//0�� �ƴϰ� 7 �� ������ ������? 
		//outer.num�� o2m1.add(7); �� ���� 7�� �Ǿ��ִ� ���¿��� o2m2�� ȣ���ϸ�  
		//outer.num�� �״�� 7�� �����Եȴ�.
		
	
		
		
		}
	}
	
	

