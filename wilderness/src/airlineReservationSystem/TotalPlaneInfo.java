package airlineReservationSystem;

public class TotalPlaneInfo {
	String ResInfo = (Reservation.startplace +"->"+ Reservation.arrplace+"\n");
	String SSSInfo = ("���������� :"+SSS2.Go+"\n"+"���������� :"+SSS2.Back+"\n");
	String ExtraInfo =("�⳻�� :"+AddExtra.Food+"\n�߰� ��ȭ�� :"+AddExtra.Baggage+"\n"); 
	String SeatUpInfo = ("�¼� ���׷��̵�:"+Seat.SeatUp+"\n");
	
	String totalInfo = (ResInfo+SSSInfo+ExtraInfo+SeatUpInfo);
			
	void total() {
		System.out.println();
		System.out.println();
		System.out.println();
	System.out.println(totalInfo);
}
}