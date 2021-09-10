package ch13_2_stack_queue;

import java.util.Stack;

class Coin{
	private int value;
	
	public Coin(int value) {
		this.value=value;
	}
	public int getValue()  {
		return value;
	}
}



public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));  // 동전을 끼움 
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		
		while(! coinBox.isEmpty()) {  // 동전 케이스 비었는지 확인 
			Coin c = coinBox.pop();   //동전 케이스에서 맨 위의 동전을 꺼냄
			System.out.println("꺼내온 동전 :" + c.getValue() +"원");
		}	
	}
}
