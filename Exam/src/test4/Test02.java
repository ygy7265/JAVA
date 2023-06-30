package test4;

import java.util.Scanner;

class NotFoundException extends Exception{
	public NotFoundException() {
		super("해당하는 숫자를 찾을수 없습니다");
	}
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8,10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을숫자입력");
		int find = sc.nextInt();
		
		try {
			searchArray(find,arr);
		
		}catch (NotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("프로그램 정상종료");
	}
		private static void searchArray(int find, int[] arr) throws NotFoundException{
			// TODO Auto-generated method stub
			for(int i : arr) {
				if(i == find) {
					return;
				}
			}
			throw new NotFoundException();
		}
}

	