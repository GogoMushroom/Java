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


//����Ŭ���� ����¹�
//1.�����̳� �������̽��� �̸� ��� 
//2.{}���� Ŭ���� ���� ����ֱ�



public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener()  //���� Ŭ���� �̸� ��� 
		{public void actionPerformed (ActionEvent e) { //Ŭ���� ���� ����ֱ�
			System.out.println("ActionEvent occurred!!");
		}});
	}
}
