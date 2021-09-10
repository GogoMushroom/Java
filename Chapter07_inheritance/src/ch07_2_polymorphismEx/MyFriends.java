package ch07_2_polymorphismEx;

//��Ӿ��� ���� �ڵ��� ��ӱ����� �����غ��ƶ�

//����ģ��
class UnivFreinds{
	//�ʵ�
	private String name;
	private String major;
	private String num;
	//������
	public UnivFreinds(String na, String ma, String num) {
		name =na;
		major = ma;
		this.num =num;
	}
	//�޼ҵ�
	public void showInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + major);
		System.out.println("��ȣ:" + num);

	}	
}

//���嵿��
class CompF {
	//�ʵ� 
	private String name;
	private String department;
	private String num;
	//�ʱ�ȭ
	public CompF(String na, String dp, String num) {
		name =na;
		department = dp;
		this.num =num;
	}
	public void showInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("�μ�:" + department);
		System.out.println("��ȣ:" + num);
	}
}

public class MyFriends {
	public static void main(String[] args) {

		//����ģ���� ������ ���� �迭�� ���� 
		UnivFreinds[] uf = new UnivFreinds[3];
		int ucnt = 0;

		//���嵿���� ������ ���� �迭�� ����
		CompF[] cf = new CompF[3];
		int ccnt = 0;

		//����ģ���߰�
		uf[ucnt++] = new UnivFreinds("lee", "computer", "010-0000-0000") ;
		//uf �� �ϳ� �߰��ɋ����� ucnt �� 1�� �����Ѵ�. �ε����� 0 ���� �����ϱ⶧���� �������� 
		uf[ucnt++] = new UnivFreinds("seo", "electronics", "010-1111-1111");
		uf[ucnt++] = new UnivFreinds("kim", "math", "010-2222-2222");

		//����ģ���߰� 
		cf[ccnt++] = new CompF("lee", "R&D", "010-1111-2222");
		cf[ccnt++] = new CompF("KIM", "R&D", "010-2222-2222");
		cf[ccnt++] = new CompF("PARK", "R&D", "010-3333-2222");

		//����ģ����� �ϰ���� 
		for (int i=0; i<uf.length; i++) {
			uf[i].showInfo();	
		}
		
		System.out.println();
		
		//����ģ����� �ϰ���� 
		for (int i=0; i<cf.length; i++) {
			cf[i].showInfo();
		}

	}	

}	

