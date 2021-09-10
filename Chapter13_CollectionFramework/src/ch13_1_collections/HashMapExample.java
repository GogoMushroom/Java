package ch13_1_collections;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		/*[HashMap] implements Map
		 * 
		 * - Ű(key)��ü, ��(value)�� ������ map,entry ��ü�� �����ϴ� ���� 
		 *  : Entry�� Map �������̽� ���ο� ���� �� ��ø �������̽� 
		 *  {ȫ�浿 = 65,�ſ�� = 85, ����=80}
		 *  {Key=Value,Key=Value,Key=Value}
		 */
		
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		
		//��ü����
		map.put("�ſ��",new Integer (85));
		map.put("ȫ�浿",90);//����ڽ�
		map.put("����",80);
		//Ű�� ������ ������ ���尪���� ��ü 
		map.put("ȫ�浿",95);
		System.out.println(" ��  Entry �� " +map.size());
		System.out.println(map);
		
		//��üã��
		System.out.println("\t ȫ�浿 :"+ map.get("ȫ�浿"));
		//Ű �˻� 
		System.out.println(" Key ���翩�� " + map.containsKey("����"));
		
		System.out.println();
		
		//[��ü ���� �� ó��] -> Iterator�� ����� �ؾ��� , �������� ��� 2����
		
		//1. set<Key> �̿� -> key���� set�� ���� 
		
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer iv = map.get(key);
			System.out.printf("key: %s , value %d\n",key,iv);
		}
		itr = keys.iterator();
		
		System.out.println("----------------------------------");
		
		//2. set<Map.Entry> �̿� -> map.Entry(key,value �ѵ��)�� set�� ���� 
		Set<Map.Entry<String, Integer>> enteySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eitr = enteySet.iterator();
		while (eitr.hasNext()) {
			Map.Entry<String, Integer>entry = eitr.next();
			String key = entry.getKey();
			Integer iv = map.get(key);
			System.out.printf("key: %s , value %d\n",key,iv);
		}
		itr = keys.iterator();
	}
}
		
		
//		//��ü�� �ϳ��� ó��
//		Set <String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		while (keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			System.out.println("\t"+ key+ ":" + value );
//			
//		}
//		System.out.println();
//		
//		//��ü����
//		
//		map.remove("ȫ�浿");
//		System.out.println("�� Entry �� :" + map.size());
//		
//		//��ü�� �ϳ��� ó�� 
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> enIterator = entrySet.iterator();
//		
//		while (entryIterator.hasNext()) {
//			
//		}
//	
//	}
//}
