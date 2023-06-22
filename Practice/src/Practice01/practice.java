package Practice01;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = second();
		System.out.println(first(2));
		System.out.println();
		System.out.println(number);
		System.out.println();
		four(4);
		System.out.println();
		third();	
		
		int a[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int b=0;
		
		
		
		while(b < a.length) {
			
			int c = 0;
			
			while(c < a[b].length) {
				
				System.out.print(a[b][c]);
				c++;
			}
			b++;
		}
		
		
	}
	
	//매개변수 O 리턴값 O
	public static int first(int num1) {
		
		int num2 = 2;
		num2 += num1;
		return num2;
	}
	
	//매개변수 x 리턴값 o
	public static int second() {
		int a = 2;
		return a;
	}

	//매개변수 x 리턴값 x
	public static void third() {
		System.out.println("hello");
	}
	//매개변수 O 리턴값 x 
	public static void four(int number) {
		int num2 = 3;
		num2 += number;
		System.out.println(num2);
		
	}
	

}
