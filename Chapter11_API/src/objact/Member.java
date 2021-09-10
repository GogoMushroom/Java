package objact;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {  //메개값이 member 타입인지 확인
			Member m = (Member) obj;
			if(id.equals(m.id)) { //id 필드값이 동일한지 검사
				return true;
			}
		}
		//매개값이 member차입이 아니거나 id 필드값이 다른경우
		return false;
	}	
}
