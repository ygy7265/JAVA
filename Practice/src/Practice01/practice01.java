package Practice01;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������� ����
				int sum3 , mi , mul , divi, result;
				int x=1;			int num = 2;		int p = 4;		int pp = 8;		int pos = 6;
				int y=2;			int num2 = 3;		int l = 5;		int pa = 4;		int postion = 4;
				sum3 = x+y;			mi = num2 - 1;		mul = 4*5;		divi = pp/pa;	result = 6%4;
				System.out.println("sum = " + sum3 + "  mi = " + mi + "  mul = " + mul + "  divi = " + divi + "  result =" + result);
				
				//���������� ����
				int num1 = 1;
				System.out.println(num1);
				num1++;
				System.out.println(num1);
				num1--;
				System.out.println(num1);
				
				
				//���տ����� ����
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
				//�ݺ��� �ȿ��� ���밡��
				for(n = 0; n < 5; n ++) {
					sum += n;		
				}
				System.out.println(sum);
				
				//�񱳿����� ����
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
				
				
				//�� ������
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
					System.out.println("���ڰ� 3���� �۽��ϴ�");
				}else if(num123<4) {
					System.out.println("���ڰ� 4 ���� �۽��ϴ�");
				}else {
					System.out.println("���ڰ� 4���� Ů�ϴ�");
				}
				
				int por = 10;
				switch(por){
					case 2:{
						System.out.println("2�Դϴ�");
						break;
					}
					case 4:{
						System.out.println("4�Դϴ�");
						break;
					}
					case 6:{
						System.out.println("6�Դϴ�");
						break;
					}
					case 8:{
						System.out.println("8�Դϴ�");
						break;
					}
					case 10:{
						System.out.println("10�Դϴ�");
						break;
						
					}
				}
				int summ12 = 0;
				for (int i = 0; i <=10; i++) {
					summ12 += i;
				
				}
	
				System.out.println("1���� 10���� �� �� =" + sum);
				
				int sumu = 0;
				int result1 = 0;
				while(sumu < 10) {
					
					if(sumu  > 4) {
						break;
						
					}
					sumu++;
					
				}
				System.out.println("����"+sumu);
				
				int i = 0;
				do {
					i += 1; 
					i++;
					
				}while(i < 12 );
				
				System.out.println(i);
	}

	
}
