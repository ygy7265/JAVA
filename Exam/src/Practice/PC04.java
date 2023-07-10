package Practice;



import java.util.Scanner;
public class PC04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number :");
		int a = sc.nextInt();
		System.out.println("--Star--");
		for(int k=0; k<a;k++) {
			for(int i=a-1; i>=0; i--) {
				if(k<i) {
				System.out.print(" ");
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
