package test05;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i=0; i<7; i++) {
			if(i<=3)
				count++;
			else
				count--;
			
			for(int j=1; j<5-count; j++)
				System.out.print("☆");
			for(int k=1; k<count*2 ;k++) 
				System.out.print("★");
			for(int j=1; j<5-count; j++)
			System.out.print("☆");
			
			System.out.print("\n");
			
		}
		System.out.print("\n");
	}

}
