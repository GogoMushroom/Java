package ch07_1_inheritance;

public class Student extends People {
	//�ʵ�
	
	private int studentNo;
	
	public Student (String name, String ssn , int studentNo) {
		super(name , ssn); //�θ� ������ ȣ�� 
		this.studentNo = studentNo;	
	}
}