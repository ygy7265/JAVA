package sub01;
/*
 * 날짜 : 2023/06/14
 * 이름 : 윤경엽
 * 내용 : JAVA 배열실습하기
 */
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		
		
		//원소출력
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println("arr1[2] = " + arr1[2]);
		System.out.println("arr2[2] = " + arr2[2]);
		System.out.println("arr3[2] = " + arr3[2]);
		
		
		//배열길이
		System.out.println("arr'1 길이 : " + arr1.length);
		
		//배열반목문
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		for(char c : arr2) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(String a : arr3) {
			System.out.print(a + " ");
		}
		
		
		//배열의 이름은 복수로 단어끝 s 붙이지 암묵적인 룰
		//1차원배열 
		
		int[] scores = {80,60,78,62,92};
		int total = 0;
		
		for(int i : scores) {
			total += i;
		}
		System.out.println(total);
		System.out.println();
		
		//2차월 배열
		int[][] arrays = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int a=0; a<3; a++) {
			for(int c = 0; c<4; c++) {
				System.out.println("arrays[" +a+ "][" +c+ "]: " + arrays[a][c]);
			}
		}
		
		//3차원 배열
		int[][][] arrays2 = {{{1,2,3},{4,5,6},{7,8,9},},{{10,11,12,13},{14,15,16},{17,18,19}},{{20,21,22},{23,24,25},{26,27,28}}};
		
		for(int a=0; a <3; a++) {
			for(int b=0; b<3; b++){
				for(int c=0; c<3; c++) {
					System.out.println("arrays2[" +a+"][" +b+ "][" +c+ "] : " + arrays2[a][b][c]);
				}
			}
		}

	}

}
