package Test1;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1 + ",");
		System.out.print(n2 + ",");
		
		for(int i=1; i<=10; i++) {
			
			n3 = n1 + n2;
			
			System.out.print(n3 + ",");
			
			
			n1 = n2;
			n2 = n3;
		}
		
	
	}

}
