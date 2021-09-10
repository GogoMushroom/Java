package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command =command;
		this.to =to;
	}
	
}

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> mQ = new LinkedList<>();
		
		mQ.offer(new Message("sendMail", "È«±æµ¿"));
		mQ.offer(new Message("sendSMS", "½Å¿ë±Ç"));
		mQ.offer(new Message("sendKakaotalk", "È«µÎ²²"));
		
		while(!mQ.isEmpty()) {
			Message m = mQ.poll();
			switch(m.command) {
			case"sendMail":
				System.out.println(m.to +"´Ô¿¡°Ô " + m.command);
				break;
			case"sendSMS":
				System.out.println(m.to +"´Ô¿¡°Ô " + m.command);
				break;
			case"sendKakaotalk":
				System.out.println(m.to +"´Ô¿¡°Ô " + m.command);
				break;
				
			}
		}
		
		System.out.println(0);
	}

}
