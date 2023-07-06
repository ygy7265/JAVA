package sub02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[Client]");
		
		
		Socket socket = null;
		
		
		try {
			socket = new Socket();
			System.out.println("연결요청");
			socket.connect(new InetSocketAddress("127.0.0.1",5001));
			
			System.out.println("연결성공");
			
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server!";
			
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			System.out.println("데이터 송신완료");
			
			
			//데이터수신
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(bytes,0,readBytes,"UTF-8");
			System.out.println("데이터 수신완료");
			os.close();
			is.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("[Client] END");
	}

}
