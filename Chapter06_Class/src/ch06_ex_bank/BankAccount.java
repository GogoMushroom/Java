package ch06_ex_bank;

public class BankAccount {
	//�ʵ�
	String name;
	String number;
	int balance;

	//������

	public BankAccount(String name) {	
		this (name,"123-456", 0);
		//		this.name = name;
	}

	public BankAccount(String name, String number) {
		this (name,number, 0);
		//		this.name = name;
		//		this.number = number;
	}

	public BankAccount(String name, String number,int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;		
	}
	//�޼ҵ� 

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	public void checkBlanece() {
		System.out.println(this.name +"�����ܰ�:" + this.balance);	
	}


}

