package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * ������Ʈ��(Buffer)
 * -�⺻ ����� ��Ʈ���� Buffer �� �����ؼ� ���� ����� �����ϴ� ������Ʈ��
 * -
 */
public class BufferIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Recorvery\\Desktop\\Sample1.txt";
		String targer = "C:\\Users\\Recorvery\\Desktop\\Sample4.txt";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(targer);
			//������Ʈ��
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			while(true){
				int data = bis.read();
				if(data == -1) {
					break;
				}
				//System.out.println((char)data);
				bos.write(data);
			}
			
			
		bis.close();
		bos.flush();
		bos.close();
		fis.close();
		fos.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("END");
	}

}
