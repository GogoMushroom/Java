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
		
		s.add(new Member("ȫ�浿", 30));
		s.add(new Member("ȫ�浿", 30));
		s.add(new Member("��浿", 31));
		s.add(new Member("�̱浿", 35));
		s.add(new Member("�ֱ浿", 32));
		
		System.out.println("�� ��ü��: " + s.size());	
		System.out.println(s);
		
		Iterator<Member> iterator = s.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.name +" ,"+m.age);
		}
		//iterator �ʱ�ȭ 
		iterator = s.iterator();
		
	}
}
