package sub04;
/*
 * 날짜 :2023/06/14
 * 이름 :윤경엽
 * 내용 :JAVA반복문 while실습하기
 */

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지의 합 =" + sum);
		
		int tot = 0;
		int i = 1;
		do {
			if(i % 2 ==0) {
				tot += i;
			
			}
			i++;
			
		} while (i <= 10);
		
		System.out.println(tot);
		
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
			
		}
		
		System.out.println("5와7의 최소 공배수" + num);
		
		int total = 0;
		
		int j = 0;
		
		
		while(j <= 10) {
			j++;
			
			if(j % 2 == 1 ) {
				continue;
			}
			
			total += j;
		}
		System.out.println("total = " + total);
		
		
		
		
		
		
		
		
	}

}
