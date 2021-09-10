package Wilderness;

import java.util.Scanner;

public class Seat {
	Scanner sc = new Scanner (System.in);
	
	
	static String SeatUp= "좌석을 업그레이드 하지 않습니다.";
	static int seatPrice =0 ;
	int Bseat = 5;
	
	
	
	//시트 업그레이드 
	///시트 업그레이드 가격은 seatPrice 에 저장된다.
	// seatPrice는 Total 클래스에서 총 결재금액 allPrice에 더해진다. 
	public void upSeat() {
		
		System.out.println("좌석을 업그레이드 하시겠습니다?");
		System.out.println("남은좌석 : " +Bseat);
		System.out.println("1.비즈니스 업그레이드 | 2.취소 ");
		
		
		String num = sc.nextLine();
		if (num.equals("1")) {
			SeatUp= "좌석을 업그레이드 했습니다.";
			System.out.println("죄석이 비즈니스로 업그레이드 되었습니다. price : 50000원");
			seatPrice += 50000;
			Bseat--;
			System.out.println("남은좌석 : " +Bseat);
		}else {
			System.out.println("좌석을 업그레이드 하지 않습니다.");
			
		}
System.out.println("추가된 요금 :" + seatPrice);	


}
	static void total() {
		TotalPlaneInfo t = new TotalPlaneInfo();
		t.total();
		
		TotalPlanePrice tp = new TotalPlanePrice();
		tp.totalPP();
	}
	
}