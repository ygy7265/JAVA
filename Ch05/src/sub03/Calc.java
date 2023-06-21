package sub03;

public class Calc {
	
	//½Ì±ÛÅæ °´Ã¼
	//ÀÎ½ºÅÏ½º »ı¼º
	private static Calc instance  = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x ,int y) {
		return x-y;
	}
	public int multi(int x ,int y) {
		return x*y;
	}
	public int div(int x ,int y) {
		return x/y;
	}
	
}
