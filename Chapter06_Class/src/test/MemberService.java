package test;

public class MemberService {

	public boolean login(String string1, String string2) {
	if (string1.equals("hong") && string2.equals("12345")) {
		return true ;
	} else {
		return false ;
	}
	}
	public void logout(String string) {
		if (string.equals("hong"));
		System.out.println("로그아웃 되었습니다.");
		
	}

}
