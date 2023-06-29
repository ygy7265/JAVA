package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * JAVA ���� ����� ��Ʈ��
 * -���α׷� ������ ó���� �Բ� ������ ������ ���ؼ� ����� ����
 * 
 */
public class FileIOTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Recorvery\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Recorvery\\Desktop\\Sample3.txt";
		
		//�����Է¹޴½�Ʈ�� ����
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
				
				//���ϻ���
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
