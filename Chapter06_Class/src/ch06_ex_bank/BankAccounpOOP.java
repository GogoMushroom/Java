package ch06_ex_bank;

public class BankAccounpOOP {
	public static void main(String[] args) {

		BankAccount kimAccount = new BankAccount("kim");

	kimAccount.deposit(10000);
	kimAccount.withdraw(3000);
	kimAccount.checkBlanece();

	BankAccount leeAccount = new BankAccount("lee","777-777",10000);
	leeAccount.deposit(10000);
	leeAccount.checkBlanece();
	



	}}
