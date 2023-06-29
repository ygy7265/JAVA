package sub03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/*
 * 역직렬화(DeSerialize)
 * 외부객체파일을 다시 자바 객체(인스턴스)로 생성하는 작업
 */
public class DeserializeTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Recorvery\\Desktop\\Apple.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInput ois = new ObjectInputStream(fis);
			
			//역직렬화,Object type down-casting
			Apple apple = (Apple)ois.readObject();
			apple.show();
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("END");
		
	}
}
