package Wildernessr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerSign {
   static Map<String, MemberMNG> mMap;
   private Scanner sc;
   MemberMNG meM = new MemberMNG("iD", "pW", "name", false, "birth", "email");
   Join ji = new Join();
   
   //맵 형태 담아준거(ID는 회원가입꺼를 가져와야된다.)
   public CustomerSign() {
      sc = new Scanner(System.in);
      mMap = new HashMap<>();
      mMap.put("ID", new MemberMNG("ID", "PW", "Name", false, "admin", "admin"));
   }
   
   // 예약자 정보 얻기
//   boolean isMan = false;
   public void customerInformation() {

   boolean isMan;   
   String gender;
   String email;
   String birth;
      
      while (true) {
         try {
            System.out.println("==================================");
            System.out.println("예약자 정보를 입력해주세요");
            System.out.print("성별을 선택해주세요(M or F) > ");
            switch (gender = sc.nextLine()) {
            case "M":
               isMan = true;
                  gender = "남자";
               break;
            case "F":
               isMan = false;
                  gender = "여자";
               break;
            default:
               continue;
            }
            System.out.print("생년월일을 6자리를 입력해주세요 (931126) > ");
//            email2 = (String.valueOf(meM.setBirth(sc.nextLine());
            birth = (sc.nextLine());
            System.out.print("이메일을 입력해주세요 > ");
            email = (sc.nextLine());
            System.out.println("==================================");
            System.out.println("       예약자 정보를 확인하여 주십시오");
            System.out.println("이름         : " );
//            mMap.get(""ID"").getName(); 구현해서  넣어주면 된다.
            
            System.out.println("성별         : " + gender);
            System.out.println("생년월일   : " + birth);
            System.out.println("이메일      : " + email);
            System.out.println("==================================");
            System.out.println("  1.다음        2.다시 작성");
            System.out.print("선택 >  ");
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
            System.out.println("입력값이 잘못되었습니다. 다시 입력해주세요");
            continue;
         }
         break;
      }
      mMap.put("cus1", new MemberMNG("ID", "PW", "Name", isMan, birth, email));
      //mMap에 값이 잘 들어갔나 확인해보는 print
      System.out.println(mMap.get("cus1").getID()+" "+mMap.get("cus1").getPW()+" "+mMap.get("cus1").getName()+" "+mMap.get("cus1").isMan()+" "+mMap.get("cus1").getBirth()+" "+mMap.get("cus1").getEmail());
      System.out.println(mMap.size());//
   }
}