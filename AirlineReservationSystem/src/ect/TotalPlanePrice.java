package ect;


public class TotalPlanePrice {

	static int allPrice = (Reservation.price+AddExtra.addPrice+AddExtra.seatPrice) ;
	public void totalPP() {
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println(Reservation.price);
	System.out.println(AddExtra.addPrice);
	System.out.println(AddExtra.seatPrice);
	System.out.println("총 결제 가격은 "+ allPrice + "원 입니다.");
	
	}
	
}
