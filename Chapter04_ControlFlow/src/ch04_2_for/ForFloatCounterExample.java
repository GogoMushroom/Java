package ch04_2_for;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for (float x=1.0f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}
//f값은 정확하지 않기때문에 9 번만 실행됨 