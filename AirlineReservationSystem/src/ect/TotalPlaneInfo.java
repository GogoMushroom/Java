package ect;

public class TotalPlaneInfo {
	Example e = 
	
	
	
	String DateInfo = ("가는편 날짜"+.GoDate+"/n오는편 날짜"+df.BackDate);
	String ResInfo = (Reservation.startplace +"->"+ Reservation.arrplace+"\n");
	String SSSInfo = ("가는편비행기 :"+Reservation.Go+"\n"+"오는편비행기 :"+Reservation.Back+"\n");
	String ExtraInfo =("기내식 :"+AddExtra.Food+"\n추가 수화물 :"+AddExtra.Baggage+"\n"); 
	String SeatUpInfo = ("좌석 업그레이드:"+AddExtra.SeatUp+"\n");
	
	String totalInfo = (DateInfo+ResInfo+SSSInfo+ExtraInfo+SeatUpInfo);
			
	void total() {
		
		System.out.println();
		System.out.println();
		System.out.println();
	System.out.println(totalInfo);
}
}