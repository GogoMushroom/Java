package ch13_1_collections;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		/*[HashMap] implements Map
		 * 
		 * - 키(key)객체, 값(value)로 구성된 map,entry 객체를 저장하는 구조 
		 *  : Entry는 Map 인터페이스 내부에 선언 된 중첩 인터페이스 
		 *  {홍길동 = 65,신용권 = 85, 김용권=80}
		 *  {Key=Value,Key=Value,Key=Value}
		 */
		
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		
		//객체저장
		map.put("신용권",new Integer (85));
		map.put("홍길동",90);//오토박싱
		map.put("김용권",80);
		//키가 같으면 마지막 저장값으로 대체 
		map.put("홍길동",95);
		System.out.println(" 총  Entry 수 " +map.size());
		System.out.println(map);
		
		//객체찾기
		System.out.println("\t 홍길동 :"+ map.get("홍길동"));
		//키 검색 
		System.out.println(" Key 존재여부 " + map.containsKey("김용권"));
		
		System.out.println();
		
		//[객체 루핑 및 처리] -> Iterator를 사용을 해야함 , 가져오는 방법 2가지
		
		//1. set<Key> 이용 -> key값만 set에 담음 
		
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer iv = map.get(key);
			System.out.printf("key: %s , value %d\n",key,iv);
		}
		itr = keys.iterator();
		
		System.out.println("----------------------------------");
		
		//2. set<Map.Entry> 이용 -> map.Entry(key,value 한덩어리)를 set에 담음 
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
		
		
//		//객체를 하나씩 처리
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
//		//객체삭제
//		
//		map.remove("홍길동");
//		System.out.println("총 Entry 수 :" + map.size());
//		
//		//객체를 하나씩 처리 
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> enIterator = entrySet.iterator();
//		
//		while (entryIterator.hasNext()) {
//			
//		}
//	
//	}
//}
