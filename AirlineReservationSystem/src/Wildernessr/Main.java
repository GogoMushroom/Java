package Wildernessr;

import java.io.IOException;
import java.util.Scanner;

import ect.DateFix;

public class Main {
   public static void main(String[] args) throws IOException {

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("~~~~~~~~[���߿� ���� ������ ȯ���մϴ�]~~~~~~~~");
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
            System.out.println("[1] �����ϱ� [2] ���� Ȯ�� [3]������� [4] �����ϱ�[0]����");
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
               System.out.println("�ȳ����輼��~");
               break;
            }
         } catch (Exception e) {
            System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
            continue;
         }

      }
      sc.close();
   }

}