package ch13_3_example;

import java.util.*;

public class LottoExample {
	
	//�ʵ�
	
	static final int MAX = 45;
	static final int COUNT = 6;
	

	public static void main(String[] args) {
		
		/*
		 * [�ζǹ�ȣ ������}
		 * �ߺ���������ʴ� HashSet �̿�
		 */
		
		//��ȣ����? MATH.random()
		//set �ڷᱸ���� ��� 
		
		Set<Integer> set = new HashSet<>(COUNT);
		
		int n = 0;
		while(set.size()<COUNT) { //6���� �Ǹ� �������� 
			n++;
			set.add((int)(Math.random()* MAX)+1 ); //1���� 45���� ���� ���ڸ� set.add�� ����
		}
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto+" "+n+"ȸ"); //set�� ���� �ߺ��˻縦 �� �ʿ䰡 ���� 
		
	}
}
