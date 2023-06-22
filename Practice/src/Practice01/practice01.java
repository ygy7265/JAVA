package Practice01;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자 연습
				int sum3 , mi , mul , divi, result;
				int x=1;			int num = 2;		int p = 4;		int pp = 8;		int pos = 6;
				int y=2;			int num2 = 3;		int l = 5;		int pa = 4;		int postion = 4;
				sum3 = x+y;			mi = num2 - 1;		mul = 4*5;		divi = pp/pa;	result = 6%4;
				System.out.println("sum = " + sum3 + "  mi = " + mi + "  mul = " + mul + "  divi = " + divi + "  result =" + result);
				
				//증감연산자 연습
				int num1 = 1;
				System.out.println(num1);
				num1++;
				System.out.println(num1);
				num1--;
				System.out.println(num1);
				
				
				//복합연산자 연습
				int n = 4;
				int sum = 2;
				sum += n ;
				System.out.println(sum);
				sum -= n;
				System.out.println(sum);
				sum *= n;
				System.out.println(sum);
				sum /= n;
				System.out.println(sum);
				//반복문 안에서 응용가능
				for(n = 0; n < 5; n ++) {
					sum += n;		
				}
				System.out.println(sum);
				
				//비교연산자 연습
				int x2 = 3;
				int y2 = 4;
				
				boolean tt = x < y;
				System.out.println(tt);
				boolean tt1 = x > y;
				System.out.println(tt1);
				boolean tt2 = x <= y;
				System.out.println(tt2);
				boolean tt3 = x >= y;
				System.out.println(tt3);
				boolean tt4 = x == y;
				System.out.println(tt4);
				
				
				//논리 연산자
				int num12 = 3;
				int num22 = 4;
				
				boolean sum2 = (num12 > 2)  && (num22 < 4);
				System.out.println(sum2);
				boolean sum33 = (num12 > 1)  && (num22 < 4);
				System.out.println(sum33);
				boolean sum4 = (num12 > 2)  || (num22 < 4);
				System.out.println(sum4);
				boolean sum5 = (num12 > 1)  || (num22 < 4);
				System.out.println(sum5);
				
				
				int num123 = 5;
				if(num123 <3) {
					System.out.println("숫자가 3보다 작습니다");
				}else if(num123<4) {
					System.out.println("숫자가 4 보다 작습니다");
				}else {
					System.out.println("숫자가 4보다 큽니다");
				}
				
				int por = 10;
				switch(por){
					case 2:{
						System.out.println("2입니다");
						break;
					}
					case 4:{
						System.out.println("4입니다");
						break;
					}
					case 6:{
						System.out.println("6입니다");
						break;
					}
					case 8:{
						System.out.println("8입니다");
						break;
					}
					case 10:{
						System.out.println("10입니다");
						break;
						
					}
				}
				int summ12 = 0;
				for (int i = 0; i <=10; i++) {
					summ12 += i;
				
				}
	
				System.out.println("1부터 10까지 의 합 =" + sum);
				
				int sumu = 0;
				int result1 = 0;
				while(sumu < 10) {
					
					if(sumu  > 4) {
						break;
						
					}
					sumu++;
					
				}
				System.out.println("총합"+sumu);
				
				int i = 0;
				do {
					i += 1; 
					i++;
					
				}while(i < 12 );
				
				System.out.println(i);
	}

	
}
