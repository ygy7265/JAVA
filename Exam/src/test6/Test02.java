package test6;

public class Test02 {
	public static void main(String[] args) {
		boolean sign = false;
		double pi = 0;
		
		for(int i = 1; i<= 10000; i+=2) {
			if(sign == false) {
				pi += 1.0 / i;
				sign = true;
			}
			else
			{
				pi -= 1.0 / i;
				sign = false;
			}
			System.out.printf("i = %d, PI = %f \n",i,4 * pi);
		}
	}
}
