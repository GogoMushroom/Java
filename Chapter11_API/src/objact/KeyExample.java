package objact;

import java.util.HashMap;

class Key{
	public int number;

	public Key(int number){
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
	return this.number;
	
	}
}



public class KeyExample {
	public static void main(String[] args) {
		
		HashMap<Key,String> hashMap = new HashMap <Key, String> ();
		
		
		hashMap.put(new Key(1), "ȫ�浿");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
