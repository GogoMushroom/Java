

package ch05_1_Reference_variable;

public class StringsEqualsExample {
	public static void main(String[] args) {
		String str1 = "java";
//			(str)����Ÿ���� 4����Ʈ �ȿ� �ּҰ�����.
//           java ��� ���ڿ��� �� ������ ���� str�� �� �ּҸ� ������� 
		String str2 = "java";
//			str2�� java �� str1 �� �����Ǿ��ִ� java�� ����
//			str1�� atr2�� ���� �ּҸ� ����ִ�. 
		
		System.out.println(str1 == str2 );
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// �� ��ü�� �������� �˱� ���ؼ� ���� �Լ� = hashCode()
		
		String str3=new String ("java");
//		= new �� ����ؼ� ����  String ��ü�� ������ų�����ִ�. 
//		new = ��ü����������
		String str4 = new String ("java");
//		new �����ڷ� ������� ��ü�� ���ο� �����ڷ� ���� �����ϰ��ִ� java�ʹ� �ٸ��� 
//		new �����ڸ� �̿��� ���� ��ü java�� ���� �ٸ��ּҸ� �������ִ�.
		System.out.println(str3==str4);
//		���� �ٸ� �ּ� , ��ü�� ������ �������� 
		System.out.println(str3.equals(str4));
//		���� ���ڿ� , ���ڿ��� ��������	
		System.out.println(str2.equals(str4));
//		�ٸ��ּ�, ���� ���ڿ� 
		System.out.println(str1==str4);
//		���ڿ��� �Ȱ����� �ּҴ� �ٸ� 		
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
//		str1 �� str2 �� ���� �ּҸ� �������ְ� 12 �� 3 �׸��� 4�� ���� �ٸ� �ּҸ� �������ִ�
		
		
//		���ͷ��� �������ϸ� �ߺ��Ǵ� ��ü�� �����Ǵ��� �޸𸮰� �ߺ��ؼ� ������ �ʴ´� .  		
		
		
	}
}





