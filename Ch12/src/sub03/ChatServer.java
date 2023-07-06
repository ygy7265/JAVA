package sub03;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[Server]");
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			serversocket = new ServerSocket(9001);
			System.out.println("연결대기");
			socket = serversocket.accept();
			
			System.out.println("연결수립");
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadRecever(socket);
			
			t1.start();
			t2.start();
		}catch (Exception e) {
			e.printStackTrace();
		}{
			
		}
	}

}
