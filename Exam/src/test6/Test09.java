package test6;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(3);
		pyramid(5);
		pyramid(7);
		
	}
	public static void pyramid(int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = i; j < n; j++) 
				System.out.print(" ");
			for(int k=1;k <i*2;k++) 
				System.out.print("*");
			

				System.out.print("\n");
		}
	}

}
