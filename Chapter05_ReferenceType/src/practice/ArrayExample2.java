package practice;

public class ArrayExample2 {
	public static void main(String[] args) {
		//index ���� : 0~9 
		int [] arr = new int[10]; //���̰� 5�� int�迭 arr�� ����
		System.out.println("arr.length="+arr.length);

		for(int i=0 ; i<arr.length; i++) {
		// ������ ����ٶ� arr.length �� ����ϸ� ���� ������ �پ�� 
			System.out.println("arr[" +i+ "]=" + arr[i]);
		}
	}
}
