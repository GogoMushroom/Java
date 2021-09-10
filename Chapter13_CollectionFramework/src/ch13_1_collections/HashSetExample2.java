package ch13_1_collections;

import java.util.*;

class Member{
	public String name;
	public int age;
	
	Member (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
	if (obj instanceof Member) {
		Member m = (Member) obj;
		return m.name.equals(name) && (m.age==age);
	}else {
		return false;
	}
	}
	@Override
	public int hashCode() {
		return name.hashCode() +age;
	}
	
}


public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> s = new HashSet<>();
		
		s.add(new Member("È«±æµ¿", 30));
		s.add(new Member("È«±æµ¿", 30));
		s.add(new Member("±è±æµ¿", 31));
		s.add(new Member("ÀÌ±æµ¿", 35));
		s.add(new Member("ÃÖ±æµ¿", 32));
		
		System.out.println("ÃÑ °´Ã¼¼ö: " + s.size());	
		System.out.println(s);
		
		Iterator<Member> iterator = s.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.name +" ,"+m.age);
		}
		//iterator ÃÊ±âÈ­ 
		iterator = s.iterator();
		
	}
}
