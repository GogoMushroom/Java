package Wildernessr;

import java.util.Scanner;

//�����κ� ���� Ŭ����
public class PaymentRun {
   private Scanner sc;
   
   public PaymentRun() {
      sc = new Scanner(System.in);
   }
   
   //�����κ� ���� �޼ҵ�
   public void run() {
      Payment pay = new ImplementsClass(); 
      ImplementsClass im = new ImplementsClass();
      
      while (true) {
         im.paymentFirstView();
         switch (sc.nextLine()) {
         case "1":
            pay.card();
            break;
         case "2":
            pay.account();
            break;
         default:
            System.out.println("�ٽ� �Է����ּ���");
            continue;
         }
         return;
      }
   }
}