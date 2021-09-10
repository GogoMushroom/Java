package ch07_2_polymorphismEx;

//��Ӿ��� ���� �ڵ�(MyFriends)�� ��ӱ����� �����غ��ƶ�

//ģ��
class F{
	//�ʵ�
	private String name;
	private String num;
	
	//������
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
		System.out.println("�̸�:" + name);
		System.out.println("��ȣ:" + num);		
	}
}	


//����ģ��
class UF extends F{
	//�ʵ�
	private String major;
	//������
	public UF (String na, String num, String ma) {
		super(na,num);
		major=ma;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("����:" + major);
	}	
}

//���嵿��
class CF extends F {
	//�ʵ� 
	private String department;
	//�ʱ�ȭ
	public CF(String na, String dp, String num) {
		super(na,num);
		department= dp;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ�:" + department);
	}
}

public class MyFriends2 {
	public static void main(String[] args) {



		//F�ڷ����� �θ� Ŭ������ �Ǿ F�ڷ������� UF�� CF�� �Ѵ� ��밡�� 

		//ģ���� ������ ���� �迭�� ���� 
		F[] f = new F[6];
		int cnt = 0;

		//����ģ���߰�
		f[cnt++] = new UF("lee", "computer", "010-0000-0000") ;
		//f �� �ϳ� �߰��ɋ����� cnt �� 1�� �����Ѵ�. �ε����� 0 ���� �����ϱ⶧���� �������� 
		f[cnt++] = new UF("seo", "electronics", "010-1111-1111");
		f[cnt++] = new UF("kim", "math", "010-2222-2222");

		//����ģ���߰� 
		f[cnt++] = new CF("LEE", "R&D", "010-1111-2222");
		f[cnt++] = new CF("KIM", "R&D", "010-2222-2222");
		f[cnt++] = new CF("PARK", "R&D", "010-3333-2222");

		//ģ����� �ϰ���� 
		for (int i=0; i<f.length; i++) {
			f[i].showInfo();
			if(f[i].getName().equalsIgnoreCase("lee")){
				System.out.println("lee : ��� "+ (i+1) + "�������� ã�ҽ��ϴ�.");
			}
		}
	}
}	



