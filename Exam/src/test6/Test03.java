package test6;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int days = 1;
		int money = 1000;
		
		while(true) {
			sum += money;
			System.out.printf("%2d일차 : %,8d, sum = %,9d\n",days,money,sum);
			
			if(sum >= 1000000) {
				break;
			}
			
			days++;
			money += money;
		}
		System.out.printf("%d일차에 %,d원이됩니다.",days,sum);
	}

}
