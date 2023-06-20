package sub04;
/*
 * ³¯Â¥ : 2023/06/20
 * ÀÌ¸§ : À±°æ¿±
 * ³»¿ë : ½Ì±ÛÅæ °´Ã¼¿Í ÀÎ½ºÅÏ½º °´Ã¼½Ç½À
 */

class Adder{
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() {};
	private Adder(int a4,int value) {
		x += a4;
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x,int y) {
		this.x+= x;
		y++;
	}
	public void add(int[] arr) {
		x += arr[0];
		y += arr[1];
	}
	public static void add(Adder a2) {
		a2.x += 10;
	}
	public static Adder add(Adder a3,int value) {
		return new Adder(a3.x,value);
	}
	public void show() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
public class AdderTest {
	
	public static void main(String[] args) {
		
		Adder a1 = Adder.getInstance();
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10,20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		a1 =Adder.add(a1,10);
		a1.show();
	}
}
