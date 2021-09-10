package ch07_1_inheritance;

public class StudentExample {
	public static void main(String[] args) {

		Student st1 = new Student("홍길동","111111-1111111", 1);
		System.out.println("name : " + st1.getName());
		System.out.println("ssn : " + st1.getSsn());


		Student st2 = new Student("허자바", "비밀", 0);
		System.out.println(st2.getName());
		System.out.println(st2.getSsn());

	}
}

