package Wildernessr;

import java.util.Scanner;

//결제부분 실행 클래스
public class PaymentRun {
   private Scanner sc;
   
   public PaymentRun() {
      sc = new Scanner(System.in);
   }
   
   //결제부분 실행 메소드
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
            System.out.println("다시 입력해주세요");
            continue;
         }
         return;
      }
   }
}