package ch06_1_oop;

public class Student {
	int num =0 ;//�ʵ�

	//Student(){
	//	
	//} 
	//�̰� ���� �ڵ����� �� �־�� �� //������
	
	Student(){
		num =100;	
	} 
	// �Ⱦ��� �ڵ����� �����Ϸ���  ������� 

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
