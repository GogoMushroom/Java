package Wilderness;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class CustomerSign {
	CustomerInfomation customer = new CustomerInfomation("헌민", true, 931126, "hhm12345@naver.com");
	CustomerInfomation customer2 = new CustomerInfomation();
	Scanner sc = new Scanner(System.in);

	// 예약자 정보 얻기
	public void customerInformation() {
		String gender = null;
				
		while (true) {
			try {
				System.out.println("예약자 정보를 입력해주세요");
				System.out.print("성별을 선택해주세요(M or F) > ");
				switch (sc.nextLine()) {
				case "M":
					customer.setMan(true);
					if(customer.isMan() == true) {
						gender = "남자";
					}
					break;
				case "F":
					customer.setMan(false);
					if(customer.isMan() == false) {
						gender = "여자";
					}
					break;
				default:
					continue;
				}
				System.out.print("성함을 입력해주세요 > ");
				customer.setName(String.valueOf(sc.nextLine()));
				System.out.print("생년월일을 6자리를 입력해주세요 (931126) > ");
				customer.setBirth(Integer.parseInt(sc.nextLine()));
				System.out.print("이메일을 입력해주세요 > ");
				customer.setEmail(sc.nextLine());
				System.out.println("==================================");
				System.out.println("       예약자 정보를 확인하여 주십시오");
				System.out.println("이름         : "+customer.getName());
				System.out.println("성별         : "+ gender);
				System.out.println("생년월일   : "+customer.getBirth());
				System.out.println("이메일      : "+customer.getEmail());
				System.out.println("==================================");
				System.out.println("  1.다음        2.다시 작성");
				System.out.print("선택 >  ");
				switch (sc.nextLine()) {
				case "1":
					//메소드호출
					break;
				case "2" :
					continue;
				case "3" :
					break;
				}
			} catch (Exception e) {
				System.out.println("입력값이 잘못되었습니다. 다시 입력해주세요");
				continue;
			}
			break;
		}
		}
	
	public void informationList() {
		List<CustomerInfomation> list = new Vector<>();
		list.add(new CustomerInfomation(customer.getName(), customer.isMan(), customer.getBirth(), customer.getEmail()));
		int birth = list.get(0).getBirth();
		String name = list.get(0).getName();
		String eMail = list.get(0).getEmail();
		System.out.println(name);
	}
		
}
