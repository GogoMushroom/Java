package extra;

import java.util.Scanner;

public class SSS {
	static int price = 0;
	
	Scanner sc = new Scanner(System.in);
	public String Go = "���� �������� �ʾҽ��ϴ�.";
	public String Back = "���� �������� �ʾҽ��ϴ�.";
	
	String f1 = "��� 7:00~ ���� 9:00";
	String f2 = "��� 10:00~ ���� 13:00";
	String f3 = "��� 16:00~ ���� 18:00";
	String g = "�����������";
	String c = "�����������";
	int p1 = 70000;
	int p2 = 80000;
	int p3 = 90000;
	int p4 = 100000;
	int p5 = 110000;
	
	

	
	//������ �����	
	//����� ������ price �� ����ȴ�.

	public void Plane() {
		try {
		
	System.out.println(g);
	System.out.println("time table");
	System.out.println("1.");
	System.out.println("�Ǧ���������������������������������������������������������������������������������������");
	System.out.println("	"+f1+"        ");
	System.out.println("�Ŧ���������������������������������������������������������������������������������������");
	System.out.println("2.");
	System.out.println("�Ǧ���������������������������������������������������������������������������������������");
	System.out.println("	"+f2+" ");
	System.out.println("�Ŧ���������������������������������������������������������������������������������������");
	System.out.println("3.");
	System.out.println("�Ǧ���������������������������������������������������������������������������������������");
	System.out.println("	"+f3+"");
	System.out.println("�Ŧ���������������������������������������������������������������������������������������");
	
	System.out.println();
	System.out.println("�̿��Ͻ� �������� ������ �ּ���");
	String num=sc.nextLine();
	if(num.equals("1")) {
		Go = "f1";
		price += p1;
		
		System.out.println();
		System.out.println(f1+"����:"+price+"��");
	}else if (num.equals("2")){
		Go = "f2";
		price += p2;
	
		System.out.println();
		System.out.println(f2+"����:"+price+"��");
	}else if (num.equals("3")){
		Go = "f3";
		price +=p3;
		
		System.out.println();
		System.out.println(f3+"����:"+price+"��");
	}
	System.out.println();
	System.out.println();
	System.out.println();
		}catch(Exception e ) {}
	}

	void PlaneT() {
		System.out.println();
		System.out.println("");
		System.out.println("�̿��Ͻô� ��������\n������ �����"+Go+"\n������ �����"+Back+"�Դϴ�.");
		System.out.println();
		System.out.println("�� �����ݾ��� "+price+"�� �Դϴ�.");
		System.out.println("�߰�����â���� �Ѿ�ϴ�.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

	@Override
	public String toString() {
		return 
		""+g+"\n"+
		"time table"+
		"1."+
		"�Ǧ���������������������������������������������������������������������������������������\n"+
		"	"+f1+"        \n"+
		"�Ŧ���������������������������������������������������������������������������������������\n"+
		"2."+
		"�Ǧ���������������������������������������������������������������������������������������\n"+
		"	"+f1+"        \n"+
		"�Ŧ���������������������������������������������������������������������������������������\n"+
		"3."+
		"�Ǧ���������������������������������������������������������������������������������������\n"+
		"	"+f1+"        \n"+
		"�Ŧ���������������������������������������������������������������������������������������\n";
		
		System.out.println();
		System.out.println("�̿��Ͻ� �������� ������ �ּ���");
		String num=sc.nextLine();
		if(num.equals("1")) {
			Go = "f1";
			price += p1;
			
			System.out.println();
			System.out.println(f1+"����:"+price+"��");
		}else if (num.equals("2")){
			Go = "f2";
			price += p2;
		
			System.out.println();
			System.out.println(f2+"����:"+price+"��");
		}else if (num.equals("3")){
			Go = "f3";
			price +=p3;
			
			System.out.println();
			System.out.println(f3+"����:"+price+"��");
	}

}


	