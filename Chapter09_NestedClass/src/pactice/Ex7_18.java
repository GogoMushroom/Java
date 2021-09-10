package pactice;

import java.awt.*;
import java.awt.event.*;

//public class Ex7_18 {
//	public static void main(String[] args) {
//		Button b = new Button("Start");
//		b.addActionListener(new EventHandler());
//	}
//}
//class EventHandler implements ActionListener{
//	public void actionPerformed (ActionEvent e) {
//		System.out.println("ActionEvent occurred!!");
//	}
//}


//무명클래스 만드는법
//1.조상이나 인터페이스의 이름 사용 
//2.{}만들어서 클래스 내용 담아주기



public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener()  //조상 클래스 이름 사용 
		{public void actionPerformed (ActionEvent e) { //클래스 내용 담아주기
			System.out.println("ActionEvent occurred!!");
		}});
	}
}
