package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * JAVA 파일 입출력 스트림
 * -프로그램 데이터 처리와 함께 데이터 저장을 위해서 입춥력 수행
 * 
 */
public class FileIOTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Recorvery\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Recorvery\\Desktop\\Sample3.txt";
		
		//파일입력받는스트림 생성
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				//int type > char type casting		
				System.out.print((char)data);
				
				//파일생성
				fos.write(data);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("\nProgramm End");
	}
}
