package Wildernessr;

import java.io.IOException;
import java.util.Scanner;

import ect.DateFix;

public class Main {
   public static void main(String[] args) throws IOException {

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("~~~~~~~~[광야에 오신 여러분 환영합니다]~~~~~~~~");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Join join = new Join();
      csQA cs = new csQA();
      Scanner sc = new Scanner(System.in);
      CustomerSign customer = new CustomerSign();
      checkReservation cr = new checkReservation();
      ReservationFix rf = new ReservationFix();

      boolean stop = true;
      join.run();

      while (stop) {
         try {
            System.out.println("[1] 예약하기 [2] 예약 확인 [3]예약취소 [4] 문의하기[0]종료");
            int menuNum = sc.nextInt();

            switch (menuNum) {
            case 1:
               rf.runReservation();
               customer.customerInformation();
               break;
            case 2:
               cr.check();
               break;
            case 3:
               cr.remov();
               break;
            case 4:
               cs.customercenter();
               break;
            case 0:
               stop = false;
               System.out.println("안녕히계세요~");
               break;
            }
         } catch (Exception e) {
            System.out.println("잘못입력하였습니다. 다시 입력하세요");
            continue;
         }

      }
      sc.close();
   }

}