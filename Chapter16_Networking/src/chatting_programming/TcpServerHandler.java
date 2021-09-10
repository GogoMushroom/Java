package chatting_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

import com.framework.TcpApplication;

/*
 * AppServer 로부터 전달받은 소캣을 이용하여 
 * 클라이언트의 접속정보 및 송수신 기능을 관리한다.
 */

public class TcpServerHandler implements Runnable {

	/*
	 * 클라이언트의 ID 를 키(K)로 하는 송신 (V)을 위한 자료구조
	 */
	public static HashMap<String, PrintWriter> sendMap = new HashMap<>();

	//클라이언트와 연결된 소캣 객체	
	private Socket sock;

	//클라이언트 IP 주소
	private String cAddr;

	//클라이언트 ID
	private String id;



	/*
	 * 생성자
	 * 받아온소켓을 앱에 저장
	 */

	public TcpServerHandler(Socket cSocket) {
		this.sock = cSocket;
		this.cAddr = sock.getInetAddress().getHostAddress();
	}

	/*
	 * 참여자 입/퇴실 관리
	 * 브로드캐스팅 
	 */
	@Override
	public void run() {
		try {
			// 1. 송신 스트림 얻기
			PrintWriter pw =new PrintWriter(
							new OutputStreamWriter(
							sock.getOutputStream())); 

			//2. 수신 스트림 얻기
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								sock.getInputStream()));

			//3.클라이언트 접속 정보 저장
			id = br.readLine();
			System.out.println(id);
			TcpServerHandler.sendMap.put(id, pw);
			
			
			//4. 브로드캐스팅
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
					"[" + id + "]님 이 들어오셨습니다.");
			System.out.println(TcpApplication.timeStamp() + cAddr + "<- connected");
			System.out.println(TcpApplication.timeStamp() + "참여인원" + sendMap.size() + "명");
			
			//5. 수신/송신
			String line = null;
			while((line = br.readLine()) != null){
				//퇴장하는 경우 
				if (line.equalsIgnoreCase("/quit")) {
					//퇴장 정보 브로드캐스팅 
					TcpServerHandler.broadCast(TcpApplication.timeStamp()
							+ "[" + id + "]님 이 나가셨습니다.");
					break;
				}
				// 귓속말하는 경우
				else if (line.indexOf("/to") > -1) {
					//귓속말 메소드 호출 
					whisper(id,line);
					
				}
				//일반 메세지 전송
				else {
					String msg =  "[" + id + "]" + " " + line;
					TcpServerHandler.broadCast(msg);
				}
			}
			
			//퇴장하는 경우 처리
			System.out.println(TcpApplication.timeStamp() +
					cAddr + "-> disconnected");
			// 맵 삭제 
			TcpServerHandler.sendMap.remove(id);
			
			System.out.println(TcpApplication.timeStamp() + "참여인원" + sendMap.size() + "명");
			
			pw.close();
			br.close();
			sock.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {

		}
	}

	/*
	 * 귓속말 전송 메서드
	 */
	private void whisper(String name,String msg) {

	}

	/*
	 * 메시지 일괄전송 메서드 
	 * :  모든 참여자에게 일괄적으로 전송 
	 */
	public static void broadCast(String message) {
		//sendMap에 여러 스레드가 접근하므로 동기화 (synchronized) 처리를 해 줘야함 
		synchronized (sendMap) {
			//접속한 모든 클라이언트들에게 메세지를 전송
			for(PrintWriter cpw: TcpServerHandler.sendMap.values()) {
				cpw.println(message);
				cpw.flush();
			}
		}
	
	}
}
