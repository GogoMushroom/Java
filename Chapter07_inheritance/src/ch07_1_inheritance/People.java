package ch07_1_inheritance;

public class People {
	//�ʵ�
	private String name;
	private String ssn;
	
	//������
	public People (String name , String ssn) {
		this.name = name;
		this.ssn = ssn;
		
		
	//�޼���	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//
}