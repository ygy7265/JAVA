package test08;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		char c = 'A';
		float f = 3.14f;
		double d = 31.4;
		boolean b = true;
		String s = "Hello";
		
		printArgInfo(i);
		printArgInfo(c);
		printArgInfo(f);
		printArgInfo(d);
		printArgInfo(b);
		printArgInfo(s);
	}
	public static void printArgInfo(Object arg) {
		System.out.println("type = " + arg.getClass());
		System.out.println("date = " + arg.toString());
	}

}
