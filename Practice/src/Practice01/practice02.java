package Practice01;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭����
		int[] a = {1,2,3,4,5}; //1���� �迭
		int[][] b = {{1,2,3},{4,5,6}};//2���� �迭
		int[][][] c = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};  //3���� �迭
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<=b.length;j++)
			System.out.print(" "+b[i][j]);
		}
		System.out.println();
		for(int i=0; i< c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				for(int k=0; k<c[i][j].length; k++) {
					System.out.print(" " + c[i][j][k]);
				}
			}
		}
	}

}
