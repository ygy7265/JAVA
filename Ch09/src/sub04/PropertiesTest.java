package sub04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * Java Properties �ǽ�
 * ������Ƽ(Properties)
 * -���ڿ� �����͸� ����ϴ� key(key-Value) �ڷᱸ��Ŭ����
 * -���α׷��� ȯ�漳������ �����Ҷ� ���̻��
 * -����� ��Ʈ������ ������ ������ϴ� �ڷᱸ��Ŭ����
 */
public class PropertiesTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		System.out.println(prop.getProperty("A"));
		
		System.out.println(prop);
		
		String path = "C:\\Users\\Recorvery\\Desktop\\Fruit.properties";
		
		//������Ƽ ���� ����
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//������Ƽ ���� �б�
		String target = "C:\\Users\\Recorvery\\Desktop\\Cities.txt";
		Properties propcities = new Properties();
		try {
			FileReader fis = new FileReader(target);
			propcities.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(propcities);
		System.out.println("�ѱ� : " + propcities.getProperty("�ѱ�"));
		System.out.println("�̱� : " + propcities.getProperty("�̱�"));
		System.out.println("�Ϻ� : " + propcities.getProperty("�Ϻ�"));
		System.out.println("jeju : " + propcities.getProperty("jeju"));
		System.out.println("END");
		
		
	}
}
