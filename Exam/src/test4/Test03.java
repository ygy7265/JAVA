package test4;

public class Test03 {
	public static void main(String[] args) {
		String fileName = "자바프로그래밍.pdf";
		
		int idx = fileName.lastIndexOf('.');
		
		String title = fileName.substring(0,idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 = " + title);
		System.out.println("확장자 = " + ext);
	
	}
}
