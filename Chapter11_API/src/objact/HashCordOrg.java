package objact;

public class HashCordOrg {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc"); // new �ϸ� ��� ���Ű�������
		
		
		String str3 = "Hello";
		String str4 = "Hello";  // ���ͷ��� �����ϸ� ���� ���� ���� ������ ���� ��ġ�� ������ִ°� ����
		
		
		System.out.println(str1 == str2); // ���� �ּҰ��� �ٸ� !!
		System.out.println(str1.equals(str2)); // ���ִ� ���� ���� 
		System.out.println("abc"=="abc"); //���ڿ� ����� ����  
		
		
		/*
		 * String class �� ���ڿ��� ������ ������ , ������ �ؽ��ڵ带 ��ȯ�ϵ��� �������̵� �Ǿ��ִ�.
		 */
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		/*
		 * Object Ŭ������ hashcode() �� ����, ��ü�� �ּҰ����� �ؽ��ڵ带 ����
		 */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
	}
	
	
}
