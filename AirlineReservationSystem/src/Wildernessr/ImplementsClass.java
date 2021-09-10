package Wildernessr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ImplementsClass implements Payment {
   private Scanner sc;
   MemberMNG meM = new MemberMNG(true, "admin", "admin"); //MemberMNG �ʵ�� get,set�ϱ����� �������� ��ü ����
   CustomerSign custSign = new CustomerSign();
   ReservationFix rf = new ReservationFix(); //�װ��� ���� �������� ���� ����
   public static final String COMPANY_ACCOUNT = "���� 110-369-681992, ������ : ����";

   public ImplementsClass() {
      sc = new Scanner(System.in);
   }

    // ī���� �� ī����� �޼ҵ�
   @Override
   public void card() {
      meM.setPrice(ReservationFix.totalprice);// ��������
      while (true) {
         try {
            System.out.println("�����Ͻ� ī�� ������ ������ּ���");
            System.out.print("ī���(����,����)�� �Է����ּ��� ex) > ");
            meM.setCardCompany(sc.nextLine());
            System.out.print("ī���ȣ(-���� ���ڸ�)�� �Է����ּ��� > ");
            meM.setCardNum(Long.parseLong(sc.nextLine()));
            System.out.print("ī��޸��� CVC��ȣ 3�ڸ��� �Է����ּ��� > ");
            meM.setCvcNum(Integer.parseInt(sc.nextLine()));
            System.out.println("ī�� ��ȿ�Ⱓ�� �Է����ּ���(mmYY) > ");
            meM.setValidity(Integer.parseInt(sc.nextLine()));
            System.out.print("�Һ� ������ �Է��� �ּ��� > ");
            meM.setInstallment(Integer.parseInt(sc.nextLine()));
         } catch (Exception e) {
            System.out.println("�Է°��� ������ �߸��Ǿ����ϴ�. ���ڷ� �Է����ּ��� ");
            continue;
         }
         break;
      }

      while (true) {
         System.out.println("=======================���� ����=======================");
         System.out.print("�װ���      �� ");
         rf.totalPlaneInfo();
         System.out.println("����        : " + meM.getPrice() + "��");
         System.out.println("ī���     : " + meM.getCardCompany());
         System.out.println("ī���ȣ  : " + meM.getCardNum());
         System.out.println("CVC��ȣ : " + meM.getCvcNum());
         System.out.println("��ȿ�Ⱓ  : " + meM.getValidity());
         System.out.println("�Һΰ���  : " + meM.getInstallment());
         System.out.println("���������� �Ͻðڽ��ϱ�?");
         System.out.println("  1.Yes   2.No");
         System.out.print("���� > ");

         switch (sc.nextLine()) {
         case "1":
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");

            System.out.println("=======================���� ����=======================");
            System.out.print("�װ���      �� ");
            rf.totalPlaneInfo();
            System.out.println("����        : " + meM.getPrice() + "��");//
            System.out.println("ī���     : " + meM.getCardCompany());
            System.out.println("ī���ȣ  : " + meM.getCardNum());
            System.out.println("CVC��ȣ : " + meM.getCvcNum());
            System.out.println("��ȿ�Ⱓ  : " + meM.getValidity());
            System.out.println("�Һΰ���  : " + meM.getInstallment());
            System.out.println("���� ���� : " + TimeStamp());
            System.out.println("�������ּż� �����մϴ� �ູ�� ���� �Ǽ���^^");
            break;
         case "2":
            break;
         default:
            System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ��ѹ� Ȯ�����ּ���");
            continue;
         }
         break;
      }
      System.out.println("�����ý����� ����Ǿ����ϴ�.");
      while (true) {
         System.out.println("=====================================================");
         System.out.println("    1.�ѷ�����                   2.����");
         System.out.print("���� > ");
         switch (sc.nextLine()) {
         case "1":
            // ����Ȩ������ ȭ�� �޼ҵ�
            break;
         case "2":
            break;
         default:
            System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ��ѹ� Ȯ�����ּ���");
            continue;
         }
         break;
      }
   }

   //�������Ա� �޼ҵ�
   @Override
   public void account() {
      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      cal.add(Calendar.DATE, +3); // 3�ϵ� �ð�
      meM.setPrice(ReservationFix.totalprice);// ���� ����

      try {
         System.out.println("=======================���� ����=======================");
         System.out.println("�Աݰ���     : " + COMPANY_ACCOUNT);
         System.out.println("����           : " + meM.getPrice() + "��");
          System.out.println("�װ���        �� ");
          rf.totalPlaneInfo();
         //***�Է¹��� �������� �̸� ��� ���� ��ã��
//         System.out.print("ž���� �̸�      : " + CustomerSign.mMap.get("cus1").getBirth());
         
         System.out.println("�Աݱ���     : " + df.format(cal.getTime()) + "����");
         System.out.println();
         System.out.println("��ſ� ���࿡ ���� ���߿� �Բ��� �ּż� �����մϴ�.");
         System.out.println("���� ��õ� ���ѱ��� �Ա����� ���� ��� �ڵ����� ���� ��� ó�� �˴ϴ�.");
         while (true) {
            System.out.println("=====================================================");
            System.out.println("    1.�ѷ�����                   2.����");
            System.out.print("���� > ");
            switch (sc.nextLine()) {
            case "1":
               break;
            case "2":
               break;
            default:
               System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ��ѹ� Ȯ�����ּ���");
               continue;
            }
            break;
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   // ���� ùȭ�� �޼ҵ�
   public void paymentFirstView() {
      System.out.println("----------------------------");
      System.out.println("     �ڡڡڰ��� ����� �����ϼ���ڡڡ�");
      System.out.println();
      System.out.println("    1.ī�����     2.�������Ա�");
      System.out.println("----------------------------");
      System.out.print("���� > ");
   }

   // ����ð� ����ִ� �޼ҵ�
   private static String TimeStamp() {
      SimpleDateFormat format = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
      return format.format(new Date());// ���� �ð��� ������ �� �ִ�.
   }
}