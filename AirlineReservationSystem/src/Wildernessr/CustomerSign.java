package Wildernessr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerSign {
   static Map<String, MemberMNG> mMap;
   private Scanner sc;
   MemberMNG meM = new MemberMNG("iD", "pW", "name", false, "birth", "email");
   Join ji = new Join();
   
   //�� ���� ����ذ�(ID�� ȸ�����Բ��� �����;ߵȴ�.)
   public CustomerSign() {
      sc = new Scanner(System.in);
      mMap = new HashMap<>();
      mMap.put("ID", new MemberMNG("ID", "PW", "Name", false, "admin", "admin"));
   }
   
   // ������ ���� ���
//   boolean isMan = false;
   public void customerInformation() {

   boolean isMan;   
   String gender;
   String email;
   String birth;
      
      while (true) {
         try {
            System.out.println("==================================");
            System.out.println("������ ������ �Է����ּ���");
            System.out.print("������ �������ּ���(M or F) > ");
            switch (gender = sc.nextLine()) {
            case "M":
               isMan = true;
                  gender = "����";
               break;
            case "F":
               isMan = false;
                  gender = "����";
               break;
            default:
               continue;
            }
            System.out.print("��������� 6�ڸ��� �Է����ּ��� (931126) > ");
//            email2 = (String.valueOf(meM.setBirth(sc.nextLine());
            birth = (sc.nextLine());
            System.out.print("�̸����� �Է����ּ��� > ");
            email = (sc.nextLine());
            System.out.println("==================================");
            System.out.println("       ������ ������ Ȯ���Ͽ� �ֽʽÿ�");
            System.out.println("�̸�         : " );
//            mMap.get(""ID"").getName(); �����ؼ�  �־��ָ� �ȴ�.
            
            System.out.println("����         : " + gender);
            System.out.println("�������   : " + birth);
            System.out.println("�̸���      : " + email);
            System.out.println("==================================");
            System.out.println("  1.����        2.�ٽ� �ۼ�");
            System.out.print("���� >  ");
            switch (sc.nextLine()) {
            case "1":
               break;
            case "2":
//               System.out.println(mMap.get("customInfo"));
//               System.out.println(mMap.size());
               continue;
            case "3":
               break;
            }
         } catch (Exception e) {
            System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���");
            continue;
         }
         break;
      }
      mMap.put("cus1", new MemberMNG("ID", "PW", "Name", isMan, birth, email));
      //mMap�� ���� �� ���� Ȯ���غ��� print
      System.out.println(mMap.get("cus1").getID()+" "+mMap.get("cus1").getPW()+" "+mMap.get("cus1").getName()+" "+mMap.get("cus1").isMan()+" "+mMap.get("cus1").getBirth()+" "+mMap.get("cus1").getEmail());
      System.out.println(mMap.size());//
   }
}