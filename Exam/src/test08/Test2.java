package test08;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("str1 역순 = " + reverseStr(str1));
		System.out.println("str1 역순 = " + reverseStr(str2));
	}
	public static String reverseStr(String str) {
		StringBuilder sb = new StringBuilder();
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
		
	}

}
