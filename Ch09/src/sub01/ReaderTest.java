package sub01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * JAVA���ڽ�Ʈ��
 * -�ƽþƱ� ���ڸ� ���� �������뽺Ʈ��
 * -�����ڵ� ������� UTF-8���ڵ����� �ƽþƱ� ���� ���ڵ�
 */
public class ReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Recorvery\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Recorvery\\Desktop\\Sample3.txt";
		
		//�����Է¹޴½�Ʈ�� ����
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
				
				//���ϻ���
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
