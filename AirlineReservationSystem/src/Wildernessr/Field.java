package Wildernessr;

public class Field {
	//�ʵ�
	private int balance = 0; //�ܾ�
	private int price = 0;  //�ݾ�
	
	private long cardNum = 0; //ī���ȣ(-���� ���ڸ� �Է��ϼ���)
	private int Validity = 0; //��ȿ�Ⱓ (mmYY)
	private int Installment = 0;//�Һ�
	private int cvcNum = 0; //CVC�ѹ�

	private String cardCompany = null;
	public static final String COMPANY_ACCOUNT = "���� 110-369-681992, ������ : ����"; 

	//������
	public Field(int balance, int cardNum, int validity) {
		this.balance = balance;
		this.cardNum = cardNum;
		Validity = validity;
	} 
	public Field() {
	}

	//getter setter
	public int getCvcNum() {
		return cvcNum;
	}
	public void setCvcNum(int cvcNum) {
		this.cvcNum = cvcNum;
	}
		public String getCardCompany() {
		return cardCompany;
	}
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}
	public int getInstallment() {
		return Installment;
	}
	public void setInstallment(int installment) {
		Installment = installment;
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}

	public int getValidity() {
		return Validity;
	}

	public void setValidity(int validity) {
		Validity = validity;
	}
}
