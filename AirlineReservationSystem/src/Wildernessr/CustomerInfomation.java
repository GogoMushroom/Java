package Wildernessr;

//ž���� ����
// �̸�, ����, ����, �̸���
public class CustomerInfomation {
	//�ʵ�
	 private String name = null;
	 private boolean isMan = false;
	 private int birth = 0;
	 private String email = null;
	 
	//������
	 public CustomerInfomation(String name, boolean isMan, int birth, String email) {
		this.name = name;
		this.isMan = isMan;
		this.birth = birth;
		this.email = email;
	}
	 
	 //������
	 public CustomerInfomation() {
	}

	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMan() {
		return isMan;
	}
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}