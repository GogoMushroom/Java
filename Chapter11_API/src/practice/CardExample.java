package practice;

import java.util.Objects;

class Card {
	String kind;
	int number;
	
	Card(){
		this("SPADE" ,1);
		
	}
	Card(String kind , int number){
		this.kind= kind;
		this.number=number;
	}
	//equals 를 오버라이딩하면 hashcode 도 오버라이딩 해야함 
	@Override
	public int hashCode() {
		return Objects.hash(kind,number);//가변인자 갯수 상관x
	}
	
	@Override
	public boolean equals(Object obj) { //오버라이딩은 선언부가 일치 해야함
	if(!(obj instanceof Card))
		return false;
	
	Card c = (Card)obj;
	return this.kind.equals(c.kind) &&this.number==c.number;
	}
	
	
	//Object클래스의toString()을 오버라이딩

	public String toString() {
		return "kind:"+kind+",number:"+number;
	}
}
public class CardExample {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
