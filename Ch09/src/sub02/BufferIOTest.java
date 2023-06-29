package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 보조스트림(Buffer)
 * -기본 입출력 스트림에 Buffer 를 장착해서 빠른 입출력 지원하는 보조스트림
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
			//보조스트림
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
