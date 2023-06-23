package Test1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year ;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 :");
		year = sc.nextInt();
		
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();
				
		System.out.print("이름을 입력하세요: ");
        name = sc.next();
      
		int age = year - birth;
		
	    System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d 입니다.", name, age);
	    sc.close();
		
		
	}

}
