package Test1;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for(int i =0; i<n ; i++) {
			
			for(int j=n-1; j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
