package sub03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadRecever extends Thread{
	private Socket socket;
	
	public ThreadRecever(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader br =
	new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println("¼ö½Å" + msg);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
