package sub03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * 직렬화
 * - 직렬화(Serialize)자바 객체를 스트림을 통해 외부파일로 생성하는 작업
 */
public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple("한국", 3000);
		
		String path = "C:\\Users\\Recorvery\\Desktop\\Apple.txt";
		
		try {
			//객체 스트림생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객채 내보내기(직렬화)
			oos.writeObject(apple);
			
			
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END");
		
	}

}
