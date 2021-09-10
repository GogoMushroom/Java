package ch09_2_anonymous;

class Person{
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}
//class ChildPerson extends Person{
//	void work () {}
//  void wake () {}
//}

class Anonymous {
 
	// 이름이 있는 클래스를 만들때 
	//Person Field = new ChildPerson();
	
	//필드 초기값으로 대입
	//부모클래스 변수 = new 부모클래스 () {...};
	Person field = new Person() {  // 필드값으로 익명 객체 대입 
	//class ChildPerson extends Person	
		
		void work () {System.out.println("출근합니다");//자식객체 메소드 
		}
		@Override
		void wake() {System.out.println("6시에 일어납니다."); //상속받은 메소드 
			work();
		}
	};// 익명 개체 선언 


	void method1() {
		//로컬 변수값으로 대입
		Person localVar = new Person() { //로컬 변수값으로 익명 객체 대입 
			void wolk () {System.out.println("산책합니다");}
			@Override
			void wake() { System.out.println("7시에 일어납니다.");
				wolk();
			}
		};
		//로컬변수사용
		localVar.wake();
	}
	void method2 (Person person) {
		person.wake();
	}
}

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		//익명 개체 필드 사용 
		a.field.wake();
		//익명 개체 로컬 변수 사용 
		a.method1();
		//익명 객체 매개값 사용 
		a.method2(
			new Person() { //person 형 객체의 인스턴스 참조객체를 전달해야함 
				void study() {System.out.println("공부합니다.");}
				@Override
				void wake() {System.out.println("8시에 일어납니다.");
					study();	
				}
			}
		); //익명 객체 만듬 
	}
}
