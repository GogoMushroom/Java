package ect;

import java.text.ParseException;

import javax.mail.MessagingException;

import Wildernessr.ReservationFix;
import Wildernessr.SendEmail;

public class main {
	public static void main(String[] args) throws ParseException, MessagingException {
		ReservationFix e = new ReservationFix();
		
		SendEmail s = new SendEmail();
		s.mail();
		
		


	}
}


 