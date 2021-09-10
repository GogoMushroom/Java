package objact;

public class MemberExample {
	public static void main(String[] args) {
		Member o1 = new Member("blue");
		Member o2 = new Member("blue");
		Member o3 = new Member("red");
		
		
		if(o1.equals(o3)) {
			System.out.println("o1은o2와 동등하다");
		} else {
			System.out.println("o1은o2와 동등하지않다");
		}
	}
}
