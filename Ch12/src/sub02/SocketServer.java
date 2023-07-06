package sub02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[Server]");
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1",5001));
			System.out.println("wait...");
			
			//���ϻ���
			Socket socket = serverSocket.accept();
			System.out.println("���Ἲ��");
			
			//�����ͼ۽�
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Client";
			byte [] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			//�۽ſϷ�
			System.out.println("�����ͼ۽�sucess...");
			
			//������ ���� (Client > Server)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			String result = new String(bytes,0,readBytes,"UTF-8");
			System.out.println(result);
			
			System.out.println("Data sucess �����ͼ��ſϷ�");
			os.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
		try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
		
		System.out.println("[Server] ENT");
	}

}
