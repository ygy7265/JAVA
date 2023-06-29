package sub04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * Java Properties 실습
 * 프로퍼티(Properties)
 * -문자열 데이터만 취급하는 key(key-Value) 자료구조클래스
 * -프로그램의 환경설정값을 저장할때 많이사용
 * -입출력 스트림으로 데이터 입출력하는 자료구조클래스
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
		
		//프로퍼티 파일 저장
		
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
		
		//프로퍼티 파일 읽기
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
		System.out.println("한국 : " + propcities.getProperty("한국"));
		System.out.println("미국 : " + propcities.getProperty("미국"));
		System.out.println("일본 : " + propcities.getProperty("일본"));
		System.out.println("jeju : " + propcities.getProperty("jeju"));
		System.out.println("END");
		
		
	}
}
