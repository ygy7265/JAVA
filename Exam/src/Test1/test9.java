package Test1;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i=1; i<=9;i++) {
			
			if(i<=5) {
				count++;
			}else {
				count--;
			}
			
			for(int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
