package ch13_1_collections;

import java.util.*;

public class HashtableExample {
	/*[Hashtable] implements map
	 * 
	 * HashMap과 동일한 내부구조
	 * 
	 * :하나의 스레드가 실행 완료해야지만 실행가능 (sync)
	 */
	
	
	
	
	public static void main(String[] args) {
		Map<String, String > map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("아이디 비밀번호 입력");
			System.out.println("아이디:");
			String id = sc.nextLine().trim();
			
			System.out.println("비밀번호:");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			
			//id가 없다면 
			if (!map.containsKey(id)) {//key가 담겨있는지 확인 
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				continue;
				}
			//id가 있다면	
			else {
				//비번불일치
			if(!map.get(id).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			//비번일치
			else {
				System.out.println("로그인되었습니다.");
				break;
			}
			}
		}
		sc.close();
	}
}

//				if(map.get(id).equals(pw)) {
//					System.out.println("로그인되었습니다");
//					break;
//				}else {
//					System.out.println("비밀번호 불일치");
//				}
//			}else {
//				System.out.println("아이디가 존재하지 않습니다.");
//			}			
//		}
//	}
//}
