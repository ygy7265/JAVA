package review;

import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]array = {{95,86},{83,92,96},{78,83,93,87,88}};
		System.out.println(array.length);
		System.out.println("--------------");
		System.out.println(array[2].length);
		System.out.println("--------------");
		int[]array1 = {1,5,3,8,2};
		
		int max = array1[0];
		for(int i =0; i<array1.length;i++) {
			if(max < array1[i]) {
				max = array1[i];
				
		}
			
		}
		
		System.out.println(max);
		System.out.println("--------------");
		int sum = 0;
		int count = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				count++;
			}
		}
		double avg = sum / count;
		System.out.println(sum);
		System.out.println(avg);
		
		

		Scanner sc = new Scanner(System.in);
		int score[] = null;	
		int count1= 0;
		int sum1 = 0;
		while(true) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.student : 2.score add : 3.scoreList : 4.division : 5.exit");
			System.out.println("---------------------------------------------------------------");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Student add");
			score = new int[sc.nextInt()];
		}
		else if(choice == 2) {
			for(int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
				count1++;
			}
		}
	
		else if(choice == 3) {
			System.out.println(Arrays.toString(score));
		}
		else if(choice == 4) {
			for(int i = 0 ; i<score.length ; i++) {
				sum1 += score[i];
			}
			System.out.println(sum1/count1);
		}
		else if(choice == 5) {
			break;
		}
		
		}
	}

}
