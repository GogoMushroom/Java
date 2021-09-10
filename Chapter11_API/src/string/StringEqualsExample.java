package string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String s1= new String("신민철");
		String s2= "신민철";

		if (s1 ==s2) {
			System.out.println("같은객체참조");
		} else {
			System.out.println("다른객체참조");
		}

		if (s1.equals(s2)) {
			System.out.println("같은문자열");
		} else {
			System.out.println("다른문자열");
		}
	}

}

