package practice;
abstract class Unit {
	int x,y;
	abstract void move (int x,int y);
	void stop() {System.out.println("멈춤");}
	}

interface Fighterble {//interface 의 모든 메서드는 public abstract. 예외없음
	void move (int x,int y); //public abstract 가 앞쪽에 생략됨
	void attack (Fighterble f); //public abstract 가 앞쪽에 생략됨
}

class Fighter extends Unit implements Fighterble {
	@Override
	// 오버라이딩 규칙 = 조상보다 접근제어자가 좁으면 안된다.
	public void move(int x, int y) { 
		// TODO Auto-generated method stub
		System.out.printf("%d , %d 로 이동\n", x , y);
	}
	@Override
	public void attack(Fighterble f) {
		System.out.println(f+"를 공격");
		
	}	
	//싸울 수 있는 상대를 불러온다
	Fighterble getFightable() {
		Fighter f = new Fighter(); //Fighter 를 생성해서 반환함 
		return (Fighterble)f;
	}
	
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fighterble f2 = f.getFightable();
		
		
	//	Fighter f = new Fighter();
//		Fighterble f = new Fighter();
		Unit u = new Fighter(); //unit에는 attack() 이 없음 
		f.move(100, 200);
		f.attack(new Fighter());
		//f.stop(); // 없음 
		u.move(200, 100);
		u.stop();
		//u.attack(new Fighter());// unit에는 attack() 이 없음 
		
//		Fighter f2= new Fighter();
//		f.attack(f2);   // f.attack(new Fighter()); 을 2줄로 쓸 수도 있음 
		
	}
}
