package objact;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {  //�ް����� member Ÿ������ Ȯ��
			Member m = (Member) obj;
			if(id.equals(m.id)) { //id �ʵ尪�� �������� �˻�
				return true;
			}
		}
		//�Ű����� member������ �ƴϰų� id �ʵ尪�� �ٸ����
		return false;
	}	
}
