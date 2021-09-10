package Wilderness;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ImplementsClass implements Payment {
	Field fd = new Field();
	Scanner sc = new Scanner(System.in);
	CustomerSign custSign = new CustomerSign();

	/*
	 * 1.결제카드정보등록 2.balance - price 3.완료화면 카드결제가 정상적으로 진행되었습니다. -- 카드결제정보 -- 항공권 :
	 * 가격 : 카드번호 : 할부개월 :
	 */
	@Override
	public void card() {
		while (true) {
			try {
				System.out.println("결제하실 카드 정보를 등록해주세요");
				System.out.print("카드사(신한,국민)를 입력해주세요 ex) > ");
				fd.setCardCompany(sc.nextLine());
				System.out.print("카드번호(-없이 숫자만)를 입력해주세요 > ");
				fd.setCardNum(Long.parseLong(sc.nextLine()));
				System.out.print("카드뒷면의 CVC번호 3자리를 입력해주세요 > ");
				fd.setCvcNum(Integer.parseInt(sc.nextLine()));
				System.out.println("카드 유효기간을 입력해주세요(mmYY) > ");
				fd.setValidity(Integer.parseInt(sc.nextLine()));
				System.out.print("할부 개월을 입력해 주세요 > ");
				fd.setInstallment(Integer.parseInt(sc.nextLine()));
			} catch (Exception e) {
				System.out.println("입력값이 형식이 잘못되었습니다. 숫자로 입력해주세요 ");
				continue;
			}
			break;
		}

		while (true) {
			System.out.println("=======================결제 정보=======================");
			System.out.println("항공권     : ");
			System.out.println("가격        : " + fd.getPrice());
			System.out.println("카드사     : " + fd.getCardCompany());
			System.out.println("카드번호  : " + fd.getCardNum());
			System.out.println("CVC번호 :" + fd.getCvcNum());
			System.out.println("유효기간  : " + fd.getValidity());
			System.out.println("할부개월  : " + fd.getInstallment());
			System.out.println("결제진행을 하시겠습니까?");
			System.out.println("  1.Yes   2.No");
			System.out.print("선택 > ");

			switch (sc.nextLine()) {
			case "1":
				if (fd.getBalance() < fd.getPrice()) {
					System.out.println("잔액이 부족합니다. 다른 카드로 결제해주세요");
				} else {
					System.out.println("결제를 진행중입니다...");
					fd.setBalance(fd.getBalance() - fd.getPrice());
					System.out.println("결제가 완료되었습니다.");

					System.out.println("=======================결제 정보=======================");
					System.out.println("항공권     : ");// 항공권
					System.out.println("가격        :");//
					System.out.println("카드사     : " + fd.getCardCompany());
					System.out.println("카드번호  : " + fd.getCardNum());
					System.out.println("CVC번호 :" + fd.getCvcNum());
					System.out.println("유효기간  : " + fd.getValidity());
					System.out.println("할부개월  : " + fd.getInstallment());
					System.out.println("결제 일자 : " + TimeStamp());
					System.out.println("결제해주셔서 감사합니다 행복한 여행 되세요^^");
				}
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

	/*
	 * 무통장입금
	 */
	@Override
	public void account() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.DATE, +3); //3일뒤 시간

		System.out.println("=======================결제 정보=======================");
		System.out.println("입금계좌     : " + fd.COMPANY_ACCOUNT);
		System.out.println("가격           : ");
		System.out.println("항공권        : ");
		System.out.print("탑승자 이름 : ");
		custSign.informationList(); //입력받은 예약자의 이름 출력 
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

	//결제 첫화면 메소드
	public void paymentFirstView() {
		System.out.println("----------------------------");
		System.out.println("     ★★★결제 방법을 선택하세요★★★");
		System.out.println();
		System.out.println("    1.카드결제     2.무통장입금");
		System.out.println("----------------------------");
		System.out.print("선택 > ");
	}

	//현재시간 찍어주는 메소드
	private static String TimeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		return format.format(new Date());// 현재 시간을 리턴할 수 있다.
	}
}
