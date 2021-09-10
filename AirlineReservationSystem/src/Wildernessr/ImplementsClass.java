package Wildernessr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ImplementsClass implements Payment {
   private Scanner sc;
   MemberMNG meM = new MemberMNG(true, "admin", "admin"); //MemberMNG 필드들 get,set하기위한 목적으로 객체 생성
   CustomerSign custSign = new CustomerSign();
   ReservationFix rf = new ReservationFix(); //항공권 정보 가져오기 위한 목적
   public static final String COMPANY_ACCOUNT = "신한 110-369-681992, 예금주 : 광야";

   public ImplementsClass() {
      sc = new Scanner(System.in);
   }

    // 카드등록 및 카드결제 메소드
   @Override
   public void card() {
      meM.setPrice(ReservationFix.totalprice);// 최종가격
      while (true) {
         try {
            System.out.println("결제하실 카드 정보를 등록해주세요");
            System.out.print("카드사(신한,국민)를 입력해주세요 ex) > ");
            meM.setCardCompany(sc.nextLine());
            System.out.print("카드번호(-없이 숫자만)를 입력해주세요 > ");
            meM.setCardNum(Long.parseLong(sc.nextLine()));
            System.out.print("카드뒷면의 CVC번호 3자리를 입력해주세요 > ");
            meM.setCvcNum(Integer.parseInt(sc.nextLine()));
            System.out.println("카드 유효기간을 입력해주세요(mmYY) > ");
            meM.setValidity(Integer.parseInt(sc.nextLine()));
            System.out.print("할부 개월을 입력해 주세요 > ");
            meM.setInstallment(Integer.parseInt(sc.nextLine()));
         } catch (Exception e) {
            System.out.println("입력값이 형식이 잘못되었습니다. 숫자로 입력해주세요 ");
            continue;
         }
         break;
      }

      while (true) {
         System.out.println("=======================결제 정보=======================");
         System.out.print("항공권      ↓ ");
         rf.totalPlaneInfo();
         System.out.println("가격        : " + meM.getPrice() + "원");
         System.out.println("카드사     : " + meM.getCardCompany());
         System.out.println("카드번호  : " + meM.getCardNum());
         System.out.println("CVC번호 : " + meM.getCvcNum());
         System.out.println("유효기간  : " + meM.getValidity());
         System.out.println("할부개월  : " + meM.getInstallment());
         System.out.println("결제진행을 하시겠습니까?");
         System.out.println("  1.Yes   2.No");
         System.out.print("선택 > ");

         switch (sc.nextLine()) {
         case "1":
            System.out.println("결제가 완료되었습니다.");

            System.out.println("=======================결제 정보=======================");
            System.out.print("항공권      ↓ ");
            rf.totalPlaneInfo();
            System.out.println("가격        : " + meM.getPrice() + "원");//
            System.out.println("카드사     : " + meM.getCardCompany());
            System.out.println("카드번호  : " + meM.getCardNum());
            System.out.println("CVC번호 : " + meM.getCvcNum());
            System.out.println("유효기간  : " + meM.getValidity());
            System.out.println("할부개월  : " + meM.getInstallment());
            System.out.println("결제 일자 : " + TimeStamp());
            System.out.println("결제해주셔서 감사합니다 행복한 여행 되세요^^");
            break;
         case "2":
            break;
         default:
            System.out.println("입력값이 잘못되었습니다. 다시한번 확인해주세요");
            continue;
         }
         break;
      }
      System.out.println("결제시스템이 종료되었습니다.");
      while (true) {
         System.out.println("=====================================================");
         System.out.println("    1.둘러보기                   2.종료");
         System.out.print("선택 > ");
         switch (sc.nextLine()) {
         case "1":
            // 메인홈페이지 화면 메소드
            break;
         case "2":
            break;
         default:
            System.out.println("입력값이 잘못되었습니다. 다시한번 확인해주세요");
            continue;
         }
         break;
      }
   }

   //무통장입금 메소드
   @Override
   public void account() {
      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      cal.add(Calendar.DATE, +3); // 3일뒤 시간
      meM.setPrice(ReservationFix.totalprice);// 최종 가격

      try {
         System.out.println("=======================결제 정보=======================");
         System.out.println("입금계좌     : " + COMPANY_ACCOUNT);
         System.out.println("가격           : " + meM.getPrice() + "원");
          System.out.println("항공권        ↓ ");
          rf.totalPlaneInfo();
         //***입력받은 예약자의 이름 출력 값을 못찾음
//         System.out.print("탑승자 이름      : " + CustomerSign.mMap.get("cus1").getBirth());
         
         System.out.println("입금기한     : " + df.format(cal.getTime()) + "까지");
         System.out.println();
         System.out.println("즐거운 여행에 저희 광야와 함께해 주셔서 감사합니다.");
         System.out.println("위에 명시된 기한까지 입금하지 않을 경우 자동으로 예약 취소 처리 됩니다.");
         while (true) {
            System.out.println("=====================================================");
            System.out.println("    1.둘러보기                   2.종료");
            System.out.print("선택 > ");
            switch (sc.nextLine()) {
            case "1":
               break;
            case "2":
               break;
            default:
               System.out.println("입력값이 잘못되었습니다. 다시한번 확인해주세요");
               continue;
            }
            break;
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   // 결제 첫화면 메소드
   public void paymentFirstView() {
      System.out.println("----------------------------");
      System.out.println("     ★★★결제 방법을 선택하세요★★★");
      System.out.println();
      System.out.println("    1.카드결제     2.무통장입금");
      System.out.println("----------------------------");
      System.out.print("선택 > ");
   }

   // 현재시간 찍어주는 메소드
   private static String TimeStamp() {
      SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
      return format.format(new Date());// 현재 시간을 리턴할 수 있다.
   }
}