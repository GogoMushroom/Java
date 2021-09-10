package JavaJungsuk;

import javax.swing.JOptionPane;

public class Pop {
	public static void main(String[] args) {
		//		String input =JOptionPane.showInputDialog("아무값이나 입력") ;
		//		
		//		JOptionPane.showMessageDialog(null, "입력하신값은 "+input+"입니다");
		//		
		String cat = JOptionPane.showInputDialog("지원이네 검정 고양이를 불러보세요", "애옹");
		if(cat == null) 
			JOptionPane.showMessageDialog(null, "^~^");
		if(cat.equals("히어로"))
			JOptionPane.showMessageDialog(null, "what? English plz ^. w .^"); 
		if(cat.equals("hero"))
			JOptionPane.showMessageDialog(null, "히어로는 도망갔다.");
		else 
			JOptionPane.showMessageDialog(null, "8ㅅ8"); 
		
		

		String []sh = {"교수님", "케빈", "봉춘이", "윤언니"};
		int selected = JOptionPane.showOptionDialog(null, "지원이와 가장 친한사람은", "골라보세요",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sh, sh[0]);
		if(selected == JOptionPane.CLOSED_OPTION)
			JOptionPane.showMessageDialog(null, "인생은 ''혼자'' 입니다");
		else
			JOptionPane.showMessageDialog(null, "과연  "+sh[selected]+"도 그렇게 생각할까?");
			JOptionPane.showMessageDialog(null, "인생은 ''혼자'' 입니다");
		
	

	}
}
