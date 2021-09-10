package ch13_1_collections;

import java.util.*;

public class HashtableExample {
	/*[Hashtable] implements map
	 * 
	 * HashMap�� ������ ���α���
	 * 
	 * :�ϳ��� �����尡 ���� �Ϸ��ؾ����� ���డ�� (sync)
	 */
	
	
	
	
	public static void main(String[] args) {
		Map<String, String > map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("���̵� ��й�ȣ �Է�");
			System.out.println("���̵�:");
			String id = sc.nextLine().trim();
			
			System.out.println("��й�ȣ:");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			
			//id�� ���ٸ� 
			if (!map.containsKey(id)) {//key�� ����ִ��� Ȯ�� 
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
				continue;
				}
			//id�� �ִٸ�	
			else {
				//�������ġ
			if(!map.get(id).equals(pw)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			//�����ġ
			else {
				System.out.println("�α��εǾ����ϴ�.");
				break;
			}
			}
		}
		sc.close();
	}
}

//				if(map.get(id).equals(pw)) {
//					System.out.println("�α��εǾ����ϴ�");
//					break;
//				}else {
//					System.out.println("��й�ȣ ����ġ");
//				}
//			}else {
//				System.out.println("���̵� �������� �ʽ��ϴ�.");
//			}			
//		}
//	}
//}
