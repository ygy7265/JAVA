package sub03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 * 채팅프로그램 실습
 */
public class ChatClient {
	public static void main(String[] args) {
		System.out.println("Client");
		
		Socket socket = null; 
		try {
			socket = new Socket("127.0.0.1",9001);
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadRecever(socket);
			
			t1.start();
			t2.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
