package ch05_2_array;

public class MainStringArrayArgument2 {
	public static void main(String[] args) { //main �� �޼ҵ� 
		
		{
		int var = add(7,3);
		System.out.println(var); //10
		
		if(args.length != 2 ) {   //�Էµ� �������� ���� 2�� �ƴ� ���
			System.out.println("���� ���� �����մϴ�.");
			//System.exit(0); // �������� �̷��� �ȵ�;;
			return; // ���� ������ �׳� ������������ 
		}
		
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		System.out.printf("%d+%d=%d", num1,num2,result);
	} //-> �Ϸ� ���� �ϸ��
	//System.out.println("���ϵ�");
	}
	//�Ϲ� �Լ��� �޼ҵ峪 �Ȱ��� 
	private static int add(int i, int j) { //add �� �޼ҵ�  
		
		return i+j; //i+j�� ���� �������� ȣ���Ѱ����� ���� (7������)
	}
  
}
