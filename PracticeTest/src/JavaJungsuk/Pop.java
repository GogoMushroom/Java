package JavaJungsuk;

import javax.swing.JOptionPane;

public class Pop {
	public static void main(String[] args) {
		//		String input =JOptionPane.showInputDialog("�ƹ����̳� �Է�") ;
		//		
		//		JOptionPane.showMessageDialog(null, "�Է��ϽŰ��� "+input+"�Դϴ�");
		//		
		String cat = JOptionPane.showInputDialog("�����̳� ���� ����̸� �ҷ�������", "�ֿ�");
		if(cat == null) 
			JOptionPane.showMessageDialog(null, "^~^");
		if(cat.equals("�����"))
			JOptionPane.showMessageDialog(null, "what? English plz ^. w .^"); 
		if(cat.equals("hero"))
			JOptionPane.showMessageDialog(null, "����δ� ��������.");
		else 
			JOptionPane.showMessageDialog(null, "8��8"); 
		
		

		String []sh = {"������", "�ɺ�", "������", "�����"};
		int selected = JOptionPane.showOptionDialog(null, "�����̿� ���� ģ�ѻ����", "��󺸼���",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sh, sh[0]);
		if(selected == JOptionPane.CLOSED_OPTION)
			JOptionPane.showMessageDialog(null, "�λ��� ''ȥ��'' �Դϴ�");
		else
			JOptionPane.showMessageDialog(null, "����  "+sh[selected]+"�� �׷��� �����ұ�?");
			JOptionPane.showMessageDialog(null, "�λ��� ''ȥ��'' �Դϴ�");
		
	

	}
}
