package ch06_ex_bank;
/*
 * ������� ���� Ŭ���� 
 */
 class BankAccount1{
	String name;
	int balance;
	int number;
	int ssn;
}
public class BankAccountPOP {

	static int balance; //Ŭ�������� �ν��Ͻ� �ʵ�
	//static = new ���� �ʾƵ� �޸� ������ ��
	public static void main(String[] args) { 

		BankAccount1 myAcc = new BankAccount1();
		
		myAcc.name="���ڹ�";
		
		//���� �ʱ�ȭ
		int balance = 0;

		//���� �Ա�   
		//->�����Ա��ϱ�(�������θ������)
		deposit(10000);
		
		//���� ���
		//->��������ϱ�
		withdraw(3000);

		//���� �ܰ� ���
		//->���� �ܰ� ����ϱ�
		checkBalance();
		
		withdraw(1000);
		deposit(30000);
		checkBalance();
		
	}

	private static void checkBalance() {
		System.out.println("�ܰ�" + balance);

		
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;

	}

	private static void deposit(int depositAmount) {
		//private static �� �ɹ����������� �Ƚᵵ��
		balance = balance + depositAmount;

	}
}
