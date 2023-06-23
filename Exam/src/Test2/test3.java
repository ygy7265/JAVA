package Test2;

import java.util.Arrays;
import java.util.Iterator;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.print("\n");
		
		//배열의 원소를 역순으로 정렬
		for(int j=0; j<5; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9-j] = temp;
			
			
		}
		
		for(int n : arr) {
			System.out.print(n + ", ");
		}
	}

}
