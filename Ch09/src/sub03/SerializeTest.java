package sub03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * ����ȭ
 * - ����ȭ(Serialize)�ڹ� ��ü�� ��Ʈ���� ���� �ܺ����Ϸ� �����ϴ� �۾�
 */
public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple("�ѱ�", 3000);
		
		String path = "C:\\Users\\Recorvery\\Desktop\\Apple.txt";
		
		try {
			//��ü ��Ʈ������
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//��ä ��������(����ȭ)
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
