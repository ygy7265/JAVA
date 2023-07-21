package test08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Recorvery\\Desktop\\Gugudan1.txt";
		
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file);
			
			for(int x=2; x<=9; x++) {
				fw.write(x + "단" + "\r\n");
			
				for(int y=1; y<=9;y++) {
					int z = x*y;
					fw.write(x + " x " + y + " = " + z + "\r\n");
					fw.flush();
				}
				
			}
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Gugudan file create sucess..");
		
	}

}
