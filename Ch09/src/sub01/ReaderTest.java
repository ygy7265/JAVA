package sub01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * JAVA문자스트림
 * -아시아권 문자를 위한 문자전용스트림
 * -유니코드 기반으로 UTF-8인코딩으로 아시아권 문자 인코딩
 */
public class ReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Recorvery\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Recorvery\\Desktop\\Sample3.txt";
		
		//파일입력받는스트림 생성
		try {
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
			
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;
				}
				//int type > char type casting		
				System.out.print((char)data);
				
				//파일생성
				fw.write(data);
			}
			fr.close();
			fw.close();
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
