package sub03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/*
 * ������ȭ(DeSerialize)
 * �ܺΰ�ü������ �ٽ� �ڹ� ��ü(�ν��Ͻ�)�� �����ϴ� �۾�
 */
public class DeserializeTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Recorvery\\Desktop\\Apple.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInput ois = new ObjectInputStream(fis);
			
			//������ȭ,Object type down-casting
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
