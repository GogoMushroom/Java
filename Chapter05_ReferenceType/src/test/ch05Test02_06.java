package test;
import java.util.Scanner;
public class ch05Test02_06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner sc = new Scanner (System.in);

		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� : 2.�����Է� : 3.��������Ʈ : 4.�м� : 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("����>");

			int selectNo = Integer.parseInt(sc.nextLine());

			if(selectNo == 1) {

				System.out.println("�л���>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];

			}else if(selectNo == 2) {
				for (int i=0; i<scores.length; i++) {
					System.out.print(scores[i] + " score[i]");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if (selectNo == 3){
				for (int i=0; i<scores.length; i++) {
					System.out.print(scores[i] + " score[i]");
				}
			}else if (selectNo == 4){
				int sum = 0;
				int max = 0;
			
				for (int i=0; i<scores.length; i++) {
					
					sum += scores[i];
					System.out.println("��� ����" + (double) sum/scores.length);
			
			 if (scores[i]>max) {
							max = scores[i];
						System.out.println("�ְ� ����" + max);
			 
			 
					} else if (selectNo == 5){
						run= false;
					}
				}
				System.out.println("���α׷� ����");
			}
		}
	}
	
	




