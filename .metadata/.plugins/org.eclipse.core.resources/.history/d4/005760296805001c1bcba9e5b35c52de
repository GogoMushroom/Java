package Wilderness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Join {

	Scanner sc = new Scanner(System.in);
	List<MemberMNG> members = new ArrayList<>();
	
	encryption secret = new encryption();
	
//	public Join() {
//		members.add(new MemberMNG("admin", "admin", "Nam Ju"));
//	}

	//실행메소드
	public void run() {
		int key = 0;
		while (true) {
			try {
				key = menu();
				switch (key) {
				case 1:
					Login();
					break;
				case 2:
					MemberJoin();
					break;
				case 0:
					System.out.println("~~~~~~~잘가라~~~~~~~나를 잊어라~~~~~");
					break;
				default:
					System.out.println("잘못된 입력값입니다.다시 입력하세요");

				}
			} catch (Exception e) {
				System.out.println("잘못입력하였습니다. 다시 입력하세요");
				continue;
			}
				break;
		}

	}

	//회원가입
	private void MemberJoin() {
		//int count =0;
		while(true) {
			String id = getStrInput("              ID : ");
			if (idCheck(id)) {
				System.out.println("중복된 ID입니다.");
				continue;
			}
			
			String pw = getStrInput("         PassWord : ");
			String pw2 = getStrInput("Password Confirm : ");
			
			//pw, pwcheck가 동일한지 확인
			if(pw.equals(pw2)) {
				String name = getStrInput("           Name : ");
				
				String salt = secret.Salt();
				//System.out.println("(salt 생성 완료=" + salt + ")");
				String pw_encrypt = secret.SHA512(pw, salt);
				
				
				members.add(new MemberMNG(id, pw_encrypt, name));
				System.out.println(id + "님 가입을 축하드립니다.");
				break;
				//예약 ui가 들어가야할 곳
			}else {
				System.out.println("비밀번호가 일치하지 않습니다. 확인해주세요.");
			}
		}
	}

	//id 중복검사 후 check로 반환
	private boolean idCheck(String id) {
		boolean check = true;
		MemberMNG member = FindById(id);
		if (member == null)
			check = false;
		return check;
	}

	private int Login() {
		int count=0;
		String id = getStrInput("      ID : ");
		String pw = getStrInput("PassWord : ");
		String salt = secret.Salt();
		// 복호화
		String pw_decrypt = secret.SHA512(pw, salt);
		
		MemberMNG member = FindById(id);
		if (member == null) {
			System.out.println("등록되지 않은 ID입니다.");
			Login();
			
		} else if (member.getPW().equals(pw_decrypt)) {
			System.out.println("[" + member.getID() + "]님께서 로그인 하셨습니다.");
			
			count++;
			// 예약 ui가 들어가야할 곳
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
			pw = getStrInput("PassWord : ");
			if(member.getPW().equals(pw_decrypt)|| member.getPW().equals(pw)) {
				System.out.println("[" + member.getID() + "]님께서 로그인 하셨습니다.");
				count++;
				// 예약 ui가 들어가야할 곳
			}
		}
		return count;
	}

	//id로 중복된 값이있다면 그값을 return 아니라면null
	private MemberMNG FindById(String id) {
		for (MemberMNG memberDTO : members) {
			if (memberDTO.getID().equals(id)) {
				return memberDTO;
			}
		}
		return null;
	}

	//사용자의 입력을 받아주는 메소드
	private String getStrInput(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	//메뉴와 메뉴선택 사용자 입력까지 받아와서 choice로 return
	private int menu() throws NumberFormatException {
		System.out.println("       [1]로그인 [2]회원가입 [0]종료");
		int choice = 0;
		choice = Integer.parseInt(sc.nextLine());
		return choice;
	}
}
